/*
 * Copyright 2012-2015 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.gmf.esb.internal.persistence;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.llom.factory.OMXMLBuilderFactory;
import org.apache.axiom.om.impl.llom.util.AXIOMUtil;
import org.apache.synapse.aspects.AspectConfiguration;
import org.apache.synapse.config.xml.rest.VersionStrategyFactory;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.api.API;
import org.apache.synapse.api.version.VersionStrategy;
import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.ecore.EObject;
import org.wso2.integrationstudio.gmf.esb.APIHandler;
import org.wso2.integrationstudio.gmf.esb.APIHandlerProperty;
import org.wso2.integrationstudio.gmf.esb.APIResource;
import org.wso2.integrationstudio.gmf.esb.APIVersionType;
import org.wso2.integrationstudio.gmf.esb.EsbNode;
import org.wso2.integrationstudio.gmf.esb.SynapseAPI;
import org.wso2.integrationstudio.gmf.esb.internal.persistence.custom.DummyHandler;
import org.wso2.integrationstudio.gmf.esb.persistence.TransformationInfo;
import org.wso2.integrationstudio.gmf.esb.persistence.TransformerException;
import org.xml.sax.SAXException;

/**
 * Synapse API transformer class
 */
public class APITransformer extends AbstractEsbNodeTransformer {

    public void transform(TransformationInfo information, EsbNode subject) throws TransformerException {
        // Check subject.
        Assert.isTrue(subject instanceof org.wso2.integrationstudio.gmf.esb.SynapseAPI, "Invalid subject.");
        org.wso2.integrationstudio.gmf.esb.SynapseAPI visualAPI = (org.wso2.integrationstudio.gmf.esb.SynapseAPI) subject;
        API api = create(visualAPI);
        if (visualAPI.isStatisticsEnabled()) {
            api.getAspectConfiguration().setStatisticsEnable(true);
        } else {
            api.getAspectConfiguration().setStatisticsEnable(false);
        }

        if (visualAPI.isTraceEnabled()) {
            api.getAspectConfiguration().setTracingEnabled(true);
        } else {
            api.getAspectConfiguration().setTracingEnabled(false);
        }
        for (APIResource apiResource : visualAPI.getResources()) {
            APIResourceTransformer tr = new APIResourceTransformer();
            information.setCurrentAPI(api);
            information.setTraversalDirection(TransformationInfo.TRAVERSAL_DIRECTION_IN);
            tr.transform(information, apiResource);
        }

        for (APIHandler handler : visualAPI.getHandlers()) {
            DummyHandler dummyHandler = new DummyHandler();
            dummyHandler.setClassName(handler.getClassName());
            for (APIHandlerProperty property : handler.getProperties()) {
                String value = property.getValue();
                String om = property.getOM();
                if (value != null) {
                    dummyHandler.addProperty(property.getName(), value);
                } else if (om != null){
                    OMElement omNode = org.apache.axiom.om.OMXMLBuilderFactory
                            .createOMBuilder(new ByteArrayInputStream(om.getBytes()))
                            .getDocumentElement();

                    dummyHandler.addProperty(property.getName(), omNode);
                }
            }

            api.addHandler(dummyHandler);
        }

        information.getSynapseConfiguration().addAPI(visualAPI.getApiName(), api);

        if (visualAPI.getCommentsList() != null) {
            api.getCommentsList().addAll(visualAPI.getCommentsList());
        }
    }

    public void createSynapseObject(TransformationInfo info, EObject subject, List<Endpoint> endPoints) {
        // nothing to do

    }

    public void transformWithinSequence(TransformationInfo information, EsbNode subject, SequenceMediator sequence)
            throws TransformerException {
        // nothing to do

    }

    public API create(SynapseAPI visualAPI) throws TransformerException {
        API api = null;
        if (visualAPI.getContext() == null || !visualAPI.getContext().startsWith("/")) {
            api = new API(visualAPI.getApiName(), "/default");
        } else {
            api = new API(visualAPI.getApiName(), visualAPI.getContext());
        }
        if (visualAPI.getHostName() != null && visualAPI.getHostName().length() > 0) {
            api.setHost(visualAPI.getHostName());
        }
        if (visualAPI.getPort() > 0) {
            api.setPort(visualAPI.getPort());
        }
        if (null != visualAPI.getVersionType()
                && !visualAPI.getVersionType().getLiteral().equals(APIVersionType.NONE.getLiteral())) {
            StringBuilder content = new StringBuilder();
            content.append("<api xmlns=\"http://ws.apache.org/ns/synapse\" version=\"");
            content.append(visualAPI.getVersion() + "\" version-type=\"");
            content.append(visualAPI.getVersionType().getLiteral() + "\" ></api>");

            OMElement apiElement;
            try {
                apiElement = AXIOMUtil.stringToOM(content.toString());
                VersionStrategy versionStrategy = VersionStrategyFactory.createVersioningStrategy(api, apiElement);
                api.setVersionStrategy(versionStrategy);
            } catch (XMLStreamException e) {
                throw new TransformerException("Unable to create the OMelement for API VersionStrategy.", e);
            }
        }
        
        if (visualAPI.getPublishSwagger() != null && !visualAPI.getPublishSwagger().getKeyValue().equals("")) {
            api.setSwaggerResourcePath(visualAPI.getPublishSwagger().getKeyValue());
        }
        api.configure(new AspectConfiguration(visualAPI.getApiName()));
        return api;
    }

}

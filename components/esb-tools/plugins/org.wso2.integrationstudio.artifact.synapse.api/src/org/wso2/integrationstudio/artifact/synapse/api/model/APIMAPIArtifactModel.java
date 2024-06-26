/*
 * Copyright (c) 2022, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.integrationstudio.artifact.synapse.api.model;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.wso2.integrationstudio.artifact.synapse.api.Activator;
import org.wso2.integrationstudio.artifact.synapse.api.exceptions.APIMConnectException;
import org.wso2.integrationstudio.artifact.synapse.api.exceptions.HttpClientException;
import org.wso2.integrationstudio.artifact.synapse.api.exceptions.InvalidTokenException;
import org.wso2.integrationstudio.artifact.synapse.api.util.ArtifactConstants;
import org.wso2.integrationstudio.artifact.synapse.api.util.HttpClientUtil;
import org.wso2.integrationstudio.logging.core.IIntegrationStudioLog;
import org.wso2.integrationstudio.logging.core.Logger;
import org.wso2.integrationstudio.platform.core.project.model.ProjectDataModel;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class APIMAPIArtifactModel extends ProjectDataModel {
    private static IIntegrationStudioLog log=Logger.getLog(Activator.PLUGIN_ID);
    
    private String userName;
    private String password;
    private String apimHostUrl;
    String selectedApiId;

    private ArrayList<PublisherAPI> apiList = new ArrayList<PublisherAPI>();
    
    
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getApimHostUrl() {
        return apimHostUrl;
    }

    public void setApimHostUrl(String apimHostUrl) {
        this.apimHostUrl = apimHostUrl;
    }
    
    public void setSelectedApiId(String selectedApiId) {
        this.selectedApiId = selectedApiId;
    }
    
    public String getSelectedApiId() {
        return selectedApiId;
    }
    
    /**
     * Get API List.
     * 
     * @param userName user name of the user
     * @param passowrd password of the user
     * @param hostUrl url of the APIM server
     * @throws HttpClientException errors during http calls
     * @throws URISyntaxException errors building request
     * @throws APIMConnectException errors connecting to APIM Server
     * @throws InvalidTokenException auth failures
     */
    public void getAPIs(String userName, String password, String hostUrl)
            throws HttpClientException, URISyntaxException, InvalidTokenException, APIMConnectException {
        JsonParser parser = new JsonParser();
        Map<String, String> headers = new HashMap<>();
        String encodedToken = Base64.getEncoder().encodeToString(
                (userName.trim() + ":" + password.trim()).getBytes());
        headers.put(ArtifactConstants.HEADERS.AUTHORIZATION,
                ArtifactConstants.HEADERS.BASIC + encodedToken);
        Map<String, String> params = new HashMap<>();
        String getAPIsURL = hostUrl.trim()+ ArtifactConstants.PublisherAPI.getAPis;
       
        String response = HttpClientUtil.sendGet(getAPIsURL, headers);
        JsonElement jsonResponse = parser.parse(response);
        int apiCount = jsonResponse.getAsJsonObject().get("count").getAsInt();
        JsonArray jsonArray = (JsonArray) jsonResponse.getAsJsonObject().get("list");
        setApiList(apiCount, jsonArray);
        
    }
    
    public String getAPISwagger(String userName, String password, String hostUrl, String apiId)
            throws HttpClientException, URISyntaxException, InvalidTokenException, APIMConnectException {
        Map<String, String> headers = new HashMap<>();
        String encodedToken = Base64.getEncoder().encodeToString(
                (userName.trim() + ":" + password).getBytes());
        headers.put(ArtifactConstants.HEADERS.AUTHORIZATION,
                ArtifactConstants.HEADERS.BASIC + encodedToken);
        Map<String, String> params = new HashMap<>();
        String getSwaggerURL = hostUrl.trim() + ArtifactConstants.PublisherAPI.getAPis + "/" + apiId + "/" + "swagger";
       
        String response = HttpClientUtil.sendGet(getSwaggerURL, headers);
        String swaggerContent = response;
        return swaggerContent;
        
    }
    
    public String getApiNameFromSwagger (String swaggerContect) {
        JsonParser parser = new JsonParser();
        JsonElement jsonResponse = parser.parse(swaggerContect);
        String apiName = jsonResponse.getAsJsonObject().get("info").getAsJsonObject()
                .get("title").getAsString();
        return apiName;
    }
    
    public void setApiList(int apiCount, JsonArray ApiArray) {
        
        for(int i=0; i< apiCount; i++) {
            PublisherAPI publisherAPI = new PublisherAPI();
            JsonObject jsonObjectApi = (JsonObject) ApiArray.get(i);
            publisherAPI.setApiId(jsonObjectApi.get("id").getAsString());
            publisherAPI.setApiName(jsonObjectApi.get("name").getAsString());
            publisherAPI.setApiVersion(jsonObjectApi.get("version").getAsString());
            publisherAPI.setApiContext(jsonObjectApi.get("context").getAsString());
            
            apiList.add(publisherAPI);
        }
    }
    
    public ArrayList<PublisherAPI> getAPIList() {
        return apiList;
    }

}

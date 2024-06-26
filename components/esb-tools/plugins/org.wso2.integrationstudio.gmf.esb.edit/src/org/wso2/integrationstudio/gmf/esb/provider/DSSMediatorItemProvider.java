/**
 * Copyright 2009-2012 WSO2, Inc. (http://wso2.com)
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
package org.wso2.integrationstudio.gmf.esb.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.wso2.integrationstudio.gmf.esb.DSSMediator;
import org.wso2.integrationstudio.gmf.esb.EsbFactory;
import org.wso2.integrationstudio.gmf.esb.EsbPackage;

/**
 * This is the item provider adapter for a {@link org.wso2.integrationstudio.gmf.esb.DSSMediator} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DSSMediatorItemProvider extends MediatorItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DSSMediatorItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addServiceNamePropertyDescriptor(object);
            addSourceTypePropertyDescriptor(object);
            addOperationTypePropertyDescriptor(object);
            addTargetTypePropertyDescriptor(object);
            addTargetPropertyPropertyDescriptor(object);
            addAvailableDataServicesPropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Service Name feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addServiceNamePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_serviceName_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_serviceName_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__SERVICE_NAME,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Source Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addSourceTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_sourceType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_sourceType_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__SOURCE_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Operation Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_operationType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_operationType_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__OPERATION_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Target Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_targetType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_targetType_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__TARGET_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Target Property feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTargetPropertyPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_targetProperty_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_targetProperty_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__TARGET_PROPERTY,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Available Data Services feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAvailableDataServicesPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_DSSMediator_availableDataServices_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_DSSMediator_availableDataServices_feature", "_UI_DSSMediator_type"),
                 EsbPackage.Literals.DSS_MEDIATOR__AVAILABLE_DATA_SERVICES,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(EsbPackage.Literals.DSS_MEDIATOR__OPERATIONS);
            childrenFeatures.add(EsbPackage.Literals.DSS_MEDIATOR__INPUT_CONNECTOR);
            childrenFeatures.add(EsbPackage.Literals.DSS_MEDIATOR__OUTPUT_CONNECTOR);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns DSSMediator.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/DSSMediator.png"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((DSSMediator)object).getServiceName();
        return label == null || label.length() == 0 ?
            getString("_UI_DSSMediator_type") :
            getString("_UI_DSSMediator_type") + " " + label;
    }


    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(DSSMediator.class)) {
            case EsbPackage.DSS_MEDIATOR__SERVICE_NAME:
            case EsbPackage.DSS_MEDIATOR__SOURCE_TYPE:
            case EsbPackage.DSS_MEDIATOR__OPERATION_TYPE:
            case EsbPackage.DSS_MEDIATOR__TARGET_TYPE:
            case EsbPackage.DSS_MEDIATOR__TARGET_PROPERTY:
            case EsbPackage.DSS_MEDIATOR__AVAILABLE_DATA_SERVICES:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case EsbPackage.DSS_MEDIATOR__OPERATIONS:
            case EsbPackage.DSS_MEDIATOR__INPUT_CONNECTOR:
            case EsbPackage.DSS_MEDIATOR__OUTPUT_CONNECTOR:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DSS_MEDIATOR__OPERATIONS,
                 EsbFactory.eINSTANCE.createAbstractDSSOperation()));

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DSS_MEDIATOR__INPUT_CONNECTOR,
                 EsbFactory.eINSTANCE.createDSSMediatorInputConnector()));

        newChildDescriptors.add
            (createChildParameter
                (EsbPackage.Literals.DSS_MEDIATOR__OUTPUT_CONNECTOR,
                 EsbFactory.eINSTANCE.createDSSMediatorOutputConnector()));
    }

}

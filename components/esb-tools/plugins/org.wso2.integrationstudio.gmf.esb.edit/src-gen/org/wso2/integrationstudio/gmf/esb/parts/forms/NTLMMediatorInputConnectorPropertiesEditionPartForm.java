/*
* Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* WSO2 Inc. licenses this file to you under the Apache License,
* Version 2.0 (the "License"); you may not use this file except
* in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/

/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.gmf.esb.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

import org.wso2.integrationstudio.gmf.esb.parts.EsbViewsRepository;
import org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart;

import org.wso2.integrationstudio.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class NTLMMediatorInputConnectorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, NTLMMediatorInputConnectorPropertiesEditionPart {

	protected ReferencesTable incomingLinks;
	protected List<ViewerFilter> incomingLinksBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> incomingLinksFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public NTLMMediatorInputConnectorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public NTLMMediatorInputConnectorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence nTLMMediatorInputConnectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		nTLMMediatorInputConnectorStep
			.addStep(EsbViewsRepository.NTLMMediatorInputConnector.Properties.class)
			.addStep(EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks);
		
		
		composer = new PartComposer(nTLMMediatorInputConnectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.NTLMMediatorInputConnector.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks) {
					return createIncomingLinksReferencesTable(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(EsbMessages.NTLMMediatorInputConnectorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	/**
	 * 
	 */
	protected Composite createIncomingLinksReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.incomingLinks = new ReferencesTable(getDescription(EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks, EsbMessages.NTLMMediatorInputConnectorPropertiesEditionPart_IncomingLinksLabel), new ReferencesTableListener	() {
			public void handleAdd() { addIncomingLinks(); }
			public void handleEdit(EObject element) { editIncomingLinks(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveIncomingLinks(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromIncomingLinks(element); }
			public void navigateTo(EObject element) { }
		});
		this.incomingLinks.setHelpText(propertiesEditionComponent.getHelpContent(EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks, EsbViewsRepository.FORM_KIND));
		this.incomingLinks.createControls(parent, widgetFactory);
		this.incomingLinks.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NTLMMediatorInputConnectorPropertiesEditionPartForm.this, EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData incomingLinksData = new GridData(GridData.FILL_HORIZONTAL);
		incomingLinksData.horizontalSpan = 3;
		this.incomingLinks.setLayoutData(incomingLinksData);
		this.incomingLinks.disableMove();
		incomingLinks.setID(EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks);
		incomingLinks.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		// Start of user code for createIncomingLinksReferencesTable

		// End of user code
		return parent;
	}

	/**
	 * 
	 */
	protected void addIncomingLinks() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(incomingLinks.getInput(), incomingLinksFilters, incomingLinksBusinessFilters,
		"incomingLinks", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NTLMMediatorInputConnectorPropertiesEditionPartForm.this, EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				incomingLinks.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveIncomingLinks(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NTLMMediatorInputConnectorPropertiesEditionPartForm.this, EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		incomingLinks.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromIncomingLinks(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(NTLMMediatorInputConnectorPropertiesEditionPartForm.this, EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		incomingLinks.refresh();
	}

	/**
	 * 
	 */
	protected void editIncomingLinks(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				incomingLinks.refresh();
			}
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart#initIncomingLinks(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initIncomingLinks(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		incomingLinks.setContentProvider(contentProvider);
		incomingLinks.setInput(settings);
		incomingLinksBusinessFilters.clear();
		incomingLinksFilters.clear();
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.NTLMMediatorInputConnector.Properties.incomingLinks);
		if (eefElementEditorReadOnlyState && incomingLinks.getTable().isEnabled()) {
			incomingLinks.setEnabled(false);
			incomingLinks.setToolTipText(EsbMessages.NTLMMediatorInputConnector_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !incomingLinks.getTable().isEnabled()) {
			incomingLinks.setEnabled(true);
		}
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart#updateIncomingLinks()
	 * 
	 */
	public void updateIncomingLinks() {
	incomingLinks.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart#addFilterIncomingLinks(ViewerFilter filter)
	 * 
	 */
	public void addFilterToIncomingLinks(ViewerFilter filter) {
		incomingLinksFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart#addBusinessFilterIncomingLinks(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToIncomingLinks(ViewerFilter filter) {
		incomingLinksBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.NTLMMediatorInputConnectorPropertiesEditionPart#isContainedInIncomingLinksTable(EObject element)
	 * 
	 */
	public boolean isContainedInIncomingLinksTable(EObject element) {
		return ((ReferencesTableSettings)incomingLinks.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.NTLMMediatorInputConnector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}

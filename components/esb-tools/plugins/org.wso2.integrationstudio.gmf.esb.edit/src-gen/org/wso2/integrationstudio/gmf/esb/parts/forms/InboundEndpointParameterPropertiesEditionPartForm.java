/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.gmf.esb.parts.forms;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
// Start of user code for imports
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.wso2.integrationstudio.gmf.esb.RegistryKeyProperty;
import org.wso2.integrationstudio.gmf.esb.parts.EsbViewsRepository;
import org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart;

import org.wso2.integrationstudio.gmf.esb.providers.EsbMessages;

// End of user code

/**
 * 
 * 
 */
public class InboundEndpointParameterPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, InboundEndpointParameterPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer inboundEndpointParameterType;
	protected Text value;
	// Start of user code  for inboundEndpointParameterKey widgets declarations
	
	// End of user code




	/**
	 * For {@link ISection} use only.
	 */
	public InboundEndpointParameterPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public InboundEndpointParameterPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence inboundEndpointParameterStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = inboundEndpointParameterStep.addStep(EsbViewsRepository.InboundEndpointParameter.Properties.class);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpointParameter.Properties.name);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpointParameter.Properties.value);
		propertiesStep.addStep(EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterKey);
		
		
		composer = new PartComposer(inboundEndpointParameterStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == EsbViewsRepository.InboundEndpointParameter.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpointParameter.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType) {
					return createInboundEndpointParameterTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == EsbViewsRepository.InboundEndpointParameter.Properties.value) {
					return createValueText(widgetFactory, parent);
				}
				// Start of user code for inboundEndpointParameterKey addToPart creation
				
				// End of user code
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
		propertiesSection.setText(EsbMessages.InboundEndpointParameterPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpointParameter.Properties.name, EsbMessages.InboundEndpointParameterPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointParameterPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpointParameter.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointParameterPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpointParameter.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointParameterPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpointParameter.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, EsbViewsRepository.InboundEndpointParameter.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpointParameter.Properties.name, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}

	
	protected Composite createInboundEndpointParameterTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType, EsbMessages.InboundEndpointParameterPropertiesEditionPart_InboundEndpointParameterTypeLabel);
		inboundEndpointParameterType = new EMFComboViewer(parent);
		GridData inboundEndpointParameterTypeData = new GridData(GridData.FILL_HORIZONTAL);
		inboundEndpointParameterType.getCombo().setLayoutData(inboundEndpointParameterTypeData);
		inboundEndpointParameterType.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		inboundEndpointParameterType.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointParameterPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInboundEndpointParameterType()));
			}

		});
		inboundEndpointParameterType.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(inboundEndpointParameterType.getCombo(), EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType);
		EditingUtils.setEEFtype(inboundEndpointParameterType.getCombo(), "eef::Combo");
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createInboundEndpointParameterTypeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createValueText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, EsbViewsRepository.InboundEndpointParameter.Properties.value, EsbMessages.InboundEndpointParameterPropertiesEditionPart_ValueLabel);
		value = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		value.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData valueData = new GridData(GridData.FILL_HORIZONTAL);
		value.setLayoutData(valueData);
		value.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							InboundEndpointParameterPropertiesEditionPartForm.this,
							EsbViewsRepository.InboundEndpointParameter.Properties.value,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointParameterPropertiesEditionPartForm.this,
									EsbViewsRepository.InboundEndpointParameter.Properties.value,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, value.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									InboundEndpointParameterPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		value.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(InboundEndpointParameterPropertiesEditionPartForm.this, EsbViewsRepository.InboundEndpointParameter.Properties.value, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, value.getText()));
				}
			}
		});
		EditingUtils.setID(value, EsbViewsRepository.InboundEndpointParameter.Properties.value);
		EditingUtils.setEEFtype(value, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(EsbViewsRepository.InboundEndpointParameter.Properties.value, EsbViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createValueText

		// End of user code
		return parent;
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
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpointParameter.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(EsbMessages.InboundEndpointParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#getInboundEndpointParameterType()
	 * 
	 */
	public Object getInboundEndpointParameterType() {
		if (inboundEndpointParameterType.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) inboundEndpointParameterType.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#initInboundEndpointParameterType(Object input, Object currentValue)
	 */
	public void initInboundEndpointParameterType(Object input, Object currentValue) {
		inboundEndpointParameterType.setInput(input);
		if (currentValue != null) {
			inboundEndpointParameterType.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#setInboundEndpointParameterType(Object newValue)
	 * 
	 */
	public void setInboundEndpointParameterType(Object newValue) {
		if (newValue != null) {
			inboundEndpointParameterType.modelUpdating(new StructuredSelection(newValue));
		} else {
			inboundEndpointParameterType.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpointParameter.Properties.inboundEndpointParameterType);
		if (eefElementEditorReadOnlyState && inboundEndpointParameterType.isEnabled()) {
			inboundEndpointParameterType.setEnabled(false);
			inboundEndpointParameterType.setToolTipText(EsbMessages.InboundEndpointParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !inboundEndpointParameterType.isEnabled()) {
			inboundEndpointParameterType.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#addFilterInboundEndpointParameterType(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInboundEndpointParameterType(ViewerFilter filter) {
		inboundEndpointParameterType.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#getValue()
	 * 
	 */
	public String getValue() {
		return value.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.wso2.integrationstudio.gmf.esb.parts.InboundEndpointParameterPropertiesEditionPart#setValue(String newValue)
	 * 
	 */
	public void setValue(String newValue) {
		if (newValue != null) {
			value.setText(newValue);
		} else {
			value.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(EsbViewsRepository.InboundEndpointParameter.Properties.value);
		if (eefElementEditorReadOnlyState && value.isEnabled()) {
			value.setEnabled(false);
			value.setToolTipText(EsbMessages.InboundEndpointParameter_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !value.isEnabled()) {
			value.setEnabled(true);
		}	
		
	}






	// Start of user code for inboundEndpointParameterKey specific getters and setters implementation
	
	// End of user code

	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return EsbMessages.InboundEndpointParameter_Part_Title;
	}

	@Override
	public RegistryKeyProperty getInboundEndpointParameterKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInboundEndpointParameterKey(RegistryKeyProperty registryKeyProperty) {
		// TODO Auto-generated method stub
		
	}

	// Start of user code additional methods
	
	// End of user code


}

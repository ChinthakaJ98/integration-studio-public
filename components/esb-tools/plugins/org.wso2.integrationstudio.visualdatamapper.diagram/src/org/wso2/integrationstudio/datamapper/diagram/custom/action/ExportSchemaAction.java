/*
 * Copyright (c) 2014-2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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

package org.wso2.integrationstudio.datamapper.diagram.custom.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.wso2.integrationstudio.datamapper.diagram.Activator;
import org.wso2.integrationstudio.datamapper.diagram.custom.util.EditorUtils;
import org.wso2.integrationstudio.datamapper.diagram.edit.parts.InputEditPart;
import org.wso2.integrationstudio.datamapper.diagram.edit.parts.OutputEditPart;
import org.wso2.integrationstudio.datamapper.diagram.edit.parts.TreeNode3EditPart;
import org.wso2.integrationstudio.datamapper.diagram.edit.parts.TreeNodeEditPart;
import org.wso2.integrationstudio.logging.core.IIntegrationStudioLog;
import org.wso2.integrationstudio.logging.core.Logger;

public class ExportSchemaAction extends AbstractActionHandler {

    private EditPart selectedEP;
    private IFile inputFile;
    private IFile inputSchemaIFile;
    private IFile outputSchemaIFile;
    private IWorkbenchPart workbenchPart;
	private static final String OUTPUT_EDITPART = "Output"; //$NON-NLS-1$
	private static final String INPUT_EDITPART = "Input"; //$NON-NLS-1$
	private static final String EXPORT_SCHEMA_ACTION_ID = "export-schema-action-id"; //$NON-NLS-1$
	private static final String FILTER_EXTENSION_TXT = "*.txt"; //$NON-NLS-1$
	private static final String FILTER_EXTENSION_AVSC = "*.json"; //$NON-NLS-1$
	private static final String MENU_TITLE = Messages.ExportSchemaAction_menuTitle;
	private static final String ERROR_WRONG_EDITPART = Messages.ExportSchemaAction_errorWrongEdipart;
	private static final String ERROR_EXPORTING_FILE = Messages.ExportSchemaAction_errorExportingSchema;
	private static final String ERROR_SAVING_FILE = Messages.ExportSchemaAction_errorSavingFile;
	private static final String FILE_DIALOG_HEADER = Messages.ExportSchemaAction_fileDialogHeader;
	private static final String WARN_NOT_SAVED_TO_FILE = Messages.ExportSchemaAction_warnNotSavedToFile;
	private static final String WARN_NO_SCHEMA = Messages.ExportSchemaAction_warnNoSchematoExport;
	private static final String WARN_TITLE = Messages.ExportSchemaAction_warnTitle;
	private static final String SCHEMA_FILE_EXTENSION = ".json";
	private static final String INPUT_SCHEMA_FILE_SUFFIX = "_inputSchema";
	private static final String OUTPUT_SCHEMA_FILE_SUFFIX = "_outputSchema";
	
	private static IIntegrationStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

	public ExportSchemaAction(IWorkbenchPart workbenchPart) {
		super(workbenchPart);

		setId(EXPORT_SCHEMA_ACTION_ID);
		setText(MENU_TITLE);
		setToolTipText(MENU_TITLE);
		ISharedImages workbenchImages = PlatformUI.getWorkbench().getSharedImages();
		setImageDescriptor(workbenchImages.getImageDescriptor(ISharedImages.IMG_TOOL_NEW_WIZARD));
		this.workbenchPart = workbenchPart;
	}

	@Override
    protected void doRun(IProgressMonitor progressMonitor) {
        selectedEP = getSelectedEditPart();
        IEditorPart editorPart = workbenchPart.getSite().getWorkbenchWindow().getActivePage().getActiveEditor();
        if (editorPart != null) {
            IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
            inputFile = input.getFile();
        }

        // selectedEP can be null when wrong editpart is selected
        if (null != selectedEP) {

            EObject treeNode = null;
            String selectedInputOutputEditPart = getSelectedInputOutputEditPart();
            String configFileName = inputFile.getName().substring(0,
                    inputFile.getName().indexOf(EditorUtils.DIAGRAM_FILE_EXTENSION));
            String newInputFilePath = configFileName + INPUT_SCHEMA_FILE_SUFFIX + SCHEMA_FILE_EXTENSION;
            String newOutputFilePath = configFileName + OUTPUT_SCHEMA_FILE_SUFFIX + SCHEMA_FILE_EXTENSION;
            inputSchemaIFile = inputFile.getProject().getFile(newInputFilePath);
            outputSchemaIFile = inputFile.getProject().getFile(newOutputFilePath);
            String exportContent = null;
            try {
                if (!selectedEP.getChildren().isEmpty()) {
                    if (INPUT_EDITPART.equals(selectedInputOutputEditPart)) {

                        // First child is always a TreeNodeEditPart
                        TreeNodeEditPart inputChildNode = (TreeNodeEditPart) selectedEP.getChildren().get(0);
                        // Returns the TreeNodeImpl object respective to
                        // inputChildNode
                        treeNode = ((Node) inputChildNode.getModel()).getElement();
                        if (inputSchemaIFile.exists()) {
                            exportContent = FileUtils
                                    .readFileToString(new File(inputSchemaIFile.getRawLocation().toString()));

                        }

                    } else {
                        // First child is always a TreeNode3EditPart
                        TreeNode3EditPart outputChildNode = (TreeNode3EditPart) selectedEP.getChildren().get(0);
                        // Returns the TreeNodeImpl object respective to
                        // outputChildNode
                        treeNode = ((Node) outputChildNode.getModel()).getElement();
                        if (outputSchemaIFile.exists()) {
                            exportContent = FileUtils
                                    .readFileToString(new File(outputSchemaIFile.getRawLocation().toString()));
                        }
                    }
                }
            } catch (IOException e) {
                log.error(ERROR_EXPORTING_FILE, e);
                IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()); // $NON-NLS-1$
                ErrorDialog.openError(Display.getCurrent().getActiveShell(), ERROR_EXPORTING_FILE, null, status);
                return;
            }

            if (treeNode != null) {
                Shell shell = Display.getDefault().getActiveShell();
                FileDialog dialog = new FileDialog(shell, SWT.SAVE);
                dialog.setFilterExtensions(new String[] { FILTER_EXTENSION_AVSC, FILTER_EXTENSION_TXT });
                dialog.setText(FILE_DIALOG_HEADER);
                String filePath = dialog.open();
                if (null != filePath) {
                    try {
                        if (exportContent != null) {
                            FileUtils.writeStringToFile(new File(filePath), exportContent);
                        }
                    } catch (IOException e) {
                        log.error(ERROR_SAVING_FILE + filePath, e);
                        IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage()); // $NON-NLS-1$
                        ErrorDialog.openError(Display.getCurrent().getActiveShell(), ERROR_SAVING_FILE + filePath, null,
                                status);
                        return;
                    }
                } else {
                    // filePath can be null when dialog is closed or an
                    // error
                    // occurred
                    log.warn(WARN_NOT_SAVED_TO_FILE);
                    return;
                }

            } else {
                MessageDialog.openInformation(Display.getCurrent().getActiveShell(), WARN_TITLE, WARN_NO_SCHEMA);
            }

        } else {
            log.error(ERROR_WRONG_EDITPART);
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, ""); //$NON-NLS-1$
            ErrorDialog.openError(Display.getCurrent().getActiveShell(), ERROR_WRONG_EDITPART, null, status);
            return;
        }

    }

	private String getSelectedInputOutputEditPart() {
		EditPart tempEP = selectedEP;
		while (!(tempEP instanceof InputEditPart) && !(tempEP instanceof OutputEditPart)) {
			tempEP = tempEP.getParent();
		}

		if (tempEP instanceof InputEditPart) {
			return INPUT_EDITPART;
		} else if (tempEP instanceof OutputEditPart) {
			return OUTPUT_EDITPART;
		} else {
			// When the selected editpart is not InputEditPart or OutputEditPart
			return null;
		}
	}

	private EditPart getSelectedEditPart() {
		IStructuredSelection selection = getStructuredSelection();
		if (selection.size() == 1) {
			Object selectedEP = selection.getFirstElement();
			if (selectedEP instanceof EditPart) {
				return (EditPart) selectedEP;
			}
		}
		// In case of selecting the wrong editpart
		return null;
	}

	@Override
	public void refresh() {
		// refresh action. Does not do anything
	}
}

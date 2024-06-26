
/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.integrationstudio.docker.distribution.editor;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

/**
 * Class responsible for creating custom wizard dialog for adding elements.
 */
public class CustomWizardDialog extends WizardDialog {

	public static final String BUILD_BUTTON = "Build Image";
	public static final String PUSH_BUTTON = "Push Image";
	public static final String BUILD_PUSH_BUTTON = "Build && Push";

	private String buttonText;

	public CustomWizardDialog(Shell parentShell, IWizard newWizard, String text) {
		super(parentShell, newWizard);
		this.buttonText = text;
	}

	@Override
	public void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		Button finishButton = getButton(IDialogConstants.FINISH_ID);
		finishButton.setText(buttonText);
	}
}

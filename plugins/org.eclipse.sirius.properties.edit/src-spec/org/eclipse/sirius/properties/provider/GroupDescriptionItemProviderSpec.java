/**
 * Copyright (c) 2016 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *
 */
package org.eclipse.sirius.properties.provider;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.sirius.properties.DynamicMappingFor;
import org.eclipse.sirius.properties.GroupConditionalStyle;
import org.eclipse.sirius.properties.GroupDescription;
import org.eclipse.sirius.properties.PropertiesFactory;
import org.eclipse.sirius.properties.PropertiesPackage;

/**
 * Subclass used to not have to modify the generated code.
 *
 * @author sbegaudeau
 */
public class GroupDescriptionItemProviderSpec extends GroupDescriptionItemProvider {

    /**
     * The constructor.
     *
     * @param adapterFactory
     *            The adapter factory
     */
    public GroupDescriptionItemProviderSpec(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    @Override
    public String getText(Object object) {
        String label = ((GroupDescription) object).getIdentifier();
        return label == null || label.length() == 0 ? getString("_UI_GroupDescription_type") : //$NON-NLS-1$
                label;
    }

    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createContainerDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createTextDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createButtonDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createLabelDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createCheckboxDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createSelectDescription()));

        DynamicMappingFor dynamicFor = PropertiesFactory.eINSTANCE.createDynamicMappingFor();
        dynamicFor.getIfs().add(PropertiesFactory.eINSTANCE.createDynamicMappingIf());
        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, dynamicFor));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createTextAreaDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createListDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createRadioDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createCustomDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONTROLS, PropertiesFactory.eINSTANCE.createHyperlinkDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__VALIDATION_SET, PropertiesFactory.eINSTANCE.createGroupValidationSetDescription()));

        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__STYLE, PropertiesFactory.eINSTANCE.createGroupStyle()));

        GroupConditionalStyle conditionalStyle = PropertiesFactory.eINSTANCE.createGroupConditionalStyle();
        conditionalStyle.setStyle(PropertiesFactory.eINSTANCE.createGroupStyle());
        newChildDescriptors.add(createChildParameter(PropertiesPackage.Literals.GROUP_DESCRIPTION__CONDITIONAL_STYLES, conditionalStyle));
    }

}
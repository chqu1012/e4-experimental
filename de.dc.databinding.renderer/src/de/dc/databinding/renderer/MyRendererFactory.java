package de.dc.databinding.renderer;
import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;

import extension.FormPart;

public class MyRendererFactory extends WorkbenchRendererFactory {

        private FormPart formPartRenderer;

        @Override
        public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {

//                if (uiElement instanceof FormPart) {
//                        if (formPartRenderer == null) {
//                        	formPartRenderer = new FormPartRenderer();
//                                super.initRenderer(formPartRenderer);
//                        }
//                        return formPartRenderer;
//                }
//
//                return super.getRenderer(uiElement, parent);
        	return null;
        }

}
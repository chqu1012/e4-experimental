package de.dc.databinding.rcp.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.swt.widgets.Composite;

import de.dc.databinding.rcp.control.TableComposite;

public class TabFolderPart {

	@PostConstruct
	public void createControls(IEclipseContext context, Composite parent) {
		TableComposite tableComposite = new TableComposite(parent, 0);
		ContextInjectionFactory.inject(tableComposite, context);
	}
}

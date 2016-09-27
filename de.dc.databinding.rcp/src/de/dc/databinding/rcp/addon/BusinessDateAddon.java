package de.dc.databinding.rcp.addon;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.eclipse.core.internal.preferences.TestHelper;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

import de.dc.databinding.rcp.control.TableComposite;

public class BusinessDateAddon {

	@PostConstruct
	public void init(IEclipseContext context) {
		Date date = ContextInjectionFactory.make(Date.class, context);
		context.set(Date.class, date);
//		TableComposite composite = ContextInjectionFactory.make(TableComposite.class, context);
//		context.set(TableComposite.class, composite);
	}
}

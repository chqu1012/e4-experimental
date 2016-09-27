package de.dc.databinding.rcp.addon;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

import de.dc.databinding.rcp.model.PersonModelProvider;

public class BusinessDateAddon {

	@PostConstruct
	public void init(IEclipseContext context) {
		Date date = ContextInjectionFactory.make(Date.class, context);
		context.set(Date.class, date);
		
		PersonModelProvider provider = ContextInjectionFactory.make(PersonModelProvider.class, context);
		context.set(PersonModelProvider.class, provider);
	}
}

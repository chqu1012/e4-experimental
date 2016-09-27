package de.dc.databinding.rcp.control;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;

public class DetailsComposite extends Composite {

	public DetailsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setText("New Button");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}

package de.dc.databinding.rcp.control;

import java.util.Date;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class TableComposite extends Composite {

	@Inject
	Date date;
	private Text sourceText;

	public TableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));
		sourceText = new Text(parent, SWT.MULTI | SWT.LEAD | SWT.BORDER);
		sourceText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
	}

	@Override
	protected void checkSubclass() {
	}

	@Inject
	@Optional
	private void subscribeTopicTodoUpdated(@UIEventTopic("TEST") String value) {
		sourceText.append(value+"\n");
	}

}

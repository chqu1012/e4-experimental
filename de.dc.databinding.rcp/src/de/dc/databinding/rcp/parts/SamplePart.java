package de.dc.databinding.rcp.parts;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.dc.databinding.rcp.model.Data;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;

public class SamplePart {
	private DataBindingContext m_bindingContext;

	private Data data = new Data();
	private Text idText;
	private Text nameText;
	private Text valueText;
	
	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		
		Label idLabel = new Label(parent, SWT.NONE);
		idLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		idLabel.setText("Id:");
		
		idText = new Text(parent, SWT.BORDER);
		idText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label nameLabel = new Label(parent, SWT.NONE);
		nameLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		nameLabel.setText("Name:");
		
		nameText = new Text(parent, SWT.BORDER);
		nameText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label valueLabel = new Label(parent, SWT.NONE);
		valueLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		valueLabel.setText("Value:");
		
		valueText = new Text(parent, SWT.BORDER);
		valueText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(parent, SWT.NONE);
		
		Button testButton = new Button(parent, SWT.NONE);
		testButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(data.getId()+", "+data.getName()+", "+data.getValue());
			}
		});
		testButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		testButton.setText("Test");
		m_bindingContext = initDataBindings();

	}

	@Focus
	public void setFocus() {
	}

	@Persist
	public void save() {
	}
	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeTextIdTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(idText);
		IObservableValue idDataObserveValue = PojoProperties.value("id").observe(data);
		bindingContext.bindValue(observeTextIdTextObserveWidget, idDataObserveValue, null, null);
		//
		IObservableValue observeTextNameTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(nameText);
		IObservableValue nameDataObserveValue = PojoProperties.value("name").observe(data);
		bindingContext.bindValue(observeTextNameTextObserveWidget, nameDataObserveValue, null, null);
		//
		IObservableValue observeTextValueTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(valueText);
		IObservableValue valueDataObserveValue = PojoProperties.value("value").observe(data);
		bindingContext.bindValue(observeTextValueTextObserveWidget, valueDataObserveValue, null, null);
		//
		return bindingContext;
	}
}
package de.dc.databinding.rcp.parts;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import de.dc.databinding.rcp.model.Data;
import de.dc.databinding.rcp.model.Person;

public class SamplePart {
	private DataBindingContext m_bindingContext;

//	private Data data = new Data();
	private Text idText;
	private Text nameText;
	private Text valueText;
	
	@Inject Date date;
	
	@Inject
	private IEventBroker broker;

	@Inject Data data;
	
	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(2, false));
		
		Label idLabel = new Label(parent, SWT.NONE);
		idLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		idLabel.setText("Age:");
		
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
		
		Button loadButton = new Button(parent, SWT.NONE);
		loadButton.setText("Load");
		loadButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		loadButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				broker.post("load/tableviewer","");
			}
		});
		
		new Label(parent, SWT.NONE);
		Button testButton = new Button(parent, SWT.NONE);
		testButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Person p = new Person();
				p.setAge(Integer.parseInt(idText.getText()));
				p.setName(nameText.getText());
				p.setNumner(valueText.getText());
				broker.post("insert/person/to/tableviewer", p);
			}
		});
		testButton.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		testButton.setText("Test");
		m_bindingContext = initDataBindings();

	}

	@Inject
	@Optional
	public void transfer(@UIEventTopic("transfer/string") String value){
		System.out.println("transfer/string");
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
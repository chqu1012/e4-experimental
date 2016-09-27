package de.dc.databinding.rcp.control;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import de.dc.databinding.rcp.model.Person;
import de.dc.databinding.rcp.model.PersonModelProvider;

public class TableComposite extends Composite {

	@Inject
	PersonModelProvider provider;
	private TableViewer tableViewer;

	public TableComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout(SWT.HORIZONTAL));

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableViewerColumn nameViewerCol = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn nameCol = nameViewerCol.getColumn();
		nameCol.setWidth(100);
		nameCol.setText("Name");
		TableViewerColumn ageViewerCol = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn ageCol = ageViewerCol.getColumn();
		ageCol.setWidth(100);
		ageCol.setText("Age");

		TableViewerColumn numberViewerCol = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn numberCol = numberViewerCol.getColumn();
		numberCol.setWidth(100);
		numberCol.setText("Number");

		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		tableViewer.setLabelProvider(new ITableLabelProvider() {
			
			@Override
			public void removeListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean isLabelProperty(Object element, String property) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void dispose() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void addListener(ILabelProviderListener listener) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getColumnText(Object element, int columnIndex) {
				Person p = (Person)element;
				switch (columnIndex) {
				case 0:
					return p.getName();
				case 1:
					return p.getAge()+"";
				case 2:
					return p.getNumner()+"";
				default:
					break;
				}
				return "";
			}
			
			@Override
			public Image getColumnImage(Object element, int columnIndex) {
				return null;
			}
		});
	}

	@Override
	protected void checkSubclass() {
	}

	@Inject
	@Optional
	private void fillTable(@UIEventTopic("load/tableviewer") String value) {
		tableViewer.setInput(provider.getPersons());
	}
	
	@Inject
	@Optional
	private void insertPerson(@UIEventTopic("insert/person/to/tableviewer") Person p) {
		provider.getPersons().add(p);
		tableViewer.refresh();
	}
}

package new_data_dialogs_and_panels;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import Controller.DbController;
import Controller.TableNames;
import model.TableElement;
import org.eclipse.wb.swing.FocusTraversalOnArray;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public abstract class NewDataAbstractDialog extends JDialog {

	protected JPanel buttonPane = new JPanel();
	protected JButton cancelButton;
	protected JButton okButton;
	
	/**
	 * Create the dialog.
	 */
	public NewDataAbstractDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}
	
	protected void addOkCancelPanel() {	
		buttonPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		{
			cancelButton = new JButton("ביטול");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			buttonPane.add(cancelButton);
		}
		{
			okButton = new JButton("OK");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					TableNames tableToUpdate = getTable();
					TableElement tableElement = packToObject();
					boolean dataSaved = DbController.saveData(getDataInMap());
					if(dataSaved){
						//open confirmation Dialog
					}
					else {
						//error message
					}
					dispose();
				}
			});
			okButton.setActionCommand("OK");
			buttonPane.add(okButton);
			getRootPane().setDefaultButton(okButton);
		}
		buttonPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{okButton, cancelButton}));
	}
	
	protected Map<TableNames, Map<String,Object>> getDataInMap(){
		Map<TableNames, Map<String,Object>> returnedList = new HashMap();
		//TODO add the items and the correct values
		return returnedList;
	}
	protected abstract TableNames getTable();

	protected abstract TableElement packToObject();

}

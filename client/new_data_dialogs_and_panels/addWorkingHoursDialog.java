package new_data_dialogs_and_panels;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.DbController;
import Controller.TableNames;
import model.TableElement;

import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addWorkingHoursDialog extends NewDataAbstractDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	/**
	 * Create the dialog.
	 */
	public addWorkingHoursDialog() {
		super();
		setBounds(100, 100, 259, 348);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("שם העובד:");
		label.setBounds(130, 34, 100, 26);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("שעת כניסה:");
		label_1.setBounds(130, 71, 100, 26);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("שעת יציאה:");
		label_2.setBounds(130, 108, 100, 26);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("שיוך לפרוייקט:");
		label_3.setBounds(130, 150, 100, 26);
		contentPanel.add(label_3);
		
		textField = new JTextField();
		textField.setBounds(34, 37, 86, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(34, 74, 86, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(34, 111, 86, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(34, 153, 86, 20);
		contentPanel.add(textField_3);
		
		JButton btnNewButton = new JButton("הזן שעות לעובד הבא");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean dataSaved = DbController.saveData(packToTableElement());
				if (dataSaved){
					dispose();
					new addWorkingHoursDialog();
				}
				else { //if failed to save the data
					//print  error message (open error dialog) and keep the dialog as is
				}			
			}
		});
		btnNewButton.setBounds(34, 187, 166, 63);
		contentPanel.add(btnNewButton);
		
		
		
		addOkCancelPanel();
		setVisible(true);
	}

	@Override
	protected TableNames getTable() {
		return null;
	}

	@Override
	protected TableElement packToTableElement() {
		return null;
	}
}

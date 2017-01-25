package new_data_dialogs_and_panels;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.TableNames;
import model.Employee;
import model_params.EmployeeType;
import model_params.Nationality;

import javax.swing.JLabel;
import java.awt.GridLayout;
import java.sql.Date;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AddEmployeeDialog extends NewDataAbstractDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField firstNametextField;
	private JFormattedTextField idNumberTextField;
	private JFormattedTextField workingPermitExpirationTextField;
	private JComboBox employeeTypeComboBox;
	private JComboBox nationalityComboBox;
	private JTextField contractorTextField;
	private JTextField lastNameTextField;
	private JTextField travelCostTextField;
	private JTextField addressTextField;
	private JTextField phoneNumberTextField;

	/**
	 * Create the dialog.
	 */
	public AddEmployeeDialog() {
		super();
		
		setBounds(100, 100, 493, 477);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("פרטי עובד חדש");
			label.setLabelFor(this);
			label.setBounds(197, 3, 196, 32);
			contentPanel.add(label);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 40, 457, 355);
		contentPanel.add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		firstNametextField = new JTextField();
		panel.add(firstNametextField);
		firstNametextField.setColumns(10);
		
		JLabel label = new JLabel("שם פרטי:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		lastNameTextField = new JTextField();
		lastNameTextField.setColumns(10);
		panel.add(lastNameTextField);
		
		JLabel label_1 = new JLabel("שם משפחה:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_1);
		
		idNumberTextField = new JFormattedTextField();
		idNumberTextField.setValue(new String(""));
		panel.add(idNumberTextField);
		idNumberTextField.setColumns(9);
		
		JLabel lblNewLabel = new JLabel("מספר זהות:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		workingPermitExpirationTextField = new JFormattedTextField();
		workingPermitExpirationTextField.setHorizontalAlignment(SwingConstants.CENTER);
		workingPermitExpirationTextField.setValue(new Date(System.currentTimeMillis()));
		panel.add(workingPermitExpirationTextField);
		workingPermitExpirationTextField.setColumns(10);
		
		JLabel label_5 = new JLabel("תוקף האישור:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_5);
		
		employeeTypeComboBox = new JComboBox();
		panel.add(employeeTypeComboBox);
		for (EmployeeType type : EmployeeType.values()){
			employeeTypeComboBox.addItem(type);
		}
		
		JLabel lblNewLabel_1 = new JLabel("סוג העובד:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		nationalityComboBox = new JComboBox();
		for (Nationality n : Nationality.values()){
			nationalityComboBox.addItem(n);
		}
		panel.add(nationalityComboBox);
		
		JLabel label_2 = new JLabel("לאום:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_2);
		
		phoneNumberTextField = new JTextField();
		panel.add(phoneNumberTextField);
		phoneNumberTextField.setColumns(10);
		
		JLabel label_3 = new JLabel("מספר טלפון:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_3);
		
		addressTextField = new JTextField();
		addressTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		addressTextField.setColumns(50);
		panel.add(addressTextField);
		
		JLabel label_7 = new JLabel("כתובת:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_7);
		
		contractorTextField = new JTextField();
		contractorTextField.setColumns(10);
		panel.add(contractorTextField);
		
		JLabel label_4 = new JLabel("קבלן מעסיק:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_4);
		
		travelCostTextField = new JTextField();
		travelCostTextField.setColumns(10);
		panel.add(travelCostTextField);
		
		JLabel label_6 = new JLabel("עלות הוצאות נסיעה:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_6);
		
		addOkCancelPanel();

		this.setVisible(true);
	}

	@Override
	protected Employee packToObject() {
		if (!validateInput()){
			//error message
		}
		return new Employee(
				firstNametextField.getText(),
				lastNameTextField.getText(),
				idNumberTextField.getText(),
				Date.valueOf(workingPermitExpirationTextField.getText()),
				(Nationality) nationalityComboBox.getSelectedItem(),
				null,
				(EmployeeType)employeeTypeComboBox.getSelectedItem(),
				phoneNumberTextField.getText(),
				addressTextField.getText(),
				contractorTextField.getText(),
				Integer.parseInt(travelCostTextField.getText()));
	}

	@Override
	protected TableNames getTable(){
		return TableNames.EMPLOYEE_TABLE;
	}

	private boolean validateInput(){
		//need to validate that the id is a nine digits number
		try {
			Integer.valueOf(idNumberTextField.getText()); // throws NumberFormatException
			Date.valueOf(workingPermitExpirationTextField.getText()); // throws IllegalArgumentException
			Nationality temp = (Nationality) nationalityComboBox.getSelectedItem(); // throws ClassCaseException
			EmployeeType temp1 = (EmployeeType)employeeTypeComboBox.getSelectedItem(); // throws ClassCastException
			Integer.parseInt(travelCostTextField.getText()); // throws NumberFormatException
		} catch (IllegalArgumentException | ClassCastException e) {
			return false;
		}
		return true;
	}
	
}

package new_data_dialogs_and_panels;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
	private JTextField textField;
	private JFormattedTextField textField_1;
	private JFormattedTextField textField_2;
	private JComboBox employeeTypeComboBox;
	private JComboBox comboBox;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

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
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("שם פרטי:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		panel.add(textField_7);
		
		JLabel label_1 = new JLabel("שם משפחה:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_1);
		
		textField_1 = new JFormattedTextField();
		textField_1.setValue(new String(""));
		panel.add(textField_1);
		textField_1.setColumns(9);
		
		JLabel lblNewLabel = new JLabel("מספר זהות:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		textField_2 = new JFormattedTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setValue(new Date(System.currentTimeMillis()));
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("תוקף האישור:");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_5);
		
		employeeTypeComboBox = new JComboBox();
		panel.add(employeeTypeComboBox);
		for (EmployeeType type : EmployeeType.values()){
			employeeTypeComboBox.addItem(type.toString());
		}
		
		JLabel lblNewLabel_1 = new JLabel("סוג העובד:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		comboBox = new JComboBox();
		for (Nationality n : Nationality.values()){
			comboBox.addItem(n.toString());
		}
		panel.add(comboBox);
		
		JLabel label_2 = new JLabel("לאום:");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_2);
		
		textField_10 = new JTextField();
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel label_3 = new JLabel("מספר טלפון:");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_3);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_9.setColumns(50);
		panel.add(textField_9);
		
		JLabel label_7 = new JLabel("כתובת:");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		panel.add(textField_6);
		
		JLabel label_4 = new JLabel("קבלן מעסיק:");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_4);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		panel.add(textField_8);
		
		JLabel label_6 = new JLabel("עלות הוצאות נסיעה:");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(label_6);
		
		addOkCancelPanel();
		
		this.setVisible(true);
	}
	
	
}

package new_data_dialogs_and_panels;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;

import Controller.TableNames;
import model.Supplier;
import model.TableElement;
import model.exception.CanNotCreateObjectException;
import model_params.PhoneNumber;

public class AddSuplierDialog extends NewDataAbstractDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField supplierNameTextField;
	private JTextField productSuppliedTextField;
	private JTextField supplierAddressTextField;
	private JTextField supplierPhoneNumberTextField;

	/**
	 * Create the dialog.
	 */
	public AddSuplierDialog() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 283, 244);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.NORTH);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			supplierNameTextField = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.gridwidth = 4;
			gbc_textField.insets = new Insets(0, 0, 5, 5);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 3;
			gbc_textField.gridy = 1;
			contentPanel.add(supplierNameTextField, gbc_textField);
			supplierNameTextField.setColumns(10);
		}
		{
			JLabel label = new JLabel("שם הספק:");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 9;
			gbc_label.gridy = 1;
			contentPanel.add(label, gbc_label);
		}
		{
			productSuppliedTextField = new JTextField();
			productSuppliedTextField.setColumns(10);
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.gridwidth = 4;
			gbc_textField_1.insets = new Insets(0, 0, 5, 5);
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 3;
			gbc_textField_1.gridy = 2;
			contentPanel.add(productSuppliedTextField, gbc_textField_1);
		}
		{
			JLabel label = new JLabel("מוצר המסופק:");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 9;
			gbc_label.gridy = 2;
			contentPanel.add(label, gbc_label);
		}
		{
			supplierAddressTextField = new JTextField();
			supplierAddressTextField.setColumns(10);
			GridBagConstraints gbc_textField_2 = new GridBagConstraints();
			gbc_textField_2.gridwidth = 4;
			gbc_textField_2.insets = new Insets(0, 0, 5, 5);
			gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_2.gridx = 3;
			gbc_textField_2.gridy = 3;
			contentPanel.add(supplierAddressTextField, gbc_textField_2);
		}
		{
			JLabel label = new JLabel("כתובת:");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 5, 5);
			gbc_label.gridx = 9;
			gbc_label.gridy = 3;
			contentPanel.add(label, gbc_label);
		}
		{
			supplierPhoneNumberTextField = new JTextField();
			supplierPhoneNumberTextField.setColumns(10);
			GridBagConstraints gbc_textField_3 = new GridBagConstraints();
			gbc_textField_3.gridwidth = 4;
			gbc_textField_3.insets = new Insets(0, 0, 0, 5);
			gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_3.gridx = 3;
			gbc_textField_3.gridy = 4;
			contentPanel.add(supplierPhoneNumberTextField, gbc_textField_3);
		}
		{
			JLabel label = new JLabel("טלפון:");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 0, 5);
			gbc_label.gridx = 9;
			gbc_label.gridy = 4;
			contentPanel.add(label, gbc_label);
		}
		
		addOkCancelPanel();
		
		setVisible(true);
	}

	@Override
	protected TableNames getTable() {
		return TableNames.SUPPLIERS;
	}

	@Override
	protected TableElement packToTableElement() throws CanNotCreateObjectException{
		if (!validateInput()){
			throw new CanNotCreateObjectException("Supplier");
		}
		String[] supplierName = supplierNameTextField.getText().split(" ");
		return new Supplier(supplierName[0], supplierName[1], supplierAddressTextField.getText(),supplierPhoneNumberTextField.getText());
	}

	private boolean validateInput(){
		try {
			PhoneNumber phoneNumber = new PhoneNumber(supplierPhoneNumberTextField.getText());
			String[] supplierName = supplierNameTextField.getText().split(" ");
			if (supplierName.length < 2){
				return false;
			}
		} catch (CanNotCreateObjectException e ){
			return false;
		}
		return true;
	}
}

package new_data_dialogs_and_panels;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.TableNames;
import model.TableElement;
import model_params.PaymentType;

import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class addPaymentDialog extends NewDataAbstractDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;


	/**
	 * Create the dialog.
	 */
	public addPaymentDialog() {
		setTitle("\u05D4\u05D6\u05E0\u05EA \u05EA\u05E9\u05DC\u05D5\u05DE\u05D9\u05DD");
		setBounds(100, 100, 450, 464);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{272, 105, 0};
		gbl_contentPanel.rowHeights = new int[]{49, 22, 22, 22, 27, 1, 27, 27, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		
		JComboBox<String> comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(PaymentType.values()));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.EAST;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 1;
		contentPanel.add(comboBox, gbc_comboBox);
		
		JLabel label = new JLabel("סוג התשלום:");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		contentPanel.add(label, gbc_label);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 2;
		contentPanel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("מקבל התשלום:");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.WEST;
		gbc_label_1.fill = GridBagConstraints.VERTICAL;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		contentPanel.add(label_1, gbc_label_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 3;
		contentPanel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("סכום:");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 3;
		contentPanel.add(label_2, gbc_label_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 4;
		contentPanel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("תאריך תשלום:");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.anchor = GridBagConstraints.WEST;
		gbc_label_3.fill = GridBagConstraints.VERTICAL;
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 4;
		contentPanel.add(label_3, gbc_label_3);
		
		JLabel label_4 = new JLabel("אופן התשלום:");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.anchor = GridBagConstraints.SOUTHWEST;
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridheight = 2;
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		contentPanel.add(label_4, gbc_label_4);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 5;
		contentPanel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 6;
		contentPanel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel label_5 = new JLabel("מספר תשלומים:");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.anchor = GridBagConstraints.NORTH;
		gbc_label_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_label_5.gridheight = 2;
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 6;
		contentPanel.add(label_5, gbc_label_5);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 0;
		gbc_textField_5.gridy = 7;
		contentPanel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel label_6 = new JLabel("שם הפרוייקט:");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.anchor = GridBagConstraints.WEST;
		gbc_label_6.fill = GridBagConstraints.VERTICAL;
		gbc_label_6.insets = new Insets(0, 0, 5, 0);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 7;
		contentPanel.add(label_6, gbc_label_6);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 0;
		gbc_textField_6.gridy = 8;
		contentPanel.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel label_7 = new JLabel("הערה:");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 0);
		gbc_label_7.fill = GridBagConstraints.BOTH;
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 8;
		contentPanel.add(label_7, gbc_label_7);
		
		
		
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

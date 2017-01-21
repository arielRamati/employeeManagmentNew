package new_data_dialogs_and_panels;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AddNewProjectDialog extends NewDataAbstractDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Create the dialog.
	 */
	public AddNewProjectDialog() {
		super();
		
		setTitle("הוסף פרוייקט חדש");
		setBounds(100, 100, 450, 500);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(90, 19, 140, 20);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 1;
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("שם הפרוייקט:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(294, 22, 128, 14);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 13;
		gbc_label.gridy = 1;
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("שם הלקוח:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(294, 58, 128, 14);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 13;
		gbc_label_1.gridy = 2;
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("כתובת הפרוייקט:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(294, 94, 128, 14);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 13;
		gbc_label_2.gridy = 3;
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("תאריך התחלה:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(294, 130, 128, 14);
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 13;
		gbc_label_3.gridy = 4;
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("תאריך סיום משוער:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(294, 166, 128, 14);
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridx = 13;
		gbc_label_4.gridy = 5;
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("תאריך סיום בפועל:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(294, 202, 128, 14);
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 13;
		gbc_label_5.gridy = 6;
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("הצעת מחיר ראשונית:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(294, 238, 128, 14);
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 0);
		gbc_label_6.gridx = 13;
		gbc_label_6.gridy = 7;
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("תוספות:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(294, 274, 128, 14);
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 0);
		gbc_label_7.gridx = 13;
		gbc_label_7.gridy = 8;
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel("סוג הפרוייקט:");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(294, 310, 128, 14);
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 13;
		gbc_label_8.gridy = 9;
		contentPanel.add(label_8);
		
		JLabel label_9 = new JLabel("הערכת עלות:");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(294, 346, 128, 14);
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 0);
		gbc_label_9.gridx = 13;
		gbc_label_9.gridy = 10;
		contentPanel.add(label_9);
		
		JLabel label_10 = new JLabel("עלות בפועל:");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setBounds(294, 382, 128, 14);
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.gridx = 13;
		gbc_label_10.gridy = 11;
		contentPanel.add(label_10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 50, 140, 20);
		contentPanel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(90, 91, 140, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(90, 127, 140, 20);
		contentPanel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(90, 163, 140, 20);
		contentPanel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(90, 199, 140, 20);
		contentPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(90, 235, 140, 20);
		contentPanel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(90, 271, 140, 20);
		contentPanel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(90, 307, 140, 20);
		contentPanel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(90, 343, 140, 20);
		contentPanel.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(90, 379, 140, 20);
		contentPanel.add(textField_10);
		
		addOkCancelPanel();
		setVisible(true);
	}
}

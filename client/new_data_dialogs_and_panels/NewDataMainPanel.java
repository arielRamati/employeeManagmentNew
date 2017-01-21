package new_data_dialogs_and_panels;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import gui_main.MithadshimMainFrame;
import gui_main.MithadshimMainPanel;
import gui_params.InsertDataOptions;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewDataMainPanel extends JPanel {

	private JComboBox<String> comboBox;
	/**
	 * Create the panel.
	 */
	public NewDataMainPanel() {
		setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, "name_823404239191932");
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("בחר מידע להוספה");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(260, 61, 139, 38);
		panel.add(lblNewLabel);
		
		comboBox = new JComboBox<String>();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				//open the relevant options
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(InsertDataOptions.values()));
		comboBox.setBounds(90, 71, 127, 20);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("להזנה לחץ כאן");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				openNewOptions((InsertDataOptions)comboBox.getSelectedItem());
			}
		});
		btnNewButton.setBounds(173, 160, 145, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("לחזרה למסך הראשי");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MithadshimMainFrame.setMainPanel(new MithadshimMainPanel());
				//MithadshimMainFrame.getMainFrame().setVisible();
			}
		});
		btnNewButton_1.setBounds(40, 224, 158, 23);
		panel.add(btnNewButton_1);
		
		//add new button edit information

	}

	private void openNewOptions(InsertDataOptions item) {

		switch (item) {
			case ADD_EMPLOYEE:
				new AddEmployeeDialog();
				break;
			case ADD_SUPPLIER:
				new AddSuplierDialog();
				break;
			case ADD_PROJECT:
				new AddNewProjectDialog();
				break;
			case ENTER_WORKING_HOURS:
				new addWorkingHoursDialog();
				break;
			case ENTER_FEE:
				new addPaymentDialog();
				break;
			default:
				break;
		}
		
	}

}

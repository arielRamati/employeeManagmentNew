package gui_main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import new_data_dialogs_and_panels.NewDataMainPanel;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MithadshimMainPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
	/**
	 * Create the panel.
	 */
	public MithadshimMainPanel() {
		setLayout(new CardLayout(0, 0));
		
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(new Rectangle(4, 40, 100, 100));
		add(panel, "name_822798581802102");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\u05E7\u05D1\u05DC\u05EA \u05E0\u05EA\u05D5\u05E0\u05D9\u05DD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(139, 159, 179, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u05D4\u05D6\u05E0\u05EA \u05DE\u05D9\u05D3\u05E2 \u05D7\u05D3\u05E9");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				changePanel(MithadshimMainFrame.getMainFrame(), new NewDataMainPanel());
			}
		});
		btnNewButton_1.setBounds(139, 78, 179, 35);
		panel.add(btnNewButton_1);	
		
		JButton btnNewButton_2 = new JButton("\u05D9\u05E6\u05D9\u05D0\u05D4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(28, 216, 128, 35);
		panel.add(btnNewButton_2);
	}
	
	public void changePanel(JFrame frame, JPanel newPanel){
		frame.getContentPane().remove(MithadshimMainFrame.getMainPanel());
		frame.getContentPane().add(newPanel);
		frame.setVisible(true);
	}

}

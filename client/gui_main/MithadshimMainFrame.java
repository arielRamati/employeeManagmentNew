package gui_main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SpringLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class MithadshimMainFrame {

	private static JFrame frame;
	private static JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MithadshimMainFrame window = new MithadshimMainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MithadshimMainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = new MithadshimMainPanel();
		frame.getContentPane().add(panel, "name_830830248252949");

	}
	
	public static JFrame getMainFrame(){
		return frame;
	}
	
	public static JPanel getMainPanel(){
		return panel;
	}
	
	private static void createFrameWithDifferentPanel(JPanel newPanel){
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		panel = newPanel;
		frame.getContentPane().add(panel, "name_830830248252949");

	}
	
	public static void setMainPanel(JPanel newPanel){
		JFrame tempFrame = frame;
		frame = null;
		tempFrame.dispose();
		createFrameWithDifferentPanel(newPanel);
		frame.setVisible(true);
	}

}

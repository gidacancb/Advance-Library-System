package Jframe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.Font;

public class WelcomtoLibSystem extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomtoLibSystem welcome = new WelcomtoLibSystem();
					welcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomtoLibSystem() {
		setResizable(false);
		setTitle("Library Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(WelcomtoLibSystem.class.getResource("/image/lib.jpg")));
		lblNewLabel.setBounds(0, 72, 621, 269);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("WELCOME TO LIBRARY SYSTEM");
		label.setFont(new Font("Tahoma", Font.BOLD, 20));
		label.setBounds(151, 29, 332, 22);
		contentPane.add(label);
	}

}

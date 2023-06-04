package personalPortfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class StartPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartPage frame = new StartPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartPage() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(255, 255, 255));
		panel.setBounds(0, -17, 639, 352);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//Sets the texts and its properties
		JLabel lblNewLabel = new JLabel("Welcome to Saludo's");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 26));
		lblNewLabel.setBounds(163, 20, 277, 66);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PERSONAL PORTFOLIO");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(52, 119, 245));
		lblNewLabel_1.setFont(new Font("Nirmala UI", Font.BOLD, 26));
		lblNewLabel_1.setBounds(163, 54, 307, 66);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("About Me");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 13));
		lblNewLabel_2.setBounds(173, 119, 66, 30);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("My Works");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 13));
		lblNewLabel_3.setBounds(173, 159, 66, 42);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("OOP Concept: Mutiple Inheritance");
		lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 13));
		lblNewLabel_4.setBounds(173, 218, 214, 13);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Brief, personal information to get to know me");
		lblNewLabel_5.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(173, 139, 292, 23);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Showcase of my previous projects");
		lblNewLabel_6.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(173, 171, 214, 52);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Features one OOP concept of Multiple Inheritance");
		lblNewLabel_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(173, 234, 305, 13);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("in the code (Multilevel Inheritance)");
		lblNewLabel_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(173, 247, 196, 13);
		panel.add(lblNewLabel_8);
		
		//JLabel placeholder for icons
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(StartPage.class.getResource("/Images/account.png")));
		lblNewLabel_9.setBounds(140, 131, 23, 23);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(StartPage.class.getResource("/Images/briefcase.png")));
		lblNewLabel_10.setBounds(140, 178, 23, 23);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon(StartPage.class.getResource("/Images/programming-language.png")));
		lblNewLabel_11.setBounds(137, 217, 23, 36);
		panel.add(lblNewLabel_11);
		
		//Sets the buttons and its properties
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage MainPage = new MainPage();
				MainPage.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBackground(new Color(52, 119, 245));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(196, 284, 227, 30);
		panel.add(btnNewButton);
	}
}
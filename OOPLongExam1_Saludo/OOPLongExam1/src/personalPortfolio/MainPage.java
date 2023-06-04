package personalPortfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
					frame.setResizable(false);
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
	public MainPage() {
		
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
		panel.setBounds(-17, -35, 657, 373);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//JLabel placeholder for my image
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainPage.class.getResource("/Images/345328948_6232431750175637_2015626760842462936_n (2).jpg")));
		lblNewLabel_1.setBounds(40, 71, 210, 270);
		panel.add(lblNewLabel_1);
		
		//Sets the texts and its properties
		JLabel lblNewLabel = new JLabel("MY PORTFOLIO");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(41, 48, 199, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("JOHN BENEDICT SALUDO");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 25));
		lblNewLabel_2.setBounds(286, 142, 319, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("IT");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(286, 211, 21, 13);
		panel.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(286, 190, 45, 4);
		panel.add(separator);
		
		//JButton to proceed in about me page
		JButton btnNewButton = new JButton("Learn More");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMePage AboutMePage = new AboutMePage();
				AboutMePage.setVisible(true);
				dispose();
				}
			});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setBounds(286, 244, 110, 32);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(246, 251, 255));
		panel_1.setBounds(247, 71, 373, 270);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("PROGRAMMER");
		lblNewLabel_4.setBounds(57, 140, 110, 13);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		//Sets the 3 navigation buttons at the top and its properties
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(366, 40, 85, 27);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ABOUT ME");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMePage AboutMePage = new AboutMePage();
				AboutMePage.setVisible(true);
				dispose();
				}
			});
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false); 
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(451, 40, 85, 27);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MY WORKS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyWorksPage MyWorksPage = new MyWorksPage();
				MyWorksPage.setVisible(true);
				dispose();
				}
			});
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.setBorderPainted(false); 
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.setBounds(535, 40, 85, 27);
		panel.add(btnNewButton_3);
	}
}

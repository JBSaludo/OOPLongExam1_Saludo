package personalPortfolio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AboutMePage2 extends JFrame {

	private JPanel contentPane;
	
	//Instantiation of the subclass that has all the inherited value from the parent class to subclasses
	MoreInfo info = new MoreInfo();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMePage2 frame = new AboutMePage2();
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
	public AboutMePage2() {
		
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
		lblNewLabel_1.setIcon(new ImageIcon(AboutMePage.class.getResource("/Images/345328948_6232431750175637_2015626760842462936_n (2).jpg")));
		lblNewLabel_1.setBounds(40, 71, 210, 270);
		panel.add(lblNewLabel_1);
		
		//Title label
		JLabel lblNewLabel = new JLabel("MY PORTFOLIO");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel.setBounds(41, 48, 199, 13);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(246, 251, 255));
		panel_1.setBounds(247, 71, 373, 270);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		//JButton to go back in the first page of about me
		JButton btnNewButton = new JButton("RETURN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMePage AboutMePage = new AboutMePage();
				AboutMePage.setVisible(true);
				dispose();
				}
			});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(236, 228, 110, 32);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		//Sets the texts and its properties
		JLabel lblNewLabel_2 = new JLabel("EDUCATION");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_2.setBounds(33, 28, 103, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CONTACT ME");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_3.setBounds(213, 95, 110, 22);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ACHIEVEMENTS");
		lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_4.setBounds(213, 30, 133, 13);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("KINDERGARTEN & ELEMENTARY");
		lblNewLabel_5.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(33, 53, 165, 13);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("JUNIOR HIGH SCHOOL");
		lblNewLabel_6.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_6.setBounds(33, 99, 133, 13);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("SENIOR HIGH SCHOOL");
		lblNewLabel_7.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_7.setBounds(33, 144, 133, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("COLLEGE & CURRENT");
		lblNewLabel_8.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_8.setBounds(33, 190, 126, 13);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("NUMBER");
		lblNewLabel_9.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_9.setBounds(213, 122, 52, 13);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("EMAIL");
		lblNewLabel_10.setFont(new Font("Nirmala UI", Font.PLAIN, 11));
		lblNewLabel_10.setBounds(213, 167, 39, 13);
		panel_1.add(lblNewLabel_10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(249, 213, 97, 2);
		panel_1.add(separator);
		
		//Data types from subclass MoreInfo that is inherited from BasicInfo class
		JLabel lblEducKinderElem = new JLabel(info.educKinderElem);
		lblEducKinderElem.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblEducKinderElem.setBounds(43, 76, 133, 13);
		panel_1.add(lblEducKinderElem);
		
		JLabel lblEducJHS = new JLabel(info.educJHS);
		lblEducJHS.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblEducJHS.setBounds(43, 121, 146, 13);
		panel_1.add(lblEducJHS);
		
		JLabel lblEducSHS = new JLabel(info.educSHS);
		lblEducSHS.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblEducSHS.setBounds(43, 167, 133, 13);
		panel_1.add(lblEducSHS);
		
		JLabel lblEducCollege = new JLabel(info.educCollege);
		lblEducCollege.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblEducCollege.setBounds(43, 209, 122, 22);
		panel_1.add(lblEducCollege);
		
		JLabel lblAchieve1 = new JLabel(info.achieve1);
		lblAchieve1.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblAchieve1.setBounds(213, 54, 133, 13);
		panel_1.add(lblAchieve1);
		
		JLabel lblAchieve2 = new JLabel(info.achieve2);
		lblAchieve2.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblAchieve2.setBounds(213, 76, 126, 13);
		panel_1.add(lblAchieve2);
		
		JLabel lblNumber = new JLabel(info.number);
		lblNumber.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblNumber.setBounds(223, 144, 82, 13);
		panel_1.add(lblNumber);
		
		JLabel lblEmail = new JLabel(info.email);
		lblEmail.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		lblEmail.setBounds(223, 186, 97, 13);
		panel_1.add(lblEmail);
		
		//Sets the 3 navigation buttons at the top and its properties
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPage MainPage = new MainPage();
				MainPage.setVisible(true);
				dispose();
				}
			});
		
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false); 
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(366, 40, 85, 27);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ABOUT ME");
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_2.setBackground(new Color(0, 0, 0));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
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
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

public class AboutMePage extends JFrame {

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
					AboutMePage frame = new AboutMePage();
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
	public AboutMePage() {
		
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
		
		//JButton to proceed in the second page of about me
		JButton btnNewButton = new JButton("SEE MORE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutMePage2 AboutMePage2 = new AboutMePage2();
				AboutMePage2.setVisible(true);
				dispose();
				}
			});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(47, 215, 110, 32);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		//Sets the texts and its properties
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_2.setBounds(47, 21, 59, 16);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BIRTHDATE");
		lblNewLabel_3.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_3.setBounds(47, 78, 97, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("AGE");
		lblNewLabel_4.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_4.setBounds(227, 21, 43, 16);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("GENDER");
		lblNewLabel_5.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_5.setBounds(227, 77, 81, 14);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("COURSE");
		lblNewLabel_6.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_6.setBounds(47, 135, 81, 16);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("WHY IT");
		lblNewLabel_7.setFont(new Font("Nirmala UI", Font.BOLD, 16));
		lblNewLabel_7.setBounds(227, 136, 68, 13);
		panel_1.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(47, 196, 97, 2);
		panel_1.add(separator);
		
		//Data types from subclass BasicInfo that is inherited from Description class
		JLabel lblName = new JLabel(info.name);
		lblName.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblName.setBounds(57, 49, 144, 13);
		panel_1.add(lblName);
		
		JLabel lblAge = new JLabel(info.age);
		lblAge.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblAge.setBounds(237, 49, 45, 13);
		panel_1.add(lblAge);
		
		JLabel lblBirthdate = new JLabel(info.birthdate);
		lblBirthdate.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblBirthdate.setBounds(57, 105, 81, 13);
		panel_1.add(lblBirthdate);
		
		JLabel lblGender = new JLabel(info.gender);
		lblGender.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblGender.setBounds(237, 105, 71, 13);
		panel_1.add(lblGender);
		
		JLabel lblCourse = new JLabel(info.course);
		lblCourse.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblCourse.setBounds(57, 164, 59, 13);
		panel_1.add(lblCourse);
		
		JLabel lblWhyIT = new JLabel(info.whyIT);
		lblWhyIT.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblWhyIT.setBounds(237, 164, 71, 13);
		panel_1.add(lblWhyIT);
		
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
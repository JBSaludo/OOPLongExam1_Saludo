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
import advancedLibrary.WelcomeToLibrary;
import gameTicTacToe.First;
import calculatorBMI.BMI;
import javax.swing.JTextArea;

public class MyWorksPage extends JFrame {

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
					MyWorksPage frame = new MyWorksPage();
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
	public MyWorksPage() {
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
		lblNewLabel_1.setIcon(new ImageIcon(MyWorksPage.class.getResource("/Images/345328948_6232431750175637_2015626760842462936_n (2).jpg")));
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
		
		//Sets the buttons to enter in my 3 previously created programs
		JButton btnNewButton = new JButton("BMI Calculator");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BMI BMI = new BMI();
				BMI.setVisible(true);
				dispose();
				}
			});
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(33, 201, 110, 32);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 0));
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("TicTacToe");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First First = new First();
				First.setVisible(true);
				dispose();
				}
			});
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 0, 0));
		btnNewButton_4.setBounds(33, 115, 110, 32);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("E-Library");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeToLibrary WelcomeToLibrary = new WelcomeToLibrary();
				WelcomeToLibrary.setVisible(true);
				dispose();
				}
			});
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setBounds(33, 32, 110, 32);
		panel_1.add(btnNewButton_5);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(33, 177, 79, 2);
		panel_1.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(255, 255, 255));
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(33, 87, 79, 2);
		panel_1.add(separator_1);
		
		//Data types from grandparent class Description
		JTextArea txtLibSys = new JTextArea(info.LibSys);
		txtLibSys.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		txtLibSys.setOpaque(false);
		txtLibSys.setBounds(171, 32, 180, 38);
		panel_1.add(txtLibSys);
		
		JTextArea txtTicTacToe = new JTextArea(info.TicTacToe);
		txtTicTacToe.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		txtTicTacToe.setOpaque(false);
		txtTicTacToe.setBounds(171, 115, 180, 43);
		panel_1.add(txtTicTacToe);
		
		JTextArea txtBMI = new JTextArea(info.BMI);
		txtBMI.setFont(new Font("Nirmala UI", Font.PLAIN, 10));
		txtBMI.setOpaque(false);
		txtBMI.setBounds(171, 201, 192, 38);
		panel_1.add(txtBMI);
		
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
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBounds(451, 40, 85, 27);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MY WORKS");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnNewButton_3.setBackground(new Color(0, 0, 0));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFocusPainted(false);
		btnNewButton_3.setBounds(535, 40, 85, 27);
		panel.add(btnNewButton_3);
	}
}

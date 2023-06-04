package calculatorBMI;

import personalPortfolio.MyWorksPage;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

public class BMI extends JFrame {

    private JTextField txtHeight;
    private JTextField txtWeight;
    private JLabel lblResult;

    public BMI() {
    	setResizable(false);
        setTitle("BMI Calculator");
        setSize(335, 321);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        JLabel lblHeight = new JLabel("Height (cm):");
        lblHeight.setBounds(57, 99, 80, 25);
        getContentPane().add(lblHeight);

        txtHeight = new JTextField();
        txtHeight.setBounds(131, 99, 120, 25);
        getContentPane().add(txtHeight);

        JLabel lblWeight = new JLabel("Weight (kg):");
        lblWeight.setBounds(57, 151, 80, 25);
        getContentPane().add(lblWeight);

        txtWeight = new JTextField();
        txtWeight.setBounds(131, 151, 120, 25);
        getContentPane().add(txtWeight);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(109, 207, 90, 25);
        getContentPane().add(btnCalculate);

        lblResult = new JLabel("");
        lblResult.setHorizontalAlignment(SwingConstants.CENTER);
        lblResult.setBounds(57, 249, 200, 25);
        getContentPane().add(lblResult);
        
        JLabel lblNewLabel = new JLabel("BMI CALCULATOR");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel.setBounds(99, 53, 124, 25);
        getContentPane().add(lblNewLabel);
        
        JButton btnNewButton = new JButton("EXIT");
        btnNewButton.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				MyWorksPage MyWorksPage = new MyWorksPage();
  				MyWorksPage.setVisible(true);
  				dispose();
  				}
  			});
        
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.setBounds(216, 10, 85, 21);
        getContentPane().add(btnNewButton);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        try {
            double height = Double.parseDouble(txtHeight.getText());
            double weight = Double.parseDouble(txtWeight.getText());

            double bmi = weight / Math.pow(height / 100, 2);

            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi < 25) {
                category = "Normal";
            } else if (bmi < 30) {
                category = "Overweight";
            } else {
                category = "Obese";
            }

            String result = "BMI: " + String.format("%.2f", bmi) + " (" + category + ")";
            lblResult.setText(result);
        } catch (NumberFormatException ex) {
            lblResult.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }
}

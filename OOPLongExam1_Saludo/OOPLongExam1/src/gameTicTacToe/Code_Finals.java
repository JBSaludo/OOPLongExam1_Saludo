package gameTicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import personalPortfolio.MyWorksPage;


public class Code_Finals extends JFrame {

        private final JButton[][] buttons = new JButton[3][3];
        private boolean playerOneTurn = true;
        private int turnsTaken = 0;
        private int playerOneWins = 0;
        private int playerTwoWins = 0;
        private final JLabel playerOneLabel;
        private final JLabel playerTwoLabel;
        JLabel textfield = new JLabel();
         JLabel player1name;
         JLabel player2name;

            public Code_Finals() {
                    
                  super("Tic Tac Toe");
                  setResizable(false);
                  setSize(600, 600);
                  setDefaultCloseOperation(EXIT_ON_CLOSE); //closing behavior ng jFrame
                  setLayout(new BorderLayout());
   
                  JPanel gameBoard = new JPanel(); //yung sa 3x3 grid
                  gameBoard.setBackground(Color.white);
                  gameBoard.setLayout(new GridLayout(3, 3, 5, 5));
                  gameBoard.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));
                  add(gameBoard, BorderLayout.CENTER);
                    
                  
                  JPanel bottomPanel = new JPanel(); //bottom panel, dito ilalagay yung reset, new game, tas exit
                  
                  bottomPanel.setPreferredSize(new Dimension(600, 50));
                  bottomPanel.setBackground(Color.decode("#F8EEDD"));
                  
                  add(bottomPanel, BorderLayout.SOUTH);
                  

                  //reset button
                  JButton resetButton = new JButton("Reset"); 
                  
                  bottomPanel.add(resetButton, BorderLayout.WEST);
                  
                  resetButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                      resetGame();

                      
                 }
          });
                  //new game button, babalik sa start game na frame or yung parang login
                  JButton newGameButton = new JButton("New Game"); 
                 
                  bottomPanel.add(newGameButton);
                  
                  newGameButton.addActionListener(new ActionListener() {
                    @Override
                    
                    public void actionPerformed(ActionEvent e) {
                        
                           dispose();
                           First login = new First(); //mapupunta ulit sa start game page 
                            login.setVisible(true);
                     
                 }
                    
                    
          });

                  //exit button
                  JButton exitButton = new JButton("Exit");
                  bottomPanel.add(exitButton, BorderLayout.EAST);
                  
                  exitButton.addActionListener(new ActionListener() {
            			public void actionPerformed(ActionEvent e) {
            				MyWorksPage MyWorksPage = new MyWorksPage();
            				MyWorksPage.setVisible(true);
            				dispose();
            				}
            			});
                  //top panel
                  JPanel topPanel = new JPanel(); //dito ilalagay yung names and scores
                  
                  topPanel.setLayout(new FlowLayout());
                  topPanel.setPreferredSize(new Dimension (600, 80));
                  topPanel.setBackground(Color.decode("#F8EEDD"));
    
                  add(topPanel, BorderLayout.NORTH);
                  
                  textfield.setFont(new Font("Gabriola", Font.BOLD, 40));
                  textfield.setForeground(Color.decode("#D97182"));
                  topPanel.add(textfield,BorderLayout.CENTER);
                  
                  player1name = new JLabel();
                  player1name.setFont(new Font("Gabriola", Font.BOLD, 40));
                  player1name.setForeground(Color.decode("#D97182"));
                  topPanel.add(player1name,BorderLayout.WEST);

                  playerOneLabel = new JLabel("(X): " + playerOneWins);
                  playerOneLabel.setFont(new Font("Gabriola", Font.BOLD, 25));
                  playerOneLabel.setForeground(Color.decode("#D97182"));
                  topPanel.add(playerOneLabel,BorderLayout.WEST);
                  
                  playerTwoLabel = new JLabel(playerTwoWins + ": (O) ");
                  playerTwoLabel.setFont(new Font("Gabriola", Font.BOLD, 25));
                  playerTwoLabel.setForeground(Color.decode("#D97182"));
                  topPanel.add(playerTwoLabel,BorderLayout.EAST);
                  
                  player2name = new JLabel();
                  player2name.setFont(new Font("Gabriola", Font.BOLD, 40));
                  player2name.setForeground(Color.decode("#D97182"));
                  topPanel.add(player2name,BorderLayout.EAST);

                  //nag iiterate yung loop through rows and columns, para mag create ng JButton kada iterate
                  for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        
                      buttons[i][j] = new JButton(); //inaadd yung button sa appropriate position sa UI
                      gameBoard.add(buttons[i][j]); //gameBoard ay container for buttons
                      buttons[i][j].addActionListener(new ButtonListener());
                      buttons[i][j].setFont(new Font("Gabriola", Font.BOLD, 60));
                      buttons[i][j].setBackground(Color.decode("#F8EEDD"));
                        
                      
                }
         }
                  
                  setVisible(true);
                }
            
                
            
            //sets an action listener sa each button
                private class ButtonListener implements ActionListener {
                  @Override
                  public void actionPerformed(ActionEvent e) { 
                      
                    
                    JButton buttonClicked = (JButton) e.getSource();
                    
                    if (buttonClicked.getText().equals("")) {
                      if (playerOneTurn) {
      
                        buttonClicked.setText("X");
                        buttonClicked.setForeground(Color.decode("#FF6962"));
                        textfield.setText("O TURN");
                        
                       
                      } else {
                          
                        buttonClicked.setText("O");
                        buttonClicked.setForeground(Color.decode("#5FA777"));
                        textfield.setText("X TURN");
                        
                    
                      }
         
                      turnsTaken++;
                      
                      if (checkForWin()) {
                          
                        if (playerOneTurn) {
                            
                          JOptionPane.showMessageDialog(Code_Finals.this,
                              "Player X Wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
                          playerOneWins++;
                          playerOneLabel.setText("(X) :" + playerOneWins);
                          resetGame();
                          
                        } else {
                            
                          JOptionPane.showMessageDialog(Code_Finals.this,
                              "Player O Wins!", "Winner!", JOptionPane.INFORMATION_MESSAGE);
                          playerTwoWins++;
                          playerTwoLabel.setText( playerTwoWins + ": (O)" );
                          resetGame();
                          
                        }
                        
                      } else if (turnsTaken == 9) {
                          
                        JOptionPane.showMessageDialog(Code_Finals.this,
                            "Draw!", "Tie Game!", JOptionPane.INFORMATION_MESSAGE);
                        resetGame();
                      }
                     
                      playerOneTurn = !playerOneTurn; //nag iindicate the other player's turn na
                      
               }
           }
    }

                private boolean checkForWin() {
                    
                  for (int i = 0; i < 3; i++) {
                    if (checkRowWin(i) || checkColumnWin(i) || checkDiagonalWin()) {
                      return true;
                      
                    }
                  }
                  
                  return false;
                }

                private boolean checkRowWin(int row) {
                    
                  return checkLineEquality(buttons[row][0].getText(),
                      buttons[row][1].getText(), buttons[row][2].getText());
                  
                }

                private boolean checkColumnWin(int column) {
                    
                  return checkLineEquality(buttons[0][column].getText(),
                      buttons[1][column].getText(), buttons[2][column].getText());
                  
                }

                private boolean checkDiagonalWin() {
                    
                  return checkLineEquality(buttons[0][0].getText(),
                      buttons[1][1].getText(), buttons[2][2].getText())
                      || checkLineEquality(buttons[0][2].getText(),
                      buttons[1][1].getText(), buttons[2][0].getText());
                  
                }
                
                //pang help sa checkForWin() na method, chincheck kung yung 3 strings ay equal at not empty
                private boolean checkLineEquality(String s1, String s2, String s3) {
                  return !s1.equals("") && s1.equals(s2) && s2.equals(s3);
                  
                }

                private void resetGame() {
  
                  turnsTaken = 0;
                  for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                      buttons[i][j].setText("");
                      
                  }
             }                           
       }
                   
                
                public static void main(String[] args) {
  
            Code_Finals ticTacToe = new Code_Finals();
            
              }
      }



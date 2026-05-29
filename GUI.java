/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hangmangame;

/**
 *
 * @author 240748115
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
        
public class GUI implements ActionListener{
    JFrame frame = new JFrame();
    String secretWord = "APPLE";
    String hiddenWord = "-----";
    int attempts = 5;
    JLabel wordLabel = new JLabel(hiddenWord);
    JLabel attemptsLabel = new JLabel("Attempts left:" + attempts);
    JLabel titleLabel = new JLabel("HANGMAN GAME");
    JTextField txt = new JTextField ();
    JButton btn = new JButton ("Guess");
    ArrayList<String> guessedLetters = new ArrayList<String>();
    public GUI(){
        frame.setTitle("Hangman Game");
        frame.setSize(600, 500);
        frame.setLayout(null);
        frame.add(btn);
        frame.add(wordLabel);
        frame.add(attemptsLabel);
        frame.add(titleLabel);
        frame.add(txt);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        wordLabel.setBounds(50,80,200,20);
        attemptsLabel.setBounds(50,120,100,25);
        titleLabel.setBounds(100,20,200,30);
        txt.setBounds(50, 170, 100, 15);
        btn.setBounds(25,170,50,25);
        btn.addActionListener (this);
        frame.setVisible(true);
    }   
    @Override
    public void actionPerformed(ActionEvent e){
       String guess = txt.getText().toUpperCase();
       
       if (guess.isEmpty()){
           JOptionPane.showMessageDialog(null,"Invalid input");
           txt.setText("");
           return;
       }
       if(guess.length() > 1){
    JOptionPane.showMessageDialog
    (null,"Enter one letter only");
     return;
       }
        if(guessedLetters.contains(guess)){
    JOptionPane.showMessageDialog
    (null,"Letter already guessed");
        return;
        }
    guessedLetters.add(guess);
        boolean found = false;
        String newHiddenWord = "";
        for (int i = 0; i<secretWord.length(); i++){
          if(secretWord.charAt(i) == guess.charAt(0)) {
              found = true;
              newHiddenWord = newHiddenWord + secretWord.charAt(i);
              System.out.println("Match found at position" + i); }
          else{
             newHiddenWord = newHiddenWord + hiddenWord.charAt(i);
          }
    }
        hiddenWord = newHiddenWord;
        wordLabel.setText(hiddenWord);
           if (found == false){
             attempts--;
             attemptsLabel.setText("Attempts left:" + attempts);
           }
        if(hiddenWord.equals(secretWord){
          JOptionPane.showMessageDialog(null ,"You won!");
        }
    if (attempts == 0){
            JOptionPane.showMessageDialog(null,"Game over!");
    }
            
    }

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
JLabel enterGuess, tooHighLow, lastGuess;
JTextField userGuess;
JButton guessButton, playAgainButton;
Random r = new Random();
int randomInt;

GuessingGame() {
  
Random r = new Random ();
int randomInt = r.nextInt(100) +1;
JFrame frame = new JFrame ("Guessing Game!");
frame.setLayout(new FlowLayout());
frame.setSize(240,120);

guessButton = new JButton ("Button");
playAgainButton = new JButton ("Play Again");

userGuess = new JTextField(10);

userGuess.setActionCommand("myTF");

enterGuess = new JLabel("Enter Guess: ");
tooHighLow = new JLabel("");
lastGuess = new JLabel("");

frame.add(userGuess);
frame.add(guessButton);
frame.add(playAgainButton);
frame.add(enterGuess);
frame.add(tooHighLow);
frame.add(lastGuess);

userGuess.addActionListener(this);
guessButton.addActionListener(this);
playAgainButton.addActionListener(this);

frame.setVisible(true);

 }
public void actionPerformed (ActionEvent ae) {
  int guess = Integer.parseInt(userGuess.getText());
  if (guess > randomInt)
  tooHighLow.setText("Too High!");

  if(guess < randomInt)
  tooHighLow.setText("Too Low!");

  if (guess == randomInt)
  tooHighLow.setText("You Guessed It!");
  lastGuess.setText("Last Guess Was: " + userGuess);

  if(ae.getActionCommand().equals("Play Again")) {
    randomInt = r.nextInt(100) +1;
    enterGuess.setText("Enter Guess: ");
    tooHighLow.setText("");
    lastGuess.setText("");
// I'll probably be back to see you again next class because i am stuck on why it doesnt like this else if statement!
  else if {
    enterGuess.setText("You pressed ENTER. Please press the Guess Button");
  }
  }
  }
}
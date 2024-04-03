package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		String answer1 = JOptionPane.showInputDialog("What's the biggest species of shark?");
		if (answer1.equals("whale shark")) {
			score = score + 1;
		}
		String answer2 = JOptionPane.showInputDialog("What's a baby shark called?");
		if (answer2.equals("a pup")) {
			score = score + 1;
		}
		String answer3 = JOptionPane.showInputDialog("What's the only species of shark that can live in fresh water?");
		if (answer3.equals("bull shark")) {
			score = score + 1;
		}
		String answer4 = JOptionPane.showInputDialog("How many rows of teeth do most sharks have?");
		if (answer4.equals("five")) { 
			score = score + 1;
		}
		String answer5 = JOptionPane.showInputDialog("What organ helps sharks float?");
		if (answer5.equals("liver")) {
			score = score + 1;
		}
		
		JOptionPane.showMessageDialog(null, "your final score is " + score + "/5.");
		
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}

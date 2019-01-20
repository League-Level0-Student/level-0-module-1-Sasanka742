package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
		int Score = 0;

		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle1 = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		String riddle2 = JOptionPane.showInputDialog("I'm tall when I'm young and I'm short when I'm old. What am I?");
	

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddle1.equals("coin")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score = Score + 1;

		// 5. Otherwise, say "wrong" and tell them the answer
		}else {
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is coin");
			
		}
		// 6. Add some more riddles
		if(riddle2.equals("candle")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			Score = Score + 1;
		// 2. Make a pop up to show the score.
		}else {
			JOptionPane.showMessageDialog(null, "Wrong, the correct answer is a candle");
		}
		JOptionPane.showMessageDialog(null, Score);
	}
}


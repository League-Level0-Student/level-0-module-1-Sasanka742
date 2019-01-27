package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Max = "sleeping";
		String Joker = "laughing";

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Name = JOptionPane.showInputDialog("Enter a name:");
		if(Name.equals("Max")) {
			JOptionPane.showMessageDialog(null, "Max's superpower is "+Max+".");
		}else if(Name.equals("Joker")) {
			JOptionPane.showMessageDialog(null, "Joker's superpower is "+Joker+".");
		}

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}


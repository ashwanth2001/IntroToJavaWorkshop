package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		int a = 0;
		String answer;
		answer = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "You will rule the world!");
			a++;
		}
if(answer.equalsIgnoreCase("not yet")) {
	JOptionPane.showMessageDialog(null, "Then start learnin'!");
	a++;
}
		// 3. Otherwise, wish them good luck washing dishes.
if(a<1){
	JOptionPane.showMessageDialog(null, "Good luck washing dishes.");
	}
}
}
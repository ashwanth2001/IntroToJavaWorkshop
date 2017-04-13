	// Copyright Wintriss Technical Schools 2013
	import java.util.Random;

import javax.swing.JOptionPane;

	public class MagicEightBall {

		// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int a = new Random().nextInt(4);
		// 3. Print out this variable
System.out.println(a);
		// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog("Type in a Question.");
		// 5. If the random number is 0
		// -- tell the user "Yes"
if (a == 0){
	JOptionPane.showMessageDialog(null, "Yes");
}
		// 6. If the random number is 1
		// -- tell the user "No"
if (a == 1){
		JOptionPane.showMessageDialog(null, "No");
}
		// 7. If the random number is 2
		// -- tell the user "Maybe you should ask Google?"
if (a == 2){
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
}
		// 8. If the random number is 3
		// -- write your own answer
if (a == 3){
		JOptionPane.showInputDialog("Write your own answer!");
}
}
	}
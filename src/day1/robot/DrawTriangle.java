package day1.robot;

	import javax.swing.JOptionPane;
	import org.jointheleague.graphical.robot.Robot;
public class DrawTriangle {
	
		// 2. Create a new Robot
		Robot bob = new Robot();

		void go() {
			// 4. Make the robot move as fast as possible
	bob.setSpeed(10);
			// 5. Set the pen width to 5
	bob.setPenWidth(5);
			// 6. Do steps #7 to #8 four times...
	for (int i = 0; i < 6; i++) {
		
				// 7. Set the pen color to random
		bob.setRandomPenColor();
				// 1. Call the drawSquare() method
		drawSquare();
				// 8. Turn the robot 90 degrees to the right
	bob.turn(60);
		}
		}
		/* 3. Fill in the code to draw a square inside the method below. */
		void drawSquare() {
			bob.penDown();
			bob.move(90);
			bob.turn(120);
			bob.move(90);
			bob.turn(120);
			bob.move(90);
			bob.turn(120);
		}

		public static void main(String[] args) {
			new DrawTriangle().go();
		}
}

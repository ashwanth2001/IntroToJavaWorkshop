import java.lang.annotation.Repeatable;

import org.jointheleague.graphical.robot.Robot;

public class MoveRobot {
public static void main(String[] args) {
	Robot bob = new Robot("mini");
	bob.penDown();
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
	bob.move(90);
	bob.turn(90);
}
}

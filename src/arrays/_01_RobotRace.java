package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {


	//2. create an array of 5 robots.
	
	
 Robot[] robs = new Robot[5];
	//3. use a for loop to initialize the robots.
 	for( int i = 0; i < robs.length; i++) {
 		robs[i] = new Robot();
 		robs[i].setSpeed(10);
 		 robs[i].setX(50);
 		 robs[i].setY(50);
 		 robs[i].turn(90);
 		 robs[i].move(100 * i);
 		 robs[i].turn(90);
 		 
 		
 		
 		
 
 	
 	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
for( int e = 0; e < robs.length; e++) {
	
	Random r = new Random();
	int in = r.nextInt(50);
	while( robs[e].getY()> 70) {
	robs[e].move(in);
	}
}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.

}
}

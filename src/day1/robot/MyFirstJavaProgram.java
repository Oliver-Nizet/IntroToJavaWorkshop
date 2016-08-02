package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bubbles = new Robot();
bubbles.sparkle();
bubbles.hide();
bubbles.setSpeed(10);
bubbles.setPenColor(255,0,0);
bubbles.penDown();
for (int i = 0; i < 4; i++) {
	bubbles.move(100);
	bubbles.turn(90);
}
bubbles.penUp();
bubbles.moveTo(500, 500);
bubbles.setPenColor(0,255,0);
bubbles.penDown();
for (int i = 0; i < 6; i++) {
	bubbles.move(70);
	bubbles.turn(60);	
}
bubbles.penUp();
bubbles.moveTo(1200, 500);
bubbles.setPenColor(0,0,255);
bubbles.penDown();
for (int i = 0; i < 3; i++) {
	bubbles.move(110);
	bubbles.turn(120);
	
}
	}
}

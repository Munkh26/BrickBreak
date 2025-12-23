// Class author: Munkhsoyombo Munkhbat
// Date created:  12/09/2025
// General description: implements the private variables, ball constuctor, and its methods.

package com.BrickBreak;
import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int radius;
	private int velocityX;
	private int velocityY;
	
	//constructor(s):
	public Ball(int newX, int newY, int r) {
		x = newX;
		y = newY;
		radius = r;
		velocityX = 1;
		velocityY = -2;
	}

	public void draw(Graphics g){
		g.setColor(Color.red);
		g.fillOval(x, y, radius, radius);
	}
	
	//methods:
	// Pre-condition: call ball.getXpos()
	// Post-condition: returns ball's x position
	public int getXpos() {
		return x;
	}
	// Pre-condition: call ball.getYpos()
	// Post-condition: returns ball's y position
	public int getYpos() {
		return y;
	}
	// Pre-condition: call ball.getXpos()
	// Post-condition: returns ball's radius
	public int getSize() {
		return radius;
	}
	// Pre-condition: put input in setX(int x)
	// Post-condition: sets the position of x equal to the inputted one
	public void setX(int newX){
		x = newX;
	}
	// Pre-condition: put input in setY(int y)
	// Post-condition: sets the position of y equal to the inputted one
	public void setY(int newY){
		y = newY;
	}
	// Pre-condition: put input in setXvelocity(int velocityX)
	// Post-condition: gives new velocity for X
	public void setXVelocity(int v) {
		velocityX = v;
	} 
	// Pre-condition: put input in setYvelocity(int velocityY)
	// Post-condition: gives new velocity for Y
	public void setYVelocity(int v) {
		velocityY = v;
	} 
	// Pre-condition: call ball.move()
	// Post-condition: moves the ball according to their x and y velocity
	public void move() {
		x += velocityX;
		y += velocityY;
	}
	// Pre-condition: call reverseY()
	// Post-condition: reverses the Y velocity
	public void reverseY() {
		velocityY *= -1;
	}
	// Pre-condition: call reverseX()
	// Post-condition: reverses the X velocity
	public void reverseX() {
		velocityX *= -1;
	}
}

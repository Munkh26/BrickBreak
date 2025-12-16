// Class author: Munkhsoyombo Munkhbat
// Date created:  12/09/2025
// General description: This class implements the private variables, paddle constuctor, and its methods.

package com.BrickBreak;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	//your code here!
	//don't forget you need instance variables:
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	//constructor(s):
	public Paddle(int newX, int newY, int w, int h) {
		x = newX;
		y = newY;
		width = w;
		height = h;
		velocity = 0;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(x, y, width, height);
	}
	
	//methods:
	// Pre-condition: call getX()
	// Post-condition: returns what x value is.
	public int getX() {
		return x;
	}
	// Pre-condition: call getY()
	// Post-condition: returns what y value is.
	public int getY() {
		return y;
	}
	// Pre-condition: call getWidth()
	// Post-condition: returns what the width is.
	public int getWidth() {
		return width;
	}
	// Pre-condition: call getHeight()
	// Post-condition: returns what the height is.
	public int getHeight() {
		return height;
	}
	// Pre-condition: call getVelocity()
	// Post-condition: returns what the velocity is.
	public int getVelocity() {
		return velocity;
	}
	// Pre-condition: input x value where you want to set the x value to
	// Post-condition: sets the x value to the inputted value
	public void setX(int newX) {
		x = newX;
	}
	// Pre-condition: input velocity value where you want to set the velocity value to
	// Post-condition: sets the velocity to the inputted value
	public void setVelocity(int v) {
		velocity = v;
	}
	// Pre-condition: input a number and it adds to the velocity
	// Post-condition: increases the velocity
	public void addVelocity(int v) {
		velocity += v;
	}
	// Pre-condition: call move() method
	// Post-condition: moves the paddle
	public void move() {
		x += velocity;
	}
}

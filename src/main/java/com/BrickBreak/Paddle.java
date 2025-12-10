// Class author: Munkhsoyombo Munkhbat
// Date created:  12/09/2025
// General description: a brief summary of what this particular class does.

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
	public Paddle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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
	public void setX(int x) {
		this.x = x;
	}
	// Pre-condition: input velocity value where you want to set the velocity value to
	// Post-condition: sets the velocity to the inputted value
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	// Pre-condition: input a number and it adds to the velocity
	// Post-condition: increases the velocity
	public void addVelocity(int velocity) {
		this.velocity += velocity;
	}
	// Pre-condition: call move() method
	// Post-condition: moves the paddle
	public void move() {
		x += velocity;
	}
}

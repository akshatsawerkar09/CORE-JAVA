package com.app.cdac;

public class Box {

	// state : instance vars : tight encapsulation : private
	private double width, height, depth;

	// Add a parameterized constr to init complete state of a box
	public Box(double w, double d, double height) {
		width = w;
		depth = d;
		this.height = height; // to unhide instance var from method local var
	}

	// Add a method to return box details in a string form
	public String getBoxDetails() {
		return "Box Details " + width + " " + depth + " " + height;
	}

	// Add a method to return computed volume of a box
	public double computeVolume() {
		return width * depth * height;
	}

}

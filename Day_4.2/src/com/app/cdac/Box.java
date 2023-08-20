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

	public Box(double side) {
		this(side, side, side);
	}

	// Add a method to return box details in a string form
	public String getBoxDetails() {
		return "Box Details " + width + " " + depth + " " + height;
	}

	// Add a method to return computed volume of a box
	public double computeVolume() {
		return width * depth * height;
	}

	// Add an instance method to test equality of 2 boxes
	public boolean isEqual(Box anotherBox) {
		return (this.width == anotherBox.width) && (this.depth == anotherBox.depth)
				&& (this.height == anotherBox.height);
	}

	// Add a method to box class to return a new box with modified offset dims &
	// test it with the tester
	public Box createNewBox(double wOff, double dOff, double hOff) {
		Box tmp = new Box(this.width + wOff, this.depth + dOff, this.height + hOff);
		return tmp;
	}

}

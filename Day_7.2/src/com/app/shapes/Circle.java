package com.app.shapes;

public class Circle extends BoundedShape {

	private double radius;

	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "Circle " + super.toString() + " radius=" + radius;
	}

}

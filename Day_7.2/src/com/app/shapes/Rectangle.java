package com.app.shapes;

public class Rectangle extends BoundedShape {

	private int width, height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle " + super.toString() + " width=" + width + " height=" + height;
	}

}

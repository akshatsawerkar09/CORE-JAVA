package com.app.shapes;

public class TestShapes {

	public static void main(String[] args) {

		BoundedShape[] shapes = { new Circle(10, 20, 10.5), new Rectangle(50, 100, 10, 20) };

		for (BoundedShape s : shapes) {
			System.out.println(s);
			System.out.println(s.area());
		}

	}

}

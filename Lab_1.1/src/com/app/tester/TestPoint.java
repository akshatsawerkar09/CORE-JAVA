package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Point 1 : x & y");

		Point2D p1 = new Point2D(sc.nextInt(), sc.nextInt());

		System.out.println("Enter Point 2 : x & y");

		Point2D p2 = new Point2D(sc.nextInt(), sc.nextInt());

		/*
		 * 3.7 Use getDetails method to display point details.(p1's details & p2's
		 * details)
		 */

		System.out.println("P1 Details : " + p1.getDetails());

		System.out.println("P2 Details : " + p2.getDetails());

		/*
		 * 3.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are
		 * located at the same position)
		 */

		System.out.println("p1 is equal p2 : " + p1.isEqual(p2));

		/*
		 * 3.9 Create new point p3 , with the dimensions offset from p1. I/P --x offset
		 * & y offset
		 */
		System.out.println("Enter xOff & yOff for point 3");

		Point2D p3 = p1.createNewPoint(sc.nextInt(), sc.nextInt());

		System.out.println("P3 Details : " + p3.getDetails());

		/* 3.10 Display distance between 2 points.(between p1 & p2) */

		System.out.println("Distance between p1 & p2 : " + p1.calcDistance(p2));

		sc.close();

	}

}

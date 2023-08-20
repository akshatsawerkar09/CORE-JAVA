package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoints {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * 1.1 Prompt user , how many points to plot? Create suitable array , to store
		 * Point2D type of references.
		 * 
		 * 1.2 Add a menu , Run the application till user chooses option 4 (exit)
		 * 
		 * 1 Plot a new point I/P --index , x & y eg : If user supplies 5 50 100 Create
		 * a Point2D with x, y of (50,100) & its reference should be stored at the 5th
		 * index position in array.
		 * 
		 * 2 Display all points plotted so far. (Use for-each) Will null checking be
		 * required?
		 * 
		 * 3. Calculate distance I/P strt , end point indexes. eg : If user enters 2 6
		 * Find out the distance between 2nd & 6th point. (array indexes start from 0)
		 * 
		 * 10. Exit
		 * 
		 * Note : Boundary condition checking & null checking is expected. (Meaning : if
		 * user supplies invalid indes , then give error message : invalid index --out
		 * of range If no point is plotted at user specified index , then give error
		 * message : invalid index -- no point plotted here.)
		 */

		int index = 0;

		System.out.println("Enter number of points");

		Point2D[] points = new Point2D[sc.nextInt()];

		while (true) {

			System.out.println(
					"Enter from menu\n1.Plot a new point\n2.Display all points\n3.Calculate Distance\n10.Exit");

			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter index");
				index = sc.nextInt();
				if (index < points.length && index >= 0) {
					if (points[index] == null) {
						System.out.println("Enter x & y");
						points[index] = new Point2D(sc.nextInt(), sc.nextInt());
					} else {
						System.out.println("Point already plotted!!!!");
					}
				} else {
					System.out.println("Index out of bound!!!!");
				}
				break;
			case 2:
				System.out.println("Points Plotted");
				for (Point2D p : points) {
					if (p != null) {
						System.out.println(p.getDetails());
					}
				}
				break;
			case 3:
				System.out.println("Enter start point");
				int startPoint = sc.nextInt();
				if (startPoint >= 0 && startPoint < points.length) {
					System.out.println("Enter end point");
					int endPoint = sc.nextInt();
					if (endPoint >= 0 && endPoint < points.length) {
						if (points[startPoint] != null && points[endPoint] != null) {
							if (startPoint < endPoint) {
								System.out.println(points[startPoint].calcDistance(points[endPoint]));
							} else {
								System.out.println("Start point should be less than end point");
							}
						}
					} else {
						System.out.println("End point should be within range!!!!");
					}

				} else {
					System.out.println("Start point should be within range!!!!");
				}

				break;
			case 10:
				System.exit(0);
				break;

			default:
				break;
			}

		}

	}

}

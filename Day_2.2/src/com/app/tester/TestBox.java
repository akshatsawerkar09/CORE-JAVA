package com.app.tester;

import java.util.Scanner;

import com.app.cdac.Box;

public class TestBox {

	public static void main(String[] args) {

		// create Scanner instance to wrap std input stream
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Box Dims : w d h");

		Box b1;

		b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		// display box dims
		System.out.println(b1.getBoxDetails());

		// display volume
		System.out.println("Volume = " + b1.computeVolume());

		// close scanner
		sc.close();

	}

}

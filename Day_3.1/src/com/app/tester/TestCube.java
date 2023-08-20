package com.app.tester;

import java.util.Scanner;

import com.app.cdac.Box;

public class TestCube {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Box Dims ");

		Box cube = new Box(sc.nextDouble());

		System.out.println(cube.getBoxDetails());

		System.out.println("Volume " + cube.computeVolume());

		System.out.println("Enter Box 1 dims w, d, h");

		Box b1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println("Enter Box 2 dims w, d, h");

		Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(b1.getBoxDetails());

		System.out.println(b2.getBoxDetails());

		System.out.println("Is Equal : " + b1.isEqual(b2));

		System.out.println("Enter Box 3 offset Dims : wOff, dOff, hOff");

		Box b3 = b1.createNewBox(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

		System.out.println(b3.getBoxDetails());

		sc.close();

	}

}

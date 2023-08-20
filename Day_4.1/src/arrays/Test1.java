package arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {

		double[] values = new double[10];

		// display array contents
		System.out.println("Default Array contents");

		for (double a : values) {
			System.out.print(a + " ");
		}

		// init array 1,2...10
		System.out.println("\nInit array contents using for-each");

		int counter = 1;

		for (double d : values) {
			d = counter++;
		}

		for (double a : values) {
			System.out.print(a + " ");
		}

		System.out.println("\nInit array contents using for loop");

		for (int i = 0; i < values.length; i++) {
			values[i] = (i + 1) * 10;
		}

		for (double a : values) {
			System.out.print(a + " ");
		}

		System.out.println("\nArray contents using toString");
		
		System.out.println(Arrays.toString(values));

	}

}

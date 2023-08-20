package arrays;

import java.util.Arrays;

public class Test2DArray {

	public static void main(String[] args) {

		double[][] data = new double[3][4];

		// display
		System.out.println("Class loaded for the first time : " + data);

		for (double[] d : data) {
			for (double d1 : d) {
				System.out.print(d1 + " ");
			}
		}

		int value = 1;

		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				data[i][j] = value++;
			}
		}

		// API to display multi dims array contents
		System.out.println("\n" + Arrays.deepToString(data));

	}

}

package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test5 {

	public static void main(String[] args) {

		// Objective : remove odd elements from AL to ints
		ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(10, 23, 1, 234, 56, 78, 77, 45, 24));

		ints.add(99); // no run time error

		System.out.println(ints);

		// Objective : Display sorted ints in descending order
		/*
		 * Collections.sort(ints, new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer o1, Integer o2) { return
		 * o2.compareTo(o1); } });
		 * 
		 * for (int i : ints) { System.out.print(i + " "); }
		 */

		// Collections.sort(ints, (i1, i2) -> i2.compareTo(i1));

		Collections.sort(ints, (i1, i2) -> i2.compareTo(i1));

		// lambda expr to display elements in the list
		ints.forEach(i -> System.out.print(i + " "));

	}

}
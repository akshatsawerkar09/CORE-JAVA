package lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerList {

	public static void main(String[] args) {

		// create empty array list with default init capacity
		ArrayList<Integer> list = new ArrayList<>();

		// size = 0, capacity = 10
		int[] data = { 10, 12, 21, -45, 10, 23, 56, 77, 89, 12 };

		// populate AL with this data
		for (int i : data) {
			list.add(i);
		}

		// display elements in AL
		System.out.println("AL contents via toString");

		System.out.println(list);

		// for loop
		System.out.println("Array list via for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		/*
		 * list.add(0, null);
		 * 
		 * System.out.println("\nAL contents again");
		 * 
		 * System.out.println(list);
		 */

		System.out.println("\nAL contents via for-each");

		for (Integer i : list) {
			System.out.print(i + " ");
		}

		System.out.println("\nList contents via Iterator");

		// 1. Attach Iterator : cursor : before 1st element
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		// System.out.println(itr.next()); no such element exception

	}

}

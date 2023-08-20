package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class IntegerList2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

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

			// search element
			System.out.println("Enter the element to search");

			System.out.println(list.contains(sc.nextInt()) ? "Present" : "Absent");

			System.out.println("Enter the element to display 1st & last occurence of the elemet");

			int element = sc.nextInt();

			System.out.println("first occur " + list.indexOf(element) + " last occur " + list.lastIndexOf(element));

			System.out.println("Enter the index to remove an element");

			System.out.println(list.remove(sc.nextInt()));

			System.out.println("list contents\n" + list);

			// double values of element > 30
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > 30) {
					list.set(i, list.get(i) * 2);
				}
			}

			System.out.println("list contents Again after double\n" + list);

			list.add(0, 999);

			System.out.println("list after add");

			System.out.println(list);

			// create another list2 having same elements in the same order
			ArrayList<Integer> list2 = new ArrayList<>(list);

			System.out.println("List 2 contents");

			System.out.println(list2);

			System.out.println("Converting collection to fixed size array");

			Integer[] refs = new Integer[list.size()];

			System.out.println("Before " + Arrays.toString(refs));

			list.toArray(refs);

			System.out.println("After " + Arrays.toString(refs));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package test_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 512, 34, 5));

		Iterator<Integer> itr = list.iterator();

		// list.add(1234);

		// lisr.remove(0); again exception

		list.set(0, 9999); // no exception

		System.out.println("List elements");

		// itr.remove(); will not removed because cursor is before the first element :
		// illegal state exception

		while (itr.hasNext()) {
			int i = itr.next();
			/*
			 * if (i > 10) { itr.remove(); }
			 */
			// System.out.println(itr.next()); // concurrent modification exception :
			// because trying to modifying list
			// after attaching iterator
			System.out.print(i + " ");
			// itr.remove(); // empty list
			// itr.remove(); illegal state exception
		}

		System.out.println(list.get(list.size())); // index out of bound

		// System.out.println(itr.next()); no such element excpetion

		System.out.println("\nList contents again");

		list.forEach(i -> System.out.print(i + " "));

	}

}

package test_generics;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class TestGenericMethod {

	public static void main(String[] args) {

		List<Object> list1 = Arrays.asList();

		// list1.add("abcd");

		List<String> strings = Arrays.asList(new String[] { "one", "two", "three" });

		System.out.println(strings);

		strings.set(0, strings.get(0).toUpperCase());

		System.out.println(strings);

		strings = Arrays.asList("1", "3", "6");

		System.out.println(strings);

		System.out.println("printing elements in the reverse order");

		// print the contents in reverse order : strings.listIterator(); if we used this
		// cursor would be placed before the first row
		ListIterator<String> listItr = strings.listIterator(strings.size());

		while (listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}

	}

}
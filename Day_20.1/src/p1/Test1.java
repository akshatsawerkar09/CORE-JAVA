package p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {

		// create fixed size integer list and display the elements

		List<Integer> list = Arrays.asList(10, 23, 1, 234, 56, 78);

		// imperative style
		for (int i : list) {
			System.out.print(i + " ");
		}

		// List is a Iterable : yes : forEach method
		// Iterable : public default forEach(Consumer<? super T> action)
		// In Consumer i/ SAM : public void accept(T t)
		// arg : instance of the class that impl Consumer
		// different ways
		// 1. Separate class implements Consumer and override accept
		// 2. Anonymous inner class : override accept

		System.out.println("\nDisplaying elements using functional way");

		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer i) {
				System.out.print(i + " "); // action
			}

		}); // it is a concrete method

		// declarative : reduction of repetitive code( boiler plate code) : what is to
		// done
		// lambda expressions (args) -> {action}
		// one line need not {}
		// it is full way
		/*
		 * list.forEach((Integer i) -> { System.out.print(i + " "); });
		 */
		/*
		 * list.forEach(i -> { System.out.print(i + " "); });
		 */
		// here we have remove {} and ;
		list.forEach(i -> System.out.print(i + " "));
		// forEach : higher order function / method

	}

}

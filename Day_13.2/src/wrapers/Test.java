package wrapers;

public class Test {

	public static void main(String[] args) {

		Integer i1 = new Integer(1234); // boxing

		int data = i1.intValue(); // unboxing

		i1 = 1234; // auto boxing

		String s = "2345";

		// s++;

		i1++; // auto unboxing

		System.out.println(i1);

		Double d1 = 123.456; // auto-boxing

		double val = d1; // unboxing

		val = 23.45f; // widening

		d1 = (double) 23.45f; // Float - X Double

		Number n = 12.456f; // float - > Float - > Number

		n = 1234;

		n = 12.3456;

		Object o = true; // boolean - > Boolean -> Object

		o = 34.56;

		o = 34;

		o = 'c';

		Integer i2 = 100;

		Integer i3 = 100;

		System.out.println(i2 == i3); // true

		System.out.println(i2.equals(i3)); // true

		i2 = 128;

		i3 = 128;

		System.out.println(i2 == i3); // false

		System.out.println(i2.equals(i3)); // true

	}

}

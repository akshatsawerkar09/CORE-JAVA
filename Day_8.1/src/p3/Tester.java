package p3;

public class Tester {

	public static void main(String[] args) {

		ConsolePrinter consolePrinter = new ConsolePrinter();

		Computable ref = consolePrinter;

		System.out.println(ref.compute(10, 20));

		Printable ref2 = consolePrinter;

		ref2.print("Some Message!!!!");
	}

}

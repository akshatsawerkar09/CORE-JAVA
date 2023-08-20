package var_args;

import static var_args.Utils.displayNames;

public class Tester {

	public static void main(String[] args) {

		// Different ways to invoke method with var-args
		displayNames();
		System.out.println();
		displayNames(new Animal[] { new Dog(), new Cat() });
		System.out.println();
		displayNames(new Cat(), new Dog());

	}

}

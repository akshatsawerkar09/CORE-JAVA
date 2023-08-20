package non_generics;

public class TestMe {

	public static void main(String[] args) {

		// create a holder class instance to hold an integer
		Holder h1 = new Holder(1234);

		int value = (Integer) h1.getRef();

		Holder h2 = new Holder("12345");

		String s = (String) h2.getRef();

		h1 = h2;

		value = (Integer) h1.getRef();

		System.out.println(value);

	}

}

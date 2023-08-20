package p1;

class A {
	private int i; // i : instance var : by default init : heap

	public static void main(String[] args) {
		int data;
		// System.out.println(data); // data : method local var and javac doesn't allow
		// accessing any un-init var
		// System.out.println(i); static method can only access other static var
		A a = new A();
		System.out.println(a.i);
		data = 100;
		/*
		 * if (data) { System.out.println("Yes"); } not possible because any condition
		 * checking in java it only accept boolean as the data type
		 */
		if (data == 100) {
			System.out.println("Yes");
		}
		char ch = 'A';
		System.out.println(ch);
		ch = 66;
		System.out.println(ch);
		System.out.println("Byte Ranges from " + Byte.MIN_VALUE + " ---- " + Byte.MAX_VALUE);
		System.out.println("In A's main");
	}
}

public class B {
	public static void main(String[] args) {
		System.out.println("In B's main");
	}
}

class C {
	public static void main(String[] args) {
		System.out.println("In C's main");
	}
}

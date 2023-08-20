package nested_classes;

public class Outer {

	private int i;
	private static int j;

	static {
		j = 100;
	}

	public Outer(int i) {
		super();
		this.i = i;
	}

	// static method
	public static void show() {
		System.out.println("Outer's show : static " + j);
		// which members of inner class
		System.out.println("Inner's members : " + Inner.b);
		// a : inner's non static data member
		// create instance of outer
		Outer outer = new Outer(111);
		// we cannot create inner instance in static method without outer class
		// Inner in = new Inner(1234); javac error
		Outer.Inner inner = outer.new Inner(345);
		System.out.println(inner.a);
	}

	// non static method
	public void display() {
		System.out.println("Outer's display : non static " + i + " static " + j);
		System.out.println("Inner's members " + Inner.b);
		// a : inner's non static : instance of inner class
		Inner in = new Inner(123);
		System.out.println(in.a);
	}

	// nested class : non static nested class : inner class
	class Inner {

		// data members : non static
		private int a;
		// earlier we can't add static member in non static nested class : inner class
		// but we can add static final member in non static nested class
		// but we can't add static init block in inner class
		private static final int b = 200;

		/*
		 * static { b = 200; }
		 */

		// static method : not allowed
		/*
		 * static void test() {
		 * 
		 * }
		 */
		public Inner(int a) {
			super();
			this.a = a;
		}

		// non static method : allowed
		// it can access : i, j , a , b
		public void showInner() {
			System.out.println("show inner " + i + " " + j + " " + a + " " + b);
		}

	}

}

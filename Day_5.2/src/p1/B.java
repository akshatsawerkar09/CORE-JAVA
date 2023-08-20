package p1;

public class B extends A {

	public B() {
		// private member not accessible
		System.out.println("B's state " + j + " " + k + " " + l);
	}

}

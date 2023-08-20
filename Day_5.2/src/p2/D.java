package p2;

import p1.A;

public class D extends A {

	public D() {
		// here private and default not visible
		System.out.println("D's state " + k + " " + l);
	}

}

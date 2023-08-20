package p2;

import p1.A;

public class E {

	public E() {
		A a = new A();
		// here private, default and public not visible
		System.out.println("E's state " + a.l);
	}

}

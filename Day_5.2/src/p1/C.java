package p1;

public class C {

	public C() {
		// here we have to create object of a because a and c are not related to each
		// other
		// here private not accessible
		A a = new A();
		System.out.println("C's state " + a.j + " " + a.k + " " + a.l);
	}

}

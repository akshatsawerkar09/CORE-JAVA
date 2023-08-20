package p4;

public class C implements A, B {

	@Override
	public void show() {
		System.out.println("In show method impl " + A.data + " " + B.data);
	}

}

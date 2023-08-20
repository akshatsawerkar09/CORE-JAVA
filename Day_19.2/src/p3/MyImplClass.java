package p3;

public class MyImplClass implements Formula, Formula2 {

	@Override
	public double calculate(double a) {
		System.out.println("impl abstract method");
		return a * a;
	}

	// **** this class must implement both the methods : otherwise we will get javac
	// error
	// can impl class override inherited def functionality : yes
	@Override
	public double sqrt(double a, double b) {
		System.out.println("overriding def method");
		// how to refer to inherited default method ? : i/fName.super.method
		System.out.println(Formula.super.sqrt(a, b));
		System.out.println(Formula2.super.sqrt(a, b));
		return Math.sqrt(a * b);
	}

}

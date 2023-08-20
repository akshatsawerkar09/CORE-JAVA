package p4;

public class MyFormula implements Formula {

	@Override
	public double calculate(double a) {
		System.out.println("impl abstract method");
		return a * a;
	}

	@Override
	public double sqrt(double a, double b) {
		return Math.sqrt(a * b);
	}

	// @Override : here we can't override show method because it is static : but we
	// can redeclare it
	static void show() {
		System.out.println("In class static method : show");
		// can impl class invoke i/f static method : Yes : how ?
		// interfaceName.MethodName
		Formula.show();
	}

}

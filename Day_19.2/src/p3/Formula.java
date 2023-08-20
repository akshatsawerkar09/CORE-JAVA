package p3;

public interface Formula {

	double calculate(double a); // public and abstract

	// public
	default double sqrt(double a, double b) {
		System.out.println("In formula i/f default method");
		return Math.sqrt(a + b);
	}

}

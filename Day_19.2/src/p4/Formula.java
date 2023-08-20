package p4;

public interface Formula {

	double calculate(double a); // public and abstract

	// public
	default double sqrt(double a, double b) {
		System.out.println("In i/f default method");
		return Math.sqrt(a + b);
	}

	// static methods can be added to i/f
	// which are javac added keywords : public
	static void show() {
		System.out.println("In i/f static method : show");
	}

}

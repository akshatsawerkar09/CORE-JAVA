package inh;

public class Student extends Person {

	// after extending from person we are getting javac error because if we donn't
	// supply constr javac auto apply default constr and first keyword is super and
	// it is unable to find default constr in person class
	private int gradYear;
	private String courseName;
	private double fess;
	private int marks;

	public Student(String fn, String ln, int gradYear, String courseName, double fess, int marks) {
		super(fn, ln);
		System.out.println("In Student constr"); // super should be first
		this.gradYear = gradYear;
		this.courseName = courseName;
		this.fess = fess;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return super.toString() + " gradYear=" + gradYear + ", courseName=" + courseName + ", fess=" + fess + ", marks="
				+ marks;
	}

}

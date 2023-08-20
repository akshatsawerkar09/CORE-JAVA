package tester;

import inh.Person;
import inh.Student;

public class TestInheritance3 {

	public static void main(String[] args) {

		Person ref = new Student("rama", "seth", 2019, "edac", 1000, 100);

		((Student) ref).study();

	}

}

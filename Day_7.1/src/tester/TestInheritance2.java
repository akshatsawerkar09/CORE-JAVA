package tester;

import inh.Faculty;
import inh.Person;
import inh.Student;

public class TestInheritance2 {

	public static void main(String[] args) {

		// create student object
		Student student1 = new Student("rama", "seth", 2019, "eDac", 1000, 80);

		System.out.println(student1.toString());

		Person ref;

		ref = student1;

		System.out.println(ref);

		Faculty faculty1 = new Faculty("chetan", "shah", 15, "java");

		System.out.println(faculty1.toString());
	}

}

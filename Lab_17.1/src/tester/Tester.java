package tester;

import java.util.HashSet;

import com.app.core.Student;
import static java.time.LocalDate.parse;

public class Tester {

	public static void main(String[] args) {

		/*
		 * 2. Create a Tester to store Student details in a suitable HashSet Add 5
		 * student details ( 4 with different ids & 5th with existing) 2.1 What will
		 * happen, if equals n hashCode is not overridden? Will it detect dups ? 2.2
		 * What will happen, if only equals is overridden? Will it detect dups ? Why ?
		 * 2.3 What will happen, if equals n hashCode is overridden? (BUT only mandary
		 * part of the contract) Equal objects producing SAME hashcode Will it detect
		 * dups ? What about performance ? 2.3 What will happen, if equals n hashCode is
		 * overridden? (With mandary n optional part of the contract) Equal objects
		 * producing SAME hashcode & un equal ocjects producing DISTINCT hashcodes. Will
		 * it detect dups ? What about performance ?
		 */

		HashSet<Student> hashSet = new HashSet<>();

		Student student1 = new Student(101, "java", "abc", 100, parse("2010-10-10"));

		Student student2 = new Student(102, "java", "abc", 100, parse("2010-10-10"));

		Student student3 = new Student(103, "java", "abc", 100, parse("2010-10-10"));

		Student student4 = new Student(104, "java", "abc", 100, parse("2010-10-10"));

		Student student5 = new Student(101, "java", "abc", 100, parse("2010-10-10"));

		System.out.println(hashSet.add(student1));

		System.out.println(hashSet.add(student2));

		System.out.println(hashSet.add(student3));

		System.out.println(hashSet.add(student4));

		System.out.println(hashSet.add(student5));

		System.out.println("Contents");

		for (Student s : hashSet) {
			System.out.println(s);
		}

	}

}

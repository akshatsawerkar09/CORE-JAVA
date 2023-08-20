package sets;

import java.util.HashSet;

import com.app.core.Emp;

public class EmpSet2 {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "abc", "rnd", 10000);

		Emp e2 = new Emp(10, "abc2", "rnd", 10000);

		Emp e3 = new Emp(50, "abc3", "rnd", 10000);

		Emp e4 = new Emp(67, "abc4", "rnd", 10000);

		// create empty hs to store emp type of ref's
		HashSet<Emp> emps = new HashSet<>();

		System.out.println("Added " + emps.add(e1)); // true : hashcode

		System.out.println("Added " + emps.add(e2));// true hc & equals 1

		System.out.println("Added " + emps.add(e3));// true hc & equals 2

		System.out.println("Added " + emps.add(e4)); // false & equals 3 (if new ref) and only 1 when 1 duplicate ref

		System.out.println("size " + emps);

		System.out.println("Contents " + emps.size()); // 3

		for (Emp e : emps) {
			System.out.println(e); // no duplicate
		}

	}

}

package tester;

import com.app.core.Emp;

public class Test2 {

	public static void main(String[] args) {

		Object e1 = new Emp(101, "rama", 10000);

		Object e2 = new Emp(101, "rama", 10000);

		System.out.println(e1.equals(e2));

	}

}

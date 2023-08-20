package utils;

import java.util.ArrayList;
import static java.time.LocalDate.parse;

import com.app.core.Emp;

import custom_exceptions.EmpHandlingException;
import static com.app.core.Department.*;

public class CollectionUtils {

	// Add a static method to accept emp pk details
	// rets : emp ref, in case of success or throw wx
	public static Emp checkIfExists(ArrayList<Emp> empList, int id, String name) throws EmpHandlingException {
		Emp e = new Emp(id, name);
		int index = empList.indexOf(e);
		if (index == -1) {
			throw new EmpHandlingException("Invalid Emp credentials");
		}

		return empList.get(index);
	}

	// write a static method to generate some sample emp data
	public static ArrayList<Emp> populateEmpList() {
		ArrayList<Emp> emps = new ArrayList<>();

		emps.add(new Emp(101, "abc4", 10000, parse("2010-01-05"), RND));

		emps.add(new Emp(10, "abc2", 80000, parse("2019-11-25"), FINANCE));

		emps.add(new Emp(50, "abc3", 60000, parse("2011-01-11"), RND));

		emps.add(new Emp(101, "abc1", 50000, parse("2008-11-05"), HR));

		emps.add(new Emp(67, "abc5", 70000, parse("2019-11-25"), RND));

		return emps;
	}

}

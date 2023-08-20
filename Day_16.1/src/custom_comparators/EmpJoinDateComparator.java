package custom_comparators;

import java.util.Comparator;

import com.app.core.Emp;

public class EmpJoinDateComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		System.out.println("In compare : join date");
		return e1.getJoinDate().compareTo(e2.getJoinDate());
	}

}

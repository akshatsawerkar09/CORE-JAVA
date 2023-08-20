package custom_comparators;

import java.util.Comparator;

import com.app.customer.Customer;

public class SortRegAmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return ((Double) o1.getRegistrationAmount()).compareTo(o2.getRegistrationAmount());
	}

}

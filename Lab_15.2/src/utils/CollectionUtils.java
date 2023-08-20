package utils;

import java.text.ParseException;
import java.util.ArrayList;
import static com.app.customer.CustomerType.*;
import java.util.Date;

import com.app.customer.Customer;
import static utils.CustomerValidations.sdf;

import custom_exceptions.CustomerHandlingException;

public class CollectionUtils {

	public static Customer checkIfExist(ArrayList<Customer> customers, String email, Date dob)
			throws CustomerHandlingException {

		Customer customer = new Customer(email, dob);

		int index = customers.indexOf(customer);

		if (index == -1) {
			throw new CustomerHandlingException("Invalid Emp credentials!!!!!");
		}

		return customers.get(index);

	}

	public static ArrayList<Customer> generateSampleDate() throws ParseException {
		ArrayList<Customer> customers = new ArrayList<>();
		customers.add(new Customer("abc@gmail.com", "abc@123", "akshat", 5000, sdf.parse("2010-10-10"), GOLD));
		customers.add(new Customer("abc@gmail.com", "xyz@123", "ajay", 1000, sdf.parse("2010-10-10"), SILVER));
		customers.add(new Customer("pqr@gmail.com", "pqr@123", "anil", 2000, sdf.parse("2014-10-10"), GOLD));
		customers.add(new Customer("lmn@gmail.com", "lmn@123", "abhi", 4000, sdf.parse("2016-10-10"), PLATINUM));
		customers.add(new Customer("abc@gmail.com", "rst@123", "atul", 3000, sdf.parse("2010-10-10"), GOLD));
		return customers;
	}

}

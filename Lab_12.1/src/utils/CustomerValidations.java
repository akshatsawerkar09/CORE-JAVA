package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.app.customer.Customer;
import com.app.customer.CustomerType;

import custom_exceptions.CustomerHandlingException;

public class CustomerValidations {

	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("yyyy-MM-dd");
	}

	public static Date checkDob(Date dob) throws CustomerHandlingException, ParseException {
		if (!dob.before(sdf.parse("2020-01-01"))) {
			throw new CustomerHandlingException("Dob must be before '2020-01-01'");
		}
		return dob;
	}

	public static CustomerType checkCustomerType(CustomerType customerType) throws CustomerHandlingException {
		int count = 0;
		for (CustomerType c : CustomerType.values()) {
			if (c != null) {
				if (c.equals(customerType)) {
					count++;
				}
			}
		}
		if (count == 0) {
			throw new CustomerHandlingException("Customer must be either 'SILVER', 'GOLD', or 'PLATINUM'");
		}
		return customerType;
	}

	public static String checkEmail(String email) throws CustomerHandlingException {

		if (email.length() < 8 || email.length() > 15) {
			throw new CustomerHandlingException("Email length must be between 8-15 characters");
		}

		if (!email.contains("@")) {
			throw new CustomerHandlingException("Email must contain '@'");
		}

		if (!email.endsWith(".com")) {
			throw new CustomerHandlingException("Email must end with '.com'");
		}

		return email;
	}

	public static String checkPassword(String password) throws CustomerHandlingException {

		if (!password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{6,20})")) {
			throw new CustomerHandlingException("Check Password!!!!");
		}

		return password;
	}

	public static double checkRegAmount(double regAmount) throws CustomerHandlingException {

		if (regAmount % 500 != 0) {
			throw new CustomerHandlingException("Registration must be multiple of 500");
		}

		return regAmount;
	}

	public static String checkDuplicateEmail(Customer[] customers, String email) throws CustomerHandlingException {

		for (Customer c : customers) {
			if (c != null) {
				if (c.getEmail().equals(email)) {
					throw new CustomerHandlingException("Duplicate Email!!!");
				}
			}
		}

		return email;

	}

	public static String checkCountry(String country) throws CustomerHandlingException {

		if (!country.equals("INDIA")) {
			throw new CustomerHandlingException("Currently we are only supporting in 'INDIA'");
		}

		return country;
	}

}

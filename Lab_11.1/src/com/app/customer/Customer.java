package com.app.customer;

import java.util.Date;
import static utils.CustomerValidations.sdf;

public class Customer {

	private String email, password, name;
	private double registrationAmount;
	private String city;
	private Date dob;
	private CustomerType customerType;

	public Customer(String email, String password, String name, double registrationAmount, String city, Date dob,
			CustomerType customerType) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registrationAmount = registrationAmount;
		this.city = city;
		this.dob = dob;
		this.customerType = customerType;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", name=" + name + ", registrationAmount="
				+ registrationAmount + ", city=" + city + ", dob=" + sdf.format(dob) + ", customerType=" + customerType
				+ "]";
	}

	public boolean equals(Object o) {

		System.out.println("In customer equals");

		if (o instanceof Customer) {
			if (email.equals(((Customer) o).email) && this.dob.equals(((Customer) o).dob)) {
				return true;
			}
		}

		return false;

	}

}

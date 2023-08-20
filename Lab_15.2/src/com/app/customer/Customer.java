package com.app.customer;

import java.util.Date;
import static utils.CustomerValidations.sdf;

public class Customer implements Comparable<Customer> {

	private String email, password, name;
	private double registrationAmount;
	private Date dob;
	private CustomerType customerType;
	private Address address;

	public Customer(String email, String password, String name, double registrationAmount, Date dob,
			CustomerType customerType) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.customerType = customerType;
	}

	@Override
	public int compareTo(Customer otherCustomer) {
		if (this.dob.compareTo(otherCustomer.dob) == 0) {
			return this.email.compareTo(otherCustomer.email);
		}
		return this.dob.compareTo(otherCustomer.dob);
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}

	public String getPhoneNo() {
		return address.phoneNo;
	}

	public Customer(String email, Date dob) {
		super();
		this.email = email;
		this.dob = dob;
	}

	public Customer(String email, String password, Date dob) {
		super();
		this.email = email;
		this.password = password;
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Date getDob() {
		return dob;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setPhoneNo(String phoneNo) {
		this.address.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", name=" + name + ", registrationAmount="
				+ registrationAmount + ", dob=" + sdf.format(dob) + ", customerType=" + customerType + ", address="
				+ address + "]";
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

	public String getCountry() {
		return address.country;
	}

	public String getCity() {
		return address.city;
	}

	public void assignAddress(String city, String state, String country, String phoneNo) {
		address = new Address(city, state, country, phoneNo);
	}

	private class Address {

		private String city, state, country, phoneNo;

		public Address(String city, String state, String country, String phoneNo) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.phoneNo = phoneNo;
		}

		@Override
		public String toString() {
			return "Address [city=" + city + ", state=" + state + ", country=" + country + ", phoneNo=" + phoneNo + "]";
		}

	}

}

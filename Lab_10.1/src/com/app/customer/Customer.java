package com.app.customer;

public class Customer {

	/*
	 * 3.1 Create a Customer class : email , password , name , registration amount ,
	 * city Provide suitable constructor to accept all i/ps , Supply a toString
	 */

	private String email, password, name;
	private double registrationAmount;
	private String city;

	public Customer(String email, String password, String name, double registrationAmount, String city) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registrationAmount = registrationAmount;
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", name=" + name + ", registrationAmount="
				+ registrationAmount + ", city=" + city + "]";
	}

	public boolean equals(Object o) {

		System.out.println("In customer equals");

		if (o instanceof Customer) {
			if (email.equals(((Customer) o).email)) {
				return true;
			}
		}

		return false;

	}

}

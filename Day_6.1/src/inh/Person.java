package inh;

public class Person {

	private String firstName, lastName;

	public Person(String firstName, String lastName) {
		super();
		System.out.println("In Person constr");
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}

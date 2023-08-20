package com.app.fruits;

public class Fruit {

	/*
	 * 2.1 Create inheritance hierarchy for fruits : in package : com.app.fruits
	 * Fruit,Apple,Orange,Cherry Add private data member "name" , in Fruit class ,
	 * to accept a name of the fruit. (eg : "Kashmiri Apple" or "Nagpur Orange" ...)
	 * Add taste() method to display its taste. eg : public void taste() {
	 * sop("No specific taste") } Apple : sweet eg : o/p : Kashmiri Apple is sweet
	 * in taste Orange : sour Cherry : sweet n sour
	 */

	private String name;

	public Fruit(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void taste() {
		System.out.println("No Specific taste");
	}

}

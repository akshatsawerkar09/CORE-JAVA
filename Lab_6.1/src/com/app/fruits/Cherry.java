package com.app.fruits;

public class Cherry extends Fruit {

	public Cherry(String name) {
		super(name);
	}

	@Override
	public void taste() {
		System.out.println(getName() + " cherry sweet & sour in taste");
	}

}

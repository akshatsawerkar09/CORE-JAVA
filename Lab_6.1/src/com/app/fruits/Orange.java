package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String name) {
		super(name);
	}

	@Override
	public void taste() {
		System.out.println(getName() + " orange sour in taste");
	}

}

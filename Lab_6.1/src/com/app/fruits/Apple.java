package com.app.fruits;

public class Apple extends Fruit {

	public Apple(String name) {
		super(name);
	}

	@Override
	public void taste() {
		System.out.println(getName() + " apple sweet in taste");
	}

}

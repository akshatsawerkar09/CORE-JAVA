package utils;

import custom_exceptions.SpeedOutOfRangeExceptions;

public class ValidationRules {

	// speed range
	public static final int MIN_SPEED, MAX_SPEED;

	static {
		MIN_SPEED = 40;
		MAX_SPEED = 80;
	}

	// Add a static method for validating speed
	public static void validateSpeed(int speed) throws SpeedOutOfRangeExceptions {

		if (speed < MIN_SPEED) {
			throw new SpeedOutOfRangeExceptions("You are driving too slow!!!!!");
		}

		if (speed > MAX_SPEED) {
			throw new SpeedOutOfRangeExceptions("You are driving too fast!!!!!");
		}

		System.out.println("Speed within range");

	}

}

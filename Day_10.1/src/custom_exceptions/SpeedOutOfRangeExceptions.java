package custom_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeExceptions extends Exception {

	public SpeedOutOfRangeExceptions(String errorMesg) {
		super(errorMesg);
	}

}

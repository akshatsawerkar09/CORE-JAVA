package custom_exceptions;

@SuppressWarnings("serial")
public class EmpHandlingException extends Exception {

	public EmpHandlingException(String errorMesg) {
		super(errorMesg);
	}

}

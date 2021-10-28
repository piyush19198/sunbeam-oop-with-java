package custom_exception;

@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception {
	public VehicleHandlingException(String errorMessage) {
		super(errorMessage);
	}
}

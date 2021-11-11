package custom_exceptions;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends RuntimeException{
	public SpeedOutOfRangeException(String errMsg) {
		super(errMsg);
	}
}

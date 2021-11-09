package custom_exceptions;

public class InvalidAccountException extends Exception{
	
	public InvalidAccountException(String msg) {
		super(msg);
	}
	
}

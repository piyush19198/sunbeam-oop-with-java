package custom_exceptions;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String msg) {
		super(msg);
	}
	
}

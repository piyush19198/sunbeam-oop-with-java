package custom_exceptions;


@SuppressWarnings("serial")
public class BookHandlingException extends Exception {
	public BookHandlingException(String mesg) {
		super(mesg);
	}

}

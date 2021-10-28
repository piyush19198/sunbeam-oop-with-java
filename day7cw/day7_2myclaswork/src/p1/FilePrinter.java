package p1;

public class FilePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Storing "+message+" in a file");
		System.out.println("Interface Constant "+DATA);
	}
}
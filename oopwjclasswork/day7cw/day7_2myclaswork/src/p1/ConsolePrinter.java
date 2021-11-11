package p1;

public class ConsolePrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Printing "+message+" on the console");
	}
}
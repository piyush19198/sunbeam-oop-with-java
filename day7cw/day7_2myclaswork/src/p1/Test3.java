package p1;

public class Test3 {
	public static void main(String[] args) {
		Printer[] printers = {
			new ConsolePrinter(),
			new FilePrinter(),
			new NetworkPrinter()
		};
		for(Printer p: printers)
			p.print("Some Message!!");
	}
}
package p1;

public class Test4 {
	public static void main(String[] args) {
		Printer[] printers = {
			new ConsolePrinter(),
			new FilePrinter(),
			new NetworkPrinter()
		};
		for(Printer p: printers) {
			p.print("Some Message!!");
			if(p instanceof NetworkPrinter)
				((NetworkPrinter)p).encrypt("Password");
			else
				System.out.println("Invalid Type : No Encryption Facility");
		}
	}
}
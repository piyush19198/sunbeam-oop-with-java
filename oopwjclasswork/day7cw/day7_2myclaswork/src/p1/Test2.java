package p1;

public class Test2 {
	public static void main(String[] args) {
		Printer p;
		
		p=new ConsolePrinter();
		p.print("New Message!! via ConsolePrinter");
		
		p=new NetworkPrinter();
		p.print("New Message!! via NetworkPrinter");
		
		p=new FilePrinter();
		p.print("New Message!! via FilePrinter");
	}
}
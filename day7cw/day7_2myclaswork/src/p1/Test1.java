package p1;

public class Test1 {
	public static void main(String[] args) {
		ConsolePrinter p1=new ConsolePrinter();
		p1.print("Test Message via ConsolePrinter");
		
		FilePrinter p2=new FilePrinter();
		p2.print("Test Message via FilePrinter");
		
		NetworkPrinter p3=new NetworkPrinter();
		p3.print("Test Message via NetworkPrinter");
		
	}
}
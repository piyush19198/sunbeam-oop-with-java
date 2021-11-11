package p1;

public class NetworkPrinter implements Printer {
	@Override
	public void print(String message) {
		System.out.println("Sending "+message+" to the server");
	}
	
	public void encrypt(String msg)
	{
		System.out.println("Encrypting a message : "+msg);
	}
}
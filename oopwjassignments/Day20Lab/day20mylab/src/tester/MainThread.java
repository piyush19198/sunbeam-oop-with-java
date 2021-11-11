package tester;

import java.util.Scanner;

import com.app.threads.EvenPrinterTask;
import com.app.threads.OddPrinterTask;

public class MainThread {
	
	static Scanner sc = new Scanner(System.in);
	static int start;
	static int end;
	
	static {
		System.out.println("Enter START and END value: ");
		start = sc.nextInt();
		end = sc.nextInt();
	}
	
	public static int getStart() {
		return start;
	}

	public static int getEnd() {
		return end;
	}
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			EvenPrinterTask e = new EvenPrinterTask();
			OddPrinterTask o = new OddPrinterTask();
			
			Thread evenT = new Thread(e,"EvenThread");
			Thread oddT = new Thread(o,"OddThread");
			
			evenT.start();
			oddT.start();

			evenT.join();
			oddT.join();
			
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}
}

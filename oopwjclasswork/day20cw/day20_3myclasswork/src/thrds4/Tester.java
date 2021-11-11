package thrds4;

import static java.lang.Thread.currentThread;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		// Thread(Runnable instance , String name)
		// create a new thread using : ano inner class
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("executing " + currentThread().getName());

			}
		}, "one");// t1 : NEW
		t1.start();// t1 : RUNNABLE		
		System.out.println(currentThread().getName() + " strted");		
		t1.join();
		System.out.println(currentThread().getName() + " over");

	}

}

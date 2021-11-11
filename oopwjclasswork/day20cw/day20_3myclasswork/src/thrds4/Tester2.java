package thrds4;

import static java.lang.Thread.currentThread;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		// Thread(Runnable instance , String name)
		// create a new thread using : lambda expression
		Thread t1 = new Thread(
				() -> System.out.println("executing " + currentThread().getName())
				, "one");// t1 : NEW
		t1.start();// t1 : RUNNABLE
		System.out.println(currentThread().getName() + " strted");
		t1.join();//main waiting for t1 to finish exec
		System.out.println(currentThread().getName() + " over");

	}

}

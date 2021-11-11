package thrds2;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//Thread[main,5,main] : 1 main (parent)
		//create multiple threads n test concurrency
		NewThread t1=new NewThread("one");
		NewThread t2=new NewThread("two");
		NewThread t3=new NewThread("three");//how many thrds are RUNNABLE : 4 (1+3)
	//	t3.start();
		//main 's B.L
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec # " + i);
			Thread.sleep(500);
		}
		//t1.start();//IllegalThrdStateExc : since dead thrds can't be restarted
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println("t1 is alive "+t1.isAlive());//t
		t1.join();//main waiting for t1 to complete
		//=>t1 over
		System.out.println("t1 is alive "+t1.isAlive());//f
		t2.join();
		t3.join();
		//=>all child thrds over
		
		System.out.println("main over....");

	}

}

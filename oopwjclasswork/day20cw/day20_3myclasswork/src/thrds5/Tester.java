package thrds5;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//Thread[main,5,main] : 1 main (parent)
		//create multiple threads n test concurrency
		MyRunnableTask task=new MyRunnableTask();//Runnable Thrds : 1 (main)
		//Thread(Runnable instance, String name)
		//attach thrds to runnable tasks
		Thread t1=new Thread(task, "one");//Runnable Thrds : 1 : state : NEW
		Thread t2=new Thread(task, "two");//Runnable Thrds : 1 : state : NEW
		
		//new --> runnable : start
		t1.start();
		t2.start();//3 runnable thrds
	
		
		//t1.start();//IllegalThrdStateExc : since dead thrds can't be restarted
		System.out.println("main waiting for child thrds to complete exec");
		System.out.println("t1 is alive "+t1.isAlive());//t
		System.out.println("main sending interrupt signal to t1");
		t1.interrupt();//main ----> interrupt ---> t1
		t2.interrupt();//main ----> interrupt ---> t2
		t1.join();//main waiting for t1 to complete
		//=>t1 over
		System.out.println("t1 is alive "+t1.isAlive());//f
		t2.join();
		System.out.println("t2 is alive "+t2.isAlive());//f
		//=>all child thrds over
		
		System.out.println("main over....");//ensuring no orphan condition

	}

}

package thrds3;
import static java.lang.Thread.*;

public class MyRunnableTask implements Runnable {
	

	@Override
	public void run()// throws InterruptedException
	{
		System.out.println("Thread " + currentThread().getName() + " strted");
		try {
			// B.L : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println(currentThread().getName() + " exec # " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println(currentThread().getName() + " got err " + e);
		}
		System.out.println("Thread " + currentThread().getName() + " over");
	}

}

package thrds1;

public class NewThread extends Thread {
	public NewThread(String name) {
		super(name);// state : NEW
		start();// state : RUNNABLE (rdy or running)
	}

	@Override
	public void run()// throws InterruptedException
	{
		System.out.println("Thread " + getName() + " strted");
		try {
			// B.L : for loop
			for (int i = 0; i < 10; i++) {
				System.out.println(getName() + " exec # " + i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(getName() + " got err " + e);
		}
		System.out.println("Thread " + getName() + " over");
	}

}

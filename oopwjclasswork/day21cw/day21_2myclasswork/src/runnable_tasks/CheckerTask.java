package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.currentThread;

public class CheckerTask implements Runnable {
	private JointAccount acct;
	

	public CheckerTask(JointAccount acct) {
		super();
		this.acct = acct;
		System.out.println("ctor invoked by "+currentThread().getName());//main
	}


	@Override
	public void run() {
		System.out.println(currentThread().getName()+" started");
		try {
			while(true)
			{
				//c2 : thrd : check balance n validate
				double balance=acct.checkBalance();
				if(balance != 5000)
				{
					System.out.println("INVALID BALANCE!!!!!!!!!!!!!!!!!!!!!!!!!");
					System.exit(1);//terminating JVM
				}
				Thread.sleep(31);
			}
		}catch (Exception e) {
			System.out.println("err in "+currentThread().getName()+" "+e);
		}
		System.out.println(currentThread().getName()+" over");

	}

}

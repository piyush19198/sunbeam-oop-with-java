package runnable_tasks;

import com.app.core.JointAccount;
import static java.lang.Thread.currentThread;

public class UpdaterTask implements Runnable {
	private JointAccount acct;
	

	public UpdaterTask(JointAccount acct) {
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
				//c1 : thrd : update balance
				acct.updateBalance(500);
				Thread.sleep(17);
			}
		}catch (Exception e) {
			System.out.println("err in "+currentThread().getName()+" "+e);
		}
		System.out.println(currentThread().getName()+" over");

	}

}

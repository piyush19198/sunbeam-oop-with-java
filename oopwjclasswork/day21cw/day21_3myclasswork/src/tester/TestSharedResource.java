package tester;

import com.app.core.JointAccount;

import runnable_tasks.CheckerTask;
import runnable_tasks.UpdaterTask;

public class TestSharedResource {

	public static void main(String[] args) throws InterruptedException{
		// create a single joint acct instance
		JointAccount a1=new JointAccount(5000);
		//create tasks , attach thrds , start them
		Thread t1=new Thread(new UpdaterTask(a1), "c1");
		Thread t2=new Thread(new CheckerTask(a1), "c2");
		t1.start();
		t2.start();
		System.out.println("waiting for child thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("main over...");
	

	}

}

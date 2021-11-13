package no_itc;
public class Utils2 {
	private Emp e;
	public synchronized void writeData(Emp ref) throws Exception {
		 System.out.println("w entered --- "+Thread.currentThread().getName());//producer
		 Thread.sleep(30);
		//produce data
		e = ref;
		System.out.println("Write Data " +e);
		 System.out.println("w exited --- "+Thread.currentThread().getName());//producer
	
	}

	public synchronized Emp readData() throws Exception {
		 System.out.println("r entered --- "+Thread.currentThread().getName());//consumer
		//consume data
		System.out.println("Read  Data " + e);
		Thread.sleep(100);//consumer : Blocked on sleep : inside monitor
		 System.out.println("r exited --- "+Thread.currentThread().getName());//consumer
	
		return e;
	}

}

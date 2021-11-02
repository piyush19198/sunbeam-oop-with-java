package generics;

public class Emp {
	public void computeSalary() {
		System.out.println("emp's compute sal");
	}
}

class Mgr extends Emp {
	@Override
	public void computeSalary() {
		System.out.println("mgr's compute sal");
	}
}

class SalesMgr extends Mgr {
	@Override
	public void computeSalary() {
		System.out.println("sales mgr's compute sal");
	}
}

class Worker extends Emp {
	@Override
	public void computeSalary() {
		System.out.println("worker's compute sal");
	}
}

class TempWorker extends Worker {
	@Override
	public void computeSalary() {
		System.out.println("temp worker's  compute sal");
	}
}

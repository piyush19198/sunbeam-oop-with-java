package generics;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Emp e =new Mgr();
		Object o=new TempWorker();
		ArrayList<Emp> emps=new ArrayList<>();
		ArrayList<Mgr> mgrs=new ArrayList<>();
//		emps=mgrs;
		ArrayList<Object> objs=new ArrayList<>();
		objs=emps;
		objs=mgrs;
		

	}

}

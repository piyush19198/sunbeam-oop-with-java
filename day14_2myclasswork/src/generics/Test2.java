package generics;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		Emp e =new Mgr();
		Object o=new TempWorker();
		ArrayList<?> emps=new ArrayList<>();//AL<Object>
		ArrayList<Mgr> mgrs=new ArrayList<>();
//		emps=mgrs;
		ArrayList<?> objs=new ArrayList<>();//AL<Object>
		objs=emps;
		objs=mgrs;
		

	}

}

package tester;

import static utils.CollectionUtils.populateSampleData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

public class TestIterators2 {

	public static void main(String[] args) {
		int[] data= {12,4,2,3,4,5,6,12,30,99,44};
		ArrayList<Integer> list=new ArrayList<>();
		for(int i : data)
			list.add(i);
		System.out.println("Orig list "+list);
		//attach Iterator
		Iterator<Integer> itr=list.iterator();
		list.add(9999);//size modified
	//	list.remove(0);
		list.set(0, 6677);
		System.out.println("List After add");
		while(itr.hasNext())
			System.out.println(itr.next());
	

	}

}

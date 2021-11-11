package tester;

import static utils.CollectionUtils.populateSampleData;

import java.util.ArrayList;
import java.util.Iterator;

import com.app.vehicles.Vehicle;

public class TestIterators3 {

	public static void main(String[] args) {
		int[] data = { 12, 4, 2, 3, 4, 5, 6, 12, 30, 99, 44 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : data)
			list.add(i);
		System.out.println("Orig list " + list);
		// attach Iterator
		Iterator<Integer> itr = list.iterator();

//		while(itr.hasNext()) {
//			itr.remove(); //java.lang.IllegalStateExc.
//		}
		while (itr.hasNext()) {
			itr.next();
		//	itr.remove(); 
		//	itr.next();
		//	itr.remove(); //java.lang.IllegalStateExc.
		}

	//	System.out.println("List after remove " + list);
	//	System.out.println(itr.next());
		

	}

}

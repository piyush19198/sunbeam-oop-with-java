package tester;

import static utils.CollectionUtils.populateSampleData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.app.vehicles.Vehicle;

public class TestIterators4 {

	public static void main(String[] args) {
		int[] data= {12,4,2,3,4,5,6,12,30,99,44};
		ArrayList<Integer> list=new ArrayList<>();
		for(int i : data)
			list.add(i);
		System.out.println("Orig list "+list);
		//print the list contents in reverse order
		ListIterator<Integer> litr=list.listIterator(list.size());//places the cursor AFTER the last element.
		while(litr.hasPrevious())
			System.out.print(litr.previous()+" ");
		//litr : -1 / before 1st elem.
		
	

	}

}

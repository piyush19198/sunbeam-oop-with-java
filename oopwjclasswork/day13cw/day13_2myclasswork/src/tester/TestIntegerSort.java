package tester;

import java.util.ArrayList;
import java.util.Collections;

public class TestIntegerSort {

	public static void main(String[] args) {
		int[] data = { 12, 4, 2, 3, 4, 5, 6, 12, 30, 99, 44 };
		ArrayList<Integer> list = new ArrayList<>();
		for (int i : data)
			list.add(i);
		System.out.println("Orig list " + list);
		Collections.sort(list);
		System.out.println("Sorted List "+list);
		
		

	}

}

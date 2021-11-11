package generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		// Creating non empty , growable Vector by copying the Integer type of refs from
		// a fixed size list
		List<Integer> list=Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10);
		Vector<Integer> v1 = new Vector<>(list);
		v1.add(0, 999);
		System.out.println(v1);
		//how to shuffle the refs from the vector ?
		//Collections API : public static void shuffle(List<?> list)
		Collections.shuffle(v1);
		System.out.println(v1);
		Collections.shuffle(list);
		System.out.println(list);
		//Can u use shuffle method to shuffle : List of Vehicle / Emp /Fruit /Date ....
		

	}

}

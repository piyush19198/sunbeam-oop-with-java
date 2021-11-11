package generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TestGenericMethod {

	public static void main(String[] args) {
		// java.util.Arrays method : raw(non generic)
		//public static <T> List<T> asList(T... args)
		//create FIXED size list of integers containing 10,20,30,40,50
		List<Integer> intList=Arrays.asList(10,20,30,40,50);
		System.out.println(intList);//[10,20,30,40,50]
		System.out.println(intList.get(intList.size()-1));//50
		System.out.println(intList.set(1, 12345));//20
		System.out.println(intList);//[10,12345,30,40,50]
		//intList.add(9999);
//		intList.remove(0); : UnsupportedOperationExc
		System.out.println(intList);
		//Can you use Array.asList to create a growable LinkedList ? YESSS
		List<String> list=Arrays.asList("1","2","3","100");
		LinkedList<String> stringList=new LinkedList<>(list);
		stringList.add("adfgsdf");
		System.out.println(stringList);
	//	list.add("dfgdf");
	}

}

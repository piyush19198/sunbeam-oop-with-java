package lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IntegerList2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Initial Contents of the list");
		for(int i : list){
			System.out.println(i);
		}
		
		int[] data = {10,23,45,-1,45,10,45,78,22,33,67};
		
		for(int i : data) {
			list.add(i);	
		}
		
		list.add(0,999);
		System.out.println("List after insert"+list);
		
		//ArrayList<Integer> list2 = new ArrayList<Integer>();
		//list2.addAll(list);
		ArrayList<Integer> list2 = new ArrayList<Integer>(list);
		System.out.println("List 2 Contents: "+list2);
		
		System.out.println(list2.set(list/*list2*/.size()-1, 5555));
		System.out.println("List after set"+list);
		System.out.println("List after set"+list2);
		
		System.out.println(list.contains(10));
		System.out.println(list.indexOf(10)+" "+list.lastIndexOf(10));
		
		//System.out.println(list);
		System.out.println(list.remove(0));
		//System.out.println(list);
		System.out.println(list.indexOf(10));
		
	}
	
}

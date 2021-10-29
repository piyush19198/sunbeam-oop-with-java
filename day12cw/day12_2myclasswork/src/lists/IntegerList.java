package lists;
import java.util.ArrayList;
import java.util.Iterator;

public class IntegerList {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("Initial Contents of the list");
		for(int i : list){
			System.out.println(i);
		}
		
		int[] data = {10,23,45,-1,45,10,45,78,22,33};
		
		for(int i : data) {
			list.add(i);	
		}
		System.out.println("List contents via toString: "+list);
		
		System.out.println("List contents via for-each: ");
		for(int i : list) {
			System.out.println(i);
		}
		
		System.out.println("List contents via for loop: ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("List contents using Iterator: ");
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(itr.next());
	}
	
}

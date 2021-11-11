package linked_list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLInkedList2 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<>();//empty linked list
		Collections.addAll(l1, "one", "two", "three", "four", "five");
		System.out.println(l1);//["one", "two", "three", "four", "five"]
		Iterator<String> itr = l1.descendingIterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		l1.add(0, "hundred");
		System.out.println(l1);

	}

}

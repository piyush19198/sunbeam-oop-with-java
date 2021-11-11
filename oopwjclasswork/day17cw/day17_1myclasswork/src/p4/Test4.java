package p4;

import static utils.CollectionUtils.*;
import static java.util.Map.Entry;

import java.util.Map;


import com.app.core.Product;

public class Test4 {

	public static void main(String[] args) {
		// get populated map of products
		Map<Integer, Product> map = populateMapFromList(populateData());
		// use higher order func : forEach
		// API of Map :
		// default void forEach(BiConsumer<? super K,? super V> action)
		// BiConsumer : Func i/f => can be replaced by lambda expr
		// SAM : public void accept(K k,V v)
		// Action supplied will be performed on all ENTRIES (=k n v pair)
		// internal iteration
		System.out.println("Products via func programming");
		map.forEach((k, v) -> System.out.println(k + ":" + v));// functional style(declarative) of programming : where prog.
																// simply tells
																// WHAT is to be done!!!!
		//Vs earlier Imperative style of prog : external iteration : prog. has to supply : WHAT n HOW
		System.out.println("Products via imperative approach");
		for(Entry<Integer, Product> e : map.entrySet())
			System.out.println(e.getKey()+":"+e.getValue());
		

	}

}

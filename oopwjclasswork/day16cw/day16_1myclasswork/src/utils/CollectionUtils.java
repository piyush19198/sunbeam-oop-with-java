package utils;

import java.util.HashMap;

import com.app.core.Book;

import static com.app.core.Category.*;
import static java.time.LocalDate.parse;

/*
 * book-0001 science 500 2020-12-03 Rama 10
book-0009 fiction 400 2010-12-14 Kishor 20
book-0003 science 1500 2021-01-3 Shubham 15
book-0005 science 600 2018-11-25 Rama 12
book-0004 health 700 2019-08-19 Rama 30
book-0004 fiction 600 2011-08-19 Ravi 20
 */
public class CollectionUtils {
//add a static method to populate n return HM with sample data
	public static HashMap<String, Book> populateSampleData() {
		// create empty Map
		HashMap<String, Book> map = new HashMap<>();// capa : 16 ,L.F = 0.75
		System.out.println("Added " + map.putIfAbsent("book-0001",
				new Book("book-0001", valueOf("SCIENCE"), 500, parse("2020-12-03"), "Rama", 10)));
		System.out.println("Added " + map.putIfAbsent("book-0009",
				new Book("book-0009", valueOf("FICTION"), 550, parse("2020-01-03"), "Anshuman", 12)));
		System.out.println("Added " + map.putIfAbsent("book-0005",
				new Book("book-0005", valueOf("SCIENCE"), 700, parse("2016-12-23"), "Rama", 13)));
	
		System.out.println("Added " + map.putIfAbsent("book-0003",
				new Book("book-0003", valueOf("SCIENCE"), 400, parse("2017-01-03"), "Rama", 18)));
		System.out.println("Added " + map.putIfAbsent("book-0001",
				new Book("book-0001", valueOf("SCIENCE"), 550, parse("2021-07-25"), "Shubham", 20)));
	
		
		return map;
	}

}

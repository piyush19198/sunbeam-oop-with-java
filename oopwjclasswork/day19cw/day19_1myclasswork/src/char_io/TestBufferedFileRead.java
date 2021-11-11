package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileRead {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines(). //Stream<String>
			filter(s -> s.length()>50). //filtered Stream<String>
			map(s -> s.toUpperCase()). //upper cased Stream<String>
			forEach(System.out::println);
			System.out.println("file read over...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

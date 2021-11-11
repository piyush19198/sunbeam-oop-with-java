package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileReadFunctionalProg {

	public static void main(String[] args) {
		System.out.println("Enter file name with path(optional)");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----- FR (text file)
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			br.lines(). //src : lines from text files : Stream<String>
			forEach(System.out::println);
			
			System.out.println("file read over...");

		} //br.close, sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}

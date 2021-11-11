package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestBufferedFileRead {

	public static void main(String[] args) {
		System.out.println("Enter file name with path(optional)");
		try (Scanner sc = new Scanner(System.in);
				// Java App <-----BR <----- FR (text file)
				BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {
			//read file data till EOF (end of stream)
			String line=null;
			while((line=br.readLine())!= null)
				System.out.println(line);
			System.out.println("file read over...");

		} //br.close, sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}

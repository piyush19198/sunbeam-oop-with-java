package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferedFileCopy {

	public static void main(String[] args) {
		System.out.println("Enter src file name n dest file name on 2 separate lines");
		try(Scanner sc=new Scanner(System.in);
				//br => buffered char i/p strm that stores data from a text file
				BufferedReader br=new BufferedReader(new FileReader(sc.nextLine()));
				//pw => buffered char o/p : that stores data to be written to the text file
				PrintWriter pw=new PrintWriter(new FileWriter(sc.nextLine()))
				)
		{
			br.lines(). //Stream<String>
			forEach(pw :: println);//s -> pw.println(s)
			System.out.println("file copy over..");
			
		} //pw.close , bw.close sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}

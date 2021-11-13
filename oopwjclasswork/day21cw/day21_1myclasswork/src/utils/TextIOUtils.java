package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.app.core.Student;

public interface TextIOUtils {
	// add a static method to write sorted list into a text file (buffering)
	static void storeDetails(List<Student> students, String fileName) throws IOException{
		// attach data strms : Java App ---> PW --> FW --> Text file
		try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			students.forEach(pw::println);
		}//pw.close

	}

}

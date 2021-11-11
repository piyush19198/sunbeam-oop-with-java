package utils;

import static utils.CollectionUtils.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.students.Student;

public interface SDsUtils {
	public static void storeStudentDetails(Map<String, Student> studentMap, String fileName) throws IOException {
		try (ObjectOutputStream OosOut = new ObjectOutputStream(new FileOutputStream(fileName))) {
			OosOut.writeObject(studentMap);
		}
	}

	public static Map<String, Student> restoreStudentDetails(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f1 = new File(fileName);
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			try (ObjectInputStream OosIn = new ObjectInputStream(new FileInputStream(fileName))) {
				return  (Map<String, Student>) OosIn.readObject();
			}
			catch (Exception e) {
				return populateMap(populateList());
			}
			
		}
		else 
			return populateMap(populateList());
	}
}

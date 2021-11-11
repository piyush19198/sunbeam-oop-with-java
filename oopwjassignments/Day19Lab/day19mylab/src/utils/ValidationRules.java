package utils;

import java.util.List;
import custom_exceptions.*;
import com.app.students.Student;

public class ValidationRules {
	public static String validateRollNo(List<Student> students,String rollNo) throws StudentHandlingException{
		
		Student s = new Student(rollNo);
		if(students.contains(s))
			throw new StudentHandlingException("Duplicate rollNo found !!");
		return rollNo;
	}
}

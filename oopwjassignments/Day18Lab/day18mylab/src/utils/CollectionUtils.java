package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.Class.Student;
import static com.app.Class.Subject.*;

import static java.time.LocalDate.*;

public interface CollectionUtils {
	static List<Student> populateList(){
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("1","name1",parse("1901-01-01"),JAVA, 6.1));
		studentsList.add(new Student("2","name2",parse("1902-02-02"),REACT, 6.2));
		studentsList.add(new Student("3","name3",parse("1903-03-03"),DBT, 6.3));
		studentsList.add(new Student("4","name4",parse("1904-04-04"),ANGULAR, 6.4));
		studentsList.add(new Student("5","name5",parse("1905-05-05"),SE, 6.5));
		studentsList.add(new Student("6","name6",parse("1906-06-06"),SE, 6.6));
		return studentsList;
	}
	
	static Map<String, Student> populateHashMap(List<Student> studentHashMapList) {
		Map<String, Student> studentsHashMap = new HashMap<String, Student>();
		for(Student s : studentHashMapList)
			studentsHashMap.put(s.getRollNoString(), s);
		return studentsHashMap;
	}
	
	static Map<Student, String> populateHashMapAnother(List<Student> studentHashMapList) {
		Map<Student, String> studentsHashMap = new HashMap<Student, String>();
		for(Student s : studentHashMapList)
			studentsHashMap.put(s, s.getRollNoString());
		return studentsHashMap;
	}
}

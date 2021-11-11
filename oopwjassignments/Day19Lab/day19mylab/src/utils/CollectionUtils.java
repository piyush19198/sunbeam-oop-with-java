package utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.time.LocalDate.*;
import com.app.students.Student;
import static com.app.students.Subject.*;

public interface CollectionUtils {
	static List<Student> populateList(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("1", "Tony", parse("1970-01-01"), valueOf("JAVA".toUpperCase()), 10.0));
		students.add(new Student("2", "Steve", parse("1890-02-02"), valueOf("dbt".toUpperCase()), 7.7));
		students.add(new Student("3", "Odinson", parse("1300-03-03"), valueOf("angular".toUpperCase()), 4.0));
		students.add(new Student("4", "Banner", parse("1940-04-04"), valueOf("react".toUpperCase()), 9.5));
		students.add(new Student("5", "Natasha", parse("1975-05-05"), valueOf("se".toUpperCase()), 8.9));
		students.add(new Student("6", "Clint", parse("1980-06-06"), valueOf("dbt".toUpperCase()), 7.6));
		return students;
	}
	static List<Student> populateKey(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("1"));
		students.add(new Student("2"));
		students.add(new Student("3"));
		students.add(new Student("4"));
		students.add(new Student("5"));
		students.add(new Student("6"));
		return students;
		
	}
		static Map<String,Student> populateMap(List<Student> list){
			HashMap<String,Student> studentMap = new HashMap<String, Student>();
			for(Student s : list)
			studentMap.put(s.getRollNo(),s);
			return studentMap;
		}
		static Map<Student,String> populateMap2(List<Student> list){
			Map<Student,String> studentMap = new HashMap<Student,String>();
			for(Student s : list)
			studentMap.put(s,s.getRollNo());
			return studentMap;
		}
	}


package tester;

import static utils.CollectionUtils.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import static java.util.Comparator.*;

import com.app.Class.*;

public class Test11 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> studentsList = populateList();

			System.out.println("\n3.Display student details from the map , sorted as per student's roll no. (desc): ");
			Comparator<Student> studentsComparator = (s1,s2)->s2.getRollNoString().compareTo(s1.getRollNoString());
			TreeMap<Student,String> studentsTreeMap = new TreeMap<Student, String>(studentsComparator);
			studentsTreeMap.putAll(populateHashMapAnother(studentsList));
			studentsTreeMap.forEach( (s,r) -> System.out.println(s));
		
		}
	}
}

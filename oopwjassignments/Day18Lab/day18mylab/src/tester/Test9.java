package tester;

import static utils.CollectionUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.app.Class.*;

public class Test9 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> studentsList = populateList();

			System.out.println("\n3.Display student details from the map , sorted as per student's roll no: ");
			TreeMap<String,Student> studentsTreeMap = new TreeMap<String,Student>(populateHashMap(populateList()));
			studentsTreeMap.forEach( (r,s) -> System.out.println(s));
		}
	}
}

package tester;

import static utils.CollectionUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.app.Class.*;

public class Test8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Student> studentsList = populateList();

			System.out.println("\n3.Display student details from the map: ");
			Map<String, Student> studentsMap = populateHashMap(populateList());
			studentsMap.forEach((r, s) -> System.out.println(s));

		}
	}
}

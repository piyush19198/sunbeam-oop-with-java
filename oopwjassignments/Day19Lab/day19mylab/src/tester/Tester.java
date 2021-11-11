package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static utils.ValidationRules.*;
import com.app.students.Student;
import com.app.students.Subject;

import custom_exceptions.StudentHandlingException;

import static utils.SDsUtils.*;
import static utils.CollectionUtils.*;

public class Tester {
	public static void main(String[] args) {
		List<Student> list = populateList();
		Map<String, Student> map = populateMap(populateList());
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			System.out.println("Enter file name :");
			map = restoreStudentDetails(sc.nextLine());
			System.out.println("DESERIALIZATION COMPLETE");

			while (!exit) {
				try {
					System.out.println("Select Operation: " 
							+ "\n1.Display all student details" 
							+ "\n2.Admit new Student"
							+ "\n3.Cancel Admission" 
							+ "\n4.EXIT");
					switch (sc.nextInt()) {
					case 1:
						map.forEach((r, s) -> System.out.println(s));
						break;
					case 2:
						System.out.println("Enter Rollno of student : ");
						String rollNo = validateRollNo(list, sc.next());
						System.out.println("Enter Student details : name,dateOfBirth,subject,gpa");
						Student s = new Student(rollNo, sc.next(), LocalDate.parse(sc.next()),
								Subject.valueOf(sc.next().toUpperCase()), sc.nextDouble());
						map.put(rollNo, s);
						break;

					case 3:
						System.out.println("Enter RollNo : ");
						rollNo = sc.next();
						if (map.remove(rollNo, new Student(validateRollNo(list, rollNo))))
							System.out.println("!!!STUDENT REMOVED!!!");
						else
							throw new StudentHandlingException("!!!STUDENT DOES NOT EXIST!!!");
						break;

					case 4:
						System.out.println("Before Exiting \nEnter file name : ");
						storeStudentDetails(map, sc.next());
						System.out.println(" Storing completed");
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();

				}
				sc.nextLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

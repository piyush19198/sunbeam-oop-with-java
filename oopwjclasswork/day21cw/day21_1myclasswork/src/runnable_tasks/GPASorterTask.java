package runnable_tasks;
import static java.lang.Thread.currentThread;
import static utils.StudentCollectionUtils.*;
import static utils.TextIOUtils.*;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;

public class GPASorterTask implements Runnable {
	//state
	private Map<String, Student> students;
	private String fileName;
	

	public GPASorterTask(Map<String, Student> students, String fileName) {
		super();
		this.students = students;
		this.fileName = fileName;
		System.out.println("in thrd's ctor called by "+currentThread().getName());//main
	}


	@Override
	public void run() {
		System.out.println(currentThread().getName()+" strted");//gpa
		try {
			//save sorted student details as per GPA : in text file
			//public static List<Student> sortStudents(Map<String, Student>map,Comparator<Student> comp)
			storeDetails(sortStudents(students,Comparator.comparing(Student::getGpa)),fileName);//sorting + saving
		} catch (Exception e) {
			System.out.println("err in "+currentThread().getName()+" "+e);
		}
		System.out.println(currentThread().getName()+" over");

	}

}

package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DoBSorterTask;
import runnable_tasks.GPASorterTask;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			//get populated sample map from collection utils
			Map<String, Student> map = populateMap(populateList());
			//accept file names
			System.out.println("Enter filenames for GPA n Dob Sorted data files");
			//create runnable task instance n attach a thread to it
			//Thread(Runnable task,String thrdName)
			Thread t1=new Thread(new GPASorterTask(map,sc.next()),"gpa");
			Thread t2=new Thread(new DoBSorterTask(map,sc.next()),"dob");//runnable : 1 
			t1.start();
			t2.start();
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			System.out.println("main over...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

package dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			System.out.println("Enter Join Date: day-mon-yr");
			Date joinDate=sdf.parse(sc.next());
			System.out.println("Join Date "+joinDate);
			System.out.println("Formatted Join Date"+sdf.format(joinDate));
			System.out.println("End of try...");
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
		System.out.println("Main continues...");
	}

}
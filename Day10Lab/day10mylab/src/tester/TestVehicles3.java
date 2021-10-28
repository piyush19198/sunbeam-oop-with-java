package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

/*
 * Create a class TestVehicle under the package "tester"
Accept details of 2 vehicles from user . 
Display "SAME" or "DIFFERENT" , in case of same or different chasis nos.
Hint : invoke equals
 */
public class TestVehicles3 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter 1st vehicle details : chasis no clr price");
			//indirect ref.
			Object v1=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());//up casting
			System.out.println("Enter 2nd vehicle details :  chasis no clr price");
			Object v2=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());
			
			System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
			String s="hello";
			System.out.println(v1.equals(s)?"SAME":"DIFFERENT");
			System.out.println(v1.equals(null)?"SAME":"DIFFERENT");
			
			
		}//sc.close()

	}

}
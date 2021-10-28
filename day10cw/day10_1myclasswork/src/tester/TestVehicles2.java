package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

/*
 * Create a class TestVehicle under the package "tester"
Accept details of 2 vehicles from user . 
Display "SAME" or "DIFFERENT" , in case of same or different chasis nos.
Hint : invoke equals
 */
public class TestVehicles2 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter 1st vehicle details : chasis no clr price");
			Vehicle v1=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());
			System.out.println("Enter 2nd vehicle details :  chasis no clr price");
			Vehicle v2=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());
			
			System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
			
			
		}//sc.close()

	}

}
package tester;

import java.util.Scanner;

import com.app.vehicles.Vehicle;

public class TestVehicles {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter 1st vehicle details : chasis no clr price");
			Vehicle v1=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());
			System.out.println("Enter 2nd vehicle details :  chasis no clr price");
			Vehicle v2=new Vehicle(sc.nextInt(), sc.next(),sc.nextDouble());
			System.out.println(v1.equals(v2)?"SAME":"DIFFERENT");
		
		}
	}

}
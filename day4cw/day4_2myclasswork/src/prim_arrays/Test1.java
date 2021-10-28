package prim_arrays;

import java.util.Scanner;

/*
 * Objective -- Accept no of data samples(of type double) from User(using scanner)
Create suitable array & display it using for-loop , to confirm default values.

Accept data from User(scanner) & store it in the array.
Display array data using  for loop.

Display array data using for-each loop

 */
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Data Samples in array : Double");
		double[] data; 
		data=new double[sc.nextInt()];
		
		System.out.println("Name of the class loaded for array: "+data.getClass());
		System.out.println("Default contents of array");
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		
		System.out.println("Inited contents of array");
		
		for(int i=0;i<data.length;i++)
			System.out.println(data[i]);
		
		System.out.println("Inited contents of array using for-each");
		for(double d:data) {
			System.out.println(d);
			d*=2; // will not give error but will not be performed
		}
			
		sc.close();
	}

}
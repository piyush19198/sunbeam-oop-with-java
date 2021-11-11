package prim_arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Data Samples in array : Double");
		double[] data; 
		data=new double[sc.nextInt()];
		
		System.out.println("Name of the class loaded for array: "+data.getClass());
		System.out.println("Default contents of array");
		
		for(double d1 : data)
			System.out.println(d1);
		
		for(int i=0;i<data.length;i++) {
			System.out.println("Enter array data");
			data[i]=sc.nextDouble();
		}
		
		System.out.println("Inited contents of array");
		
		System.out.println("Array contents with Arrays.toString"+Arrays.toString(data));
		
		System.out.println("Inited contents of array using for-each");
		for(double d:data) {
			System.out.println(d);
			d*=2; // will not give error but will not be performed
		}
	
		sc.close();
	}

}
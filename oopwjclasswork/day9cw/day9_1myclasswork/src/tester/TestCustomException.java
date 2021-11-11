package tester;
import static utils.SpeedUtils.validateSpeed;
import java.util.Scanner;
import custom_exceptions.SpeedOutOfRangeException;

public class TestCustomException {
	
	public static void main(String[] args) throws SpeedOutOfRangeException{
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the speed.");
			validateSpeed(sc.nextInt());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("MAIN OVER...");
	}
}
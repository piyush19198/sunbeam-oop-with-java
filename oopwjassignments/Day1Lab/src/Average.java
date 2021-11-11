// Accept 2 double values from User (using Scanner). Check data type.
// If arguments are not doubles , supply suitable error message & terminate.
// If numbers are double values , print its average.

import java.util.*;

public class Average {
    public static void main (String args[]) {
        double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextDouble();
        if(a%1==0) {
            System.out.println("Enter valid number");
        } else{
            System.out.println("Enter 2nd Number");
            b=sc.nextDouble();
            if(b%1==0) {
                System.out.println("Enter valid number");
            }
            else {
                c=a+b;
                d=c/2;
                System.out.println("Avg of "+a+" and "+b+" is "+d);
            }
        }
    }
}


// import java.util.*;;

// public class Average {
//     public static void main (String args[]) {
// 		double a, b, c, d;
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter number");
// 		a=sc.nextDouble();
// 		if(a%1==0) {
// 			System.out.println("Enter valid number");
// 		} else{
// 			System.out.println("Enter 2nd Number");
// 			b=sc.nextDouble();
// 			if(b%1==0) {
// 				System.out.println("Enter valid number");
// 			}
// 			else {
// 				c=a+b;
// 				d=c/2;
// 				System.out.println("Avg of "+a+" and "+b+" is "+d);
// 			}
// 		}

//     }
// }



// import java.util.*;

// public class Average {
//     public static void main(String[] args) {
//         String str = "4.a";
//         // String str = "1.0";
//         if(str.contains(".")) {
//             if(str.contains("[^A-Za-z]")){    
//                 System.out.println("You have provided character, Please provide double input.");
//             }else{
//                 System.out.println("Number is double.");
//             }
//         }
//         else {
//             System.out.println("Please Provide double input.");
//         }
//     }
// }
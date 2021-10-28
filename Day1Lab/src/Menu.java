import java.util.Scanner;

// Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) 
// Assign fixed prices to food items(hard code the prices)
// When user enters 'Generate Bill' option(10) , display total bill & exit.


    
class Menu{
    double subTotal;
    double itemPrice;
    static boolean ordering = true;
    
    public static void main(String[] args) {
        
        int menuOption;
        int foodItem = 0;
        Scanner input = new Scanner(System.in);
        double runningTotal=0;
       
        do{
            menuOption = input.nextInt();
            switch(menuOption){
                case 1:
                foodItem = 1;
                runningTotal += itemPrice(foodItem);
                break;
            case 2:
                foodItem = 2;
                runningTotal += itemPrice(foodItem);
                break;
            case 3:
                foodItem = 3;
                runningTotal += itemPrice(foodItem);
                break;
            case 4:
                done(runningTotal);
                break;
            default:
                System.out.println("Invalid option.");
            }
        } while(ordering);
        System.out.println("Total amount: " + runningTotal);
    }
  
    private static void done(double runningTotal) {
        boolean ordering = false;
        System.out.println(runningTotal);
        System.out.println("Enjoy your meal");
    }

    private static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            System.out.println("You've ordered a burger");
            itemPrice = 2.00;
        }
        if (foodItem == 2) {
            System.out.println("You've ordered fries");
            itemPrice = 1.50;
        }
        if (foodItem == 3) {
            System.out.println("You've ordered a soda");
            itemPrice = 1.00;
        }
        quantity();
        return itemPrice;
    }
}



// class Menu{
//     public static void main(String[] args) {
//         int choice;
//         int q;
//         int price;
//         int total=0;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Food Menu: \n1.Dosa \n2.Samosa \n3.Idli \n10.Generate Bill");
//         choice = sc.nextInt();
//         if(choice<0 && choice>4){
//            switch (choice) {
//                 case 1:
//                     price=20;
//                     System.out.println("Enter quantity: ");
//                     q=sc.nextInt();
//                     total=q*price;
//                     break;
//                 case 2:
//                     price=10;
//                     System.out.println("Enter quantity: ");
//                     q=sc.nextInt();
//                     total=q*price;
//                     break;
//                 case 10:
//                     System.out.println("Your total bill is"+total);
//                     break;
//                 default:
//                     break;
//             }
//         }else{
//             System.out.println("Please enter valid choice.");
//         }
        
//         sc.close();
//     }
// }
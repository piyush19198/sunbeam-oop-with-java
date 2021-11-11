package tester;

import java.util.Scanner;

import com.app.core.FoodMenu;
import static com.app.core.FoodMenu.*;

public class FoodBillGenerator {

    private static StringBuilder avaialbleItems;

    public static void main(String[] args) {
        int bill = 0;
        try (Scanner sc = new Scanner(System.in)) {
            boolean exit = false;
            StringBuilder availableItems = new StringBuilder("Menu : \n");
            for (FoodMenu m : values())
                availableItems.append(m + " ");

            while (!exit) {
                System.out.println(availableItems);
                System.out.println("Choose Item n Qty or exit to place the order");
                FoodMenu item = valueOf(sc.next().toUpperCase());

                switch (item) {
                case NOODLES:
                case RICE:
                case SOUP:
                case SNACKS:
                    bill += (sc.nextInt() * item.getPrice());
                    break;

                default:
                    break;
                }
            }
        } // sc.close()
        catch (IllegalArgumentException e) {
            System.out.println("Error "+e);
            System.out.println("Order completed , Total Bill ="+bill);
        }


    }

}
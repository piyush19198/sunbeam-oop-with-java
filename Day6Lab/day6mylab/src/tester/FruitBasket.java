package tester;
import com.app.fruits.*;
import java.util.*;

public class FruitBasket {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of basket: ");
		Fruit[] basket = new Fruit[sc.nextInt()];
		
		int counter=0;
		
		boolean exit=false;
		while(!exit) {
			System.out.println("\n\nSelect operation\n"
					+ "1. Add Apple\n"
					+ "2. Add Mango\n"
					+ "3. Add Orange\n"
					+ "4. Display name of all fruits in basket\n"
					+ "5. Display name, color, taste and weight of all fruits\n"
					+ "6. Display taste of all stale(not fresh) fruits\n"
					+ "7. Mark a fruit as stale\n"
					+ "8. Mark all sour fruits as stale\n"
					+ "9. Display taste and specific functionality of all fruits\n"
					+ "10. Exit");
			switch (sc.nextInt()) {
			case 1:
				if(counter<basket.length) {
					System.out.println("Enter Name, color and weight of Apple: ");
					basket[counter++] = new Apple(sc.next(),sc.next(),sc.nextDouble());
				}else System.out.println("Basket is full!!!");
				break;
			case 2:
				if(counter<basket.length) {
					System.out.println("Enter Name, color and weight of Mango: ");
					basket[counter++] = new Mango(sc.next(),sc.next(),sc.nextDouble());
				}else System.out.println("Basket is full!!!");
				break;
			case 3:
				if(counter<basket.length) {
					System.out.println("Enter Name, color and weight of Orange: ");
					basket[counter++] = new Orange(sc.next(),sc.next(),sc.nextDouble());
				}else System.out.println("Basket is full!!!");
				break;
			case 4:
				for(Fruit f :basket) 
					if(f!=null) {
							System.out.println(f.getName());
					}else System.out.println("No fruit here.");
				break;
			case 5:
				for(Fruit f :basket) {
					if(f!=null) {
						if(f.isFresh()==true) {
							System.out.println(f+" tastes "+f.taste());
						}
					}else System.out.println("No fruit here.");
				}
				break;
			case 6:
				for(Fruit f:basket) {
					if(f!=null) {
						if(f.isFresh()==false) {
							System.out.println(f.getName()+" fruit is "+f.taste());
						}
					}else {
						System.out.println("No fruit is stale");
					}
				}
				break;
			case 7:
				System.out.println("Enter Index of fruit to	 identify it as STALE");
				int index=sc.nextInt();
				if(index>=0 && index<basket.length) {
					basket[index].setFresh(false);
				}else System.out.println("Enter valid index.");
				break;
			case 8:
				for(Fruit f : basket) {
					if(f!=null) {
						if(f.taste()=="sour") {
							f.setFresh(false);
							System.out.println("Marked"+f.getName()+"as STALE.");
						}
					}
				}
				break;
			case 9:
				for(Fruit f : basket) {
					if(f!=null) {
						if(f instanceof Apple) {
							((Apple)f).jam();
						}else if(f instanceof Orange) {
							((Orange)f).juice();
						}else if(f instanceof Mango) {
							((Mango)f).pulp();
						}else
							System.out.println("Enter valid fruit.");
					}
				}
				break;
			case 10:
					exit=true;
					System.out.println("Thank you for using fruit basket");
				break;
			default:
				System.out.println("Please Enter valid operation");
				break;
			}
		}
	}
}

package tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.app.crickter.Crickter;
import static utils.CrickterUtils.*;

public class CrickterTest {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			
			ArrayList<Crickter> crickters = new ArrayList<Crickter>();
			boolean exit = false;
			
			while(!exit) {
				System.out.println("\nSelect operation from menu mentioned below.\n");
				System.out.println("1.Add Crickter.\n"
						+ "2.Modify Crickter's rating\n"
						+ "3.Search Crickter by name\n"
						+ "4.Display all Cricketers added in collection.\n"
						+ "5.Display All Crickters in sorted form by rating.\n"
						+ "6.EXIT");
				try {
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Enter details of Crickter in following order: "
								+ "\nName -- Age -- EmailID -- Phone -- Rating: ");
						Crickter c = addCrickter(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
						crickters.add(c);
						System.out.println("---Crickter added successfully---");
						break;
					
					case 2:
						System.out.println("Enter Email Id of crickter to change rating: ");
						c=searchByEmail(sc.next(), crickters);
						System.out.println("Enter rating to update for "+c);
						c.setRating(sc.nextInt());
						System.out.println("Updated Rating is \n"+c);
						break;
						
					case 3: 
						System.out.println("Enter name of crickter: ");
						String nameSearch = sc.next();
						for(Crickter cSearchByName : crickters) {
							if(cSearchByName.getName().equals(nameSearch))
								System.out.println(cSearchByName);
						}
						break;
						
					case 4:
						System.out.println("All Crickters in record are: \n");
						for (Crickter cDisplayAll : crickters) {
							System.out.println(cDisplayAll);
						}
						break;
						
					case 5:
						System.out.println("All crickters in sorted form of rating are: \n");
//						Collections.sort(crickters,new Comparator<Crickter>() {
//							@Override
//							public int compare(Crickter c1, Crickter c2) {
//								return c1.getRating().compareTo(c2.getRating());
//							}
//						});
						
						
//						Collections.sort(crickters,new sortByRating() {
//							public int compare(Crickter c1, Crickter c2) {
//								return c1.getRating() - c2.getRating();
//							}
//						});
//						for(int i=0;i<crickters.size();i++) {
//							System.out.println(crickters.get(i));
//						}
						
						Collections.sort(crickters,new Comparator<Crickter>() {
							@Override
							public int compare(Crickter c1, Crickter c2) {
								return c1.getRating() - c2.getRating();
							}
						});
						for(int i=0;i<crickters.size();i++) {
							System.out.println(crickters.get(i));
						}
//						System.out.println(crickters);
						break;
					case 6:
						exit = true;
						break;
					default:
						System.out.println("!!!PLEASE ENTER VALID OPERATION!!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
				sc.nextLine(); //To clear the String Buffer to avoid looping
			}
		}
	}
	
}

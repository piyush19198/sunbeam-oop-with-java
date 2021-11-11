package test_inheritance;

import java.util.Scanner;
import inheritance.*;

public class EventOrganizer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Event Capacity");
		Person[] participants = new Person[sc.nextInt()];
		
		int counter=0; //Number of participants
		boolean exit=false;
		
		while(!exit) {
			System.out.println(
					"Options\n1. Register Student \n2. Register Faculty \n3. Display Pariticipants' Details \n4. Display specific Participant's details \n10.Exit");
			System.out.println("Choose Option");
		}
		switch (sc.nextInt()) {
		case 1:
			if(counter<participants.length) {
				System.out.println("Enter Student details: fn,ln,gradYear,courseName,fees,marks");
				participants[counter++]=new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
				
			}else System.out.println("Event Full!");
			break;
			
		case 2:
			if(counter<participants.length) {
				System.out.println("Enter Faculty details: fn,ln,experienceInYrs,sme");
				participants[counter++]=new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());		
			}else System.out.println("Event Full!");
			break;
			
		case 3:
			for(Person p : participants) {
				if(p !=null)
				System.out.println(p);
			}
			break;
		case 4:
			System.out.println("Enter seat no");
			int index=sc.nextInt()-1;
			if(index>=0 && index<counter) {
				Person p = participants[index];
				System.out.println(p);
				((Student)p).study();
			}else
				System.out.println("Invalid seat number");
			break;
		case 10:
			exit = true;
			break;
		default:
			break;
		}
		
		sc.close();
	}

}
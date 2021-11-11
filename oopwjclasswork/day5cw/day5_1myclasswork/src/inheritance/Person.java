package inheritance;

public class Person {
	private String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		super();
		System.out.println("Inside Person's Constructor");
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
}

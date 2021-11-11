package inheritance;

public class Student extends Person {
	private int gradYear;
	private String courseName;
	private double fees;
	private int marks;
	
	public Student(String fn, String ln, int gradYear,String courseName,double fees,int marks) {
		super(fn,ln);
		System.out.println("Inside Student's Constructor");
		this.gradYear=gradYear;
		this.courseName=courseName;
		this.fees=fees;
		this.marks=marks;
	}
	
	public String toString() {
		return "Student "+super.toString()+" passed in "+gradYear+" course "+courseName+" fees paid "+fees+" marks "+marks;
	}
}

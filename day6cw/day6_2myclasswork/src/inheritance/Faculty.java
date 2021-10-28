package inheritance;

public class Faculty extends Person {
	private int experienceInYrs;
	private String sme;
	
	public Faculty(String fn1,String ln1,int yrs,String sme){
		super(fn1,ln1);
		System.out.println("Inside Faculty's Constructor");
		experienceInYrs=yrs;
		this.sme=sme;
	}
	
	@Override
	public String toString() {
		return "Faculty "+super.toString()+" exp in yrs "+experienceInYrs+" expert in "+sme;
	}
	
	public void teach() {
		System.out.println(getLastName()+" teaching courses in "+sme);
	}
}

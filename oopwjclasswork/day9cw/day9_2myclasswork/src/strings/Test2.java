package strings;

public class Test2 {
	public static void main(String[] args) {
		String s1=new String("Testing Strings");
		String s2=new String("Testing Strings");
		
		System.out.println(s1==s2);//false since it checks reference equality
		System.out.println(s1.equals(s2));//true since it checks content
	}

}

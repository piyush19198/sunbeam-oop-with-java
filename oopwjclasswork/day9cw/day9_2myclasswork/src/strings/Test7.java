package strings;

public class Test7 {

	public static void main(String[] args) {
		String s1="abcd";
		String s2=new String(s1);
		System.out.println(s1==s2);//f
		System.out.println(s1.hashCode());//String class has overridden hashCode method inherited from Object class
		//to replace addr returning version by unique int value based upon it's content 
		// s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
		System.out.println(s2.hashCode());

	}

}
package strings;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("Testing Strings".charAt(0)+" "+"Testing Strings".charAt("Testing Strings".length()-1));
		String s2=new String("Strings are cool Strings!!!!!");
		System.out.println(s2.charAt(s2.length()-1));
		System.out.println(s2.contains("cool"));//true
		System.out.println(s2.indexOf("Strings")+" "+s2.lastIndexOf("Strings"));
		String s1="hello";
		String s3=s1.toUpperCase();
		System.out.println(s1.compareTo(s3));//>0
		System.out.println("Amish".compareTo("Amizi"));// < 0 
	}
}

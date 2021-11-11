package strings;

public class Test3 {
	public static void main(String[] args) {
		String s1="hello";//s1 ---> literal string object
		String s2=new String(s1);//s2 ---> non literal string
		String s3="hello";//s3 --> literal string
		String s4="Hello";//s4 --> literal
		
		System.out.println(s1==s2);//f
		System.out.println(s1.equals(s2));//t
		System.out.println(s1==s3);//true : SCP
		System.out.println(s1.equals(s3));//t
		System.out.println(s1==s4);//f
		System.out.println(s1.equals(s4));//f
		System.out.println(s1.equalsIgnoreCase(s4));//t
		System.out.println(s1.hashCode()+" "+s2.hashCode());//same 
		String s6=s2.intern();
		System.out.println(s1==s6);//true
		String s7=new String("testing 12345");
		String s8=s7.intern();
		System.out.println(s7==s8);//false
		String s9="testing 12345";
		System.out.println(s7 ==s9);//f
		System.out.println(s8==s9);//t
		
	}

}

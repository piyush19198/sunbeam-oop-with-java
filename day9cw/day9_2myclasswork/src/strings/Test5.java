package strings;

public class Test5 {
	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder("hello");
		System.out.println("Contents "+sb1+" length "+sb1.length()+" capa "+sb1.capacity());
		StringBuilder sb2=sb1.append(123.45);
		System.out.println("sb2's contents "+sb2);//hello123.45
		System.out.println("sb1's contents "+sb1);//hello123.45
		System.out.println(sb1==sb2);//true
		StringBuilder sb3=new StringBuilder("testing SB");
		StringBuilder sb4=new StringBuilder("testing SB");
		System.out.println(sb3==sb4);//false (ref. equality)
		System.out.println(sb3.equals(sb4));//false : Has SB class overridden equals method of Object class ? 
		//NO --i.e it's using the inherited version. : Object's equals : ref equality
		sb2=sb1.append(true).append(1234).append(12.3456F).append("something!");
		System.out.println(sb1);//appended 
		System.out.println(sb2);//appended
		System.out.println(sb1==sb2);//t
		sb1.reverse();
		System.out.println(sb1);//reversed 
	}	
}

package dates;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		Date d1=new Date();
		Date d2=new Date(1000);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
		System.out.println(d1.before(d2));
		System.out.println(d1.after(d2));
		System.out.println(d1.compareTo(d2));
	}

}
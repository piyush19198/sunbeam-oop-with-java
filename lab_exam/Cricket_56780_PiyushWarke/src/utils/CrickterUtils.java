package utils;

import java.util.ArrayList;

import com.app.crickter.Crickter;

public class CrickterUtils {

	//To add/populate the arraylist with instances
	public static Crickter addCrickter(String name, int age, String email_id, String phone, int rating) {	
		return new Crickter(name, age, email_id, phone, rating);
	}
	
	//To identify if instance exists or not
	public static Crickter searchByEmail(String email_id,ArrayList<Crickter> crickters) {
		Crickter c = new Crickter(email_id);
		int index = crickters.indexOf(c);
		if(index==-1) {
			System.out.println("!!!NO SUCH CRICKTER EXISTS IN RECORD!!!");
		}
		return crickters.get(index);
	}
	
	public static String validateEmailId(String email_id) {
		if(email_id.contains("@") && email_id.endsWith(".com"))
			return email_id;
		return "!!!INVALID EMAIL ID!!!";
	}
	
}

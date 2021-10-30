package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import com.app.core.Customer;
import com.app.core.CustomerPlan;
import custom_exceptions.CustomerHandlingException;
import static com.app.core.Customer.sdf;

public class ValidationRules {
	
	private static Date thresholdDate;
	
	static {
		try {
			thresholdDate=sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("!!!ERROR IN STATIC INITIALIZER BLOCK OF THRESHOLD DATE!!!");			
			e.printStackTrace();
		}
	}
	
	//All Input Validation Method
	public static Customer validateCustomerInputs(ArrayList<Customer> custList, String name, String email, String password, 
			double regAmount, String dob, String plan) 
					throws CustomerHandlingException, ParseException {
		validateEmailDuplication(email, custList);
		Date d = parseValidateDoB(dob);
		CustomerPlan customerPlan = validatePlan(plan);
		return new Customer(name, email,password, regAmount, d, customerPlan);
	}
	
	//Duplicate Email Validation Method
	public static void validateEmailDuplication(String email, ArrayList<Customer> customers) throws CustomerHandlingException {
		if (email.contains("@") && email.endsWith(".com")) {
			Customer c=new Customer(email);
			if(customers.contains(c))
				throw new CustomerHandlingException("!!!DUPLICATE EMAIL ID --- CUSTOMER ALREADY REGISTERED!!!");
			return ;
		}
		throw new CustomerHandlingException("!!!INVALID EMAIL FORMAT!!!");
	}
	
	//Login Email Validation Method
	public static String validateLoginEmail(String email) throws CustomerHandlingException {
		if (!((email.contains("@")) && (email.endsWith(".com"))))
			throw new CustomerHandlingException("!!!INVALID EMAIL!!!");
		return email;
	}
	
	//Login Password Validation Method
	public static String validateLoginPassword(String password) throws CustomerHandlingException {
		if (password.length() < 3 && password.length() > 11)
			throw new CustomerHandlingException("!!!INVALID PASSWORD!!!");
		return password;
	}
	
	//Date Validation Method
	public static Date parseValidateDoB(String dob) throws ParseException, CustomerHandlingException {
		Date d=sdf.parse(dob);
		if(d.before(thresholdDate))
			return d;
		else
			throw new CustomerHandlingException("!!!INVALID DATE!!!");
	}
	
	//Plan Validation Method
	public static CustomerPlan validatePlan(String plan) {
		return CustomerPlan.valueOf(plan.toUpperCase());
	}
	
	//LoginValidation Method
	public static Customer validateLogin(String email, String password, ArrayList<Customer> custLogin) throws CustomerHandlingException {
		for(Customer c : custLogin) {
			if((c.getEmail().equals(email))&&(c.getPassword().equals(password)))
				return c;
		}
		throw new CustomerHandlingException("!!!EMAIL AND PASSWORD DOES NOT MATCH!!!");
	}
	
	
}

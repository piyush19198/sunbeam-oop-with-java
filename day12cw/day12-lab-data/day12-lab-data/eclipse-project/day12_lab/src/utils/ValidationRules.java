package utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.CustomerPlan;

import custom_exception.CustomerHandlingException;
import static com.app.core.Customer.sdf;

/*
 * 4.3 Create in "utils" package : ValidationRules
Rules 
email must contain "@" & should be from ".com" domain
password must be min 4 max 10 chars long
reg amount should be multiples of 500
dob should be before 1st Jan 1995
no duplicate registrations.
 */

public class ValidationRules {
	private static Date thresholdDate;
	static {
		try {
			thresholdDate = sdf.parse("1-1-1995");
		} catch (ParseException e) {
			System.out.println("Errin in static init block " + e);
		}
	}

	// add a single method to validate all inputs
	public static Customer validateCustomerInputs(ArrayList<Customer> custList, String email, 
			String dob, String plan,double regAmount,String name,String password)
			throws CustomerHandlingException, ParseException {
		validateEmail(email, custList);
		Date d = parseValidateDoB(dob);
		CustomerPlan customerPlan = validatePlan(plan);
		return new Customer(name, email,password, regAmount, d, customerPlan);

	}

//add a staic method for email validation
	public static void validateEmail(String email, ArrayList<Customer> customers) throws CustomerHandlingException {
		// email must contain "@" & should be from ".com" domain
		if (email.contains("@") && email.endsWith(".com")) {
			// for chking dups : AL's contains method
			Customer c = new Customer(email);// wrap PK(email) in customer instance
			if (customers.contains(c))
				throw new CustomerHandlingException("Dup Email ID!!!!!");
			// => valid
			return;
		}
		throw new CustomerHandlingException("Invalid Email Format!!!!");

	}

	// parse n validate DoB
	public static Date parseValidateDoB(String dob) throws ParseException, CustomerHandlingException {
		Date d = sdf.parse(dob);
		// validate
		if (d.before(thresholdDate))
			return d;
		throw new CustomerHandlingException("Invalid Date");
	}

	// parse n validate customer's chosen plan
	public static CustomerPlan validatePlan(String plan) {
		return CustomerPlan.valueOf(plan.toUpperCase());
	}
}

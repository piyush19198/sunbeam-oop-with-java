package utils;

import static com.app.vehicles.Vehicle.sdf;

import java.text.ParseException;
import java.util.Date;

import com.app.vehicles.Category;
import com.app.vehicles.Color;
import com.app.vehicles.Vehicle;

import custom_exceptions.VehicleHandlingException;

public class ValidationRules {
	private static Date strtDate, endDate;
	static {
		try {
			strtDate = sdf.parse("2021-4-1");
			endDate = sdf.parse("2022-3-31");
		} catch (ParseException e) {
			System.out.println("Err in static init block " + e);
		}
	}

//add a static method to parse n validate manufacturing date
	public static Date parseAndValidateManufactureDate(String manuDate)
			throws ParseException, VehicleHandlingException {
		// parse
		Date d1 = sdf.parse(manuDate);// in case of invalid pattern : JVM will throw : ParseExc
		// =>parsing successful ---continue to validation

		if (d1.before(strtDate) || d1.after(endDate))
			throw new VehicleHandlingException("Invalid Manufacture Date!!!!!");
		// => parsing n validation : success
		return d1;// ret parsed n validated date cls instance to the caller (Tester)

	}

	// add a static method to check for dup chasis no : based upon Vehicle's equals
	// method
	public static String checkForDuplicate(String chasisNo, Vehicle[] showroom) throws VehicleHandlingException {
		// iterate over the Vehicle[] --equals -- true =>dup is found -->throw exc
		// equals : false for all existing vehicles in the showroom => no dup --->
		// chasisNo
		// Encapsulate chasis no details in the Vehicle class instance : call overloaded
		// ctor
		Vehicle newVehicle = new Vehicle(chasisNo);// "abc1234"
		// {v1("abc"),v2("xyz"),null.....null}
		for (Vehicle v : showroom)// v=v1, v=v2
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup Chasis found!!!!");
		return chasisNo;// rets validated non dup chasis no to the caller.
	}

	// add static method for : parsing (string ---> Category:Enum) + validatation
	public static Category parseAndValidateCategory(String categoryName) throws VehicleHandlingException {
		try {
			return Category.valueOf(categoryName.toUpperCase());
		} catch (IllegalArgumentException e) {
			// => invalid category
			StringBuilder sb = new StringBuilder("Invalid Category!!!!\n");
			sb.append("Supported Categories :\n");
			for (Category c : Category.values())
				sb.append(c + " ");// c.toString()
			// sop(sb)
			// raise custom exc : to alter the flow of exec n alert the user.
			throw new VehicleHandlingException(sb.toString());

		}
	}

	// add a static method for parsing n validating vehicle color
	public static Color parseAndValidateColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}

	// add a finder method in ValidationRules to find the vehicle by its PK : chasis
	// no
	public static Vehicle findByChasisNo(String chasisNo, Vehicle[] vehicles) throws VehicleHandlingException {
		// create vehicle instance by wrapping chasisNO(PK)
		Vehicle v1 = new Vehicle(chasisNo);
		for (Vehicle v : vehicles)
			if (v != null)
				if (v.equals(v1))// => vehicle found
					return v;
		// => vehicle not found
		throw new VehicleHandlingException("Vehicle not found : invalid chasis no!!!!!");
	}

}

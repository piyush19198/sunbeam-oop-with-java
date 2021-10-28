package utils;

import static com.app.vehicles.Vehicle.sdf;
import java.text.ParseException;
import java.util.Date;
import com.app.vehicles.Category;
import com.app.vehicles.Colors;
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
	public static Date parseAndValidateManufactureDate(String manuDate)
			throws ParseException, VehicleHandlingException {
		Date d1 = sdf.parse(manuDate);
		if (d1.before(strtDate) || d1.after(endDate))
			throw new VehicleHandlingException("Invalid Manufacture Date!!!!!");
		return d1;

	}

	public static String checkForDuplicate(String chasisNo, Vehicle[] showroom) throws VehicleHandlingException {

		Vehicle newVehicle = new Vehicle(chasisNo);
		for (Vehicle v : showroom)
			if (v != null)
				if (v.equals(newVehicle))
					throw new VehicleHandlingException("Dup Chasis found!!!!");
		return chasisNo;
	}
	public static Category parseAndValidateCategory(String categoryName)
	{
		return Category.valueOf(categoryName.toUpperCase());
	}
	
	public static Colors parseAndValidateColors(String colorName)
	{
		return Colors.valueOf(colorName.toUpperCase());
	}
	
}

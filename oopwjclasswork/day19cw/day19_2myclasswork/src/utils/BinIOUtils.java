package utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;

import com.app.core.Category;
import com.app.core.Product;

public interface BinIOUtils {
//add a static method to store a product details in a bin file
	static void storeProductDetails(Product p, String fileName) throws IOException {
		// Java App --> DOS --> FOS --> bin file
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(fileName))) {
			// int id, String name, Category productCatgeory, LocalDate manufactureDate,
			// double price)
			// id
			out.writeInt(p.getId());// id ---> 4 bytes
			out.writeUTF(p.getName());// name
			out.writeUTF(p.getProductCatgeory().toString());// category--> string --> bytes
			out.writeUTF(p.getManufactureDate().toString());// date --> string --> bytes
			out.writeDouble(p.getPrice());
		}
	}

	// add a static method for validation n reading the data
	static Product restoreProductDetails(String fileName) throws IOException {
		// create File class instance to wrap file path n name
		File f1 = new File(fileName);
		if (f1.exists() && f1.isFile() && f1.canRead()) {
			// validations success --> chain of i/o strms
			try (DataInputStream in = new DataInputStream(new FileInputStream(f1))) {
				// int id, String name, Category productCatgeory, LocalDate manufactureDate,
				// double price
				return new Product(in.readInt(), in.readUTF(), Category.valueOf(in.readUTF()),
						LocalDate.parse(in.readUTF()), in.readDouble());
			}

		} else
			return null;
	}

}

package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Product;

public interface SerIOUtils {
//add a static method to store map of products into bin file (serialization)
	static void storeProductDetails(Map<Integer, Product> products,String fileName) throws IOException
	{
		//Java App --> OOS ---> FOS --> bin file
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(products);//serialization - conversion of object to binary 
			//object has two things, state and behavior but only state in converted
			//metadata is also added in binary stream
		}
	}
}

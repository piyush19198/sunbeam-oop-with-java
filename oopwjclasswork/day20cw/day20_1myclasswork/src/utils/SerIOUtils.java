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
			out.writeObject(products);//serialization
			//who is going to check for what n when ?
			//JVM is going to chk serializability of the ENTIRE object graph @ run time
		}
	}
}

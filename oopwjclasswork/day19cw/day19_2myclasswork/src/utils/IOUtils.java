package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import com.app.core.Product;

public interface IOUtils {
	/*
	 * Add a static method to save product details to the text file : buffered
	 * manner i/p : stream OR List , fileName o/p : void
	 */
	static void storeProductDetails(Stream<Product> productStream,String fileName) throws IOException
	{
		//Java App ---->PW ---> FW --->   Text File 
		try(PrintWriter pw=new PrintWriter(new FileWriter(fileName)))
		{
			//write product details --> file
			productStream.forEach(pw::println);//p -> pw.println(p)
		}
	}
}

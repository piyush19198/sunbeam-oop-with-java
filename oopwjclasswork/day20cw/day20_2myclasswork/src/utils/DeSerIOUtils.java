package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public interface DeSerIOUtils {
//add static method to restore entire HashMap using de-serialization tech.
	static Object restoreProducts(String fileName) throws IOException,ClassNotFoundException
	{
		//validate file
		File f1=new File(fileName);
		if(f1.exists() && f1.isFile() && f1.canRead())
		{
			//attach chain of i/o streams
			try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(f1)))
			{
				return in.readObject();//de-serial: binary --> reconstruction of java object(HM)
			}
		}
		return null;
	}
}

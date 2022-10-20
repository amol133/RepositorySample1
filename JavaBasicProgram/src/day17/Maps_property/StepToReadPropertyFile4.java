package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile4 {

	public static void main(String[] args) throws IOException {

		
		String filePath2=(".\\Property\\demo.properties\\");
		
		FileInputStream fis=new FileInputStream(filePath2);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("applicationUrl"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		System.out.println(prop.getProperty("expectedTitle"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

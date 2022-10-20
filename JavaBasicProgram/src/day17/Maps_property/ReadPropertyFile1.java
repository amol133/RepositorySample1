package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile1 {

	public static void main(String[] args) throws IOException {

	//Absolute path --> D:\Workspace\JavaBasicProgram\Property\demo.properties
	String filePath = System.getProperty("user.dir")+"\\Property\\demo.properties";
	//System.out.println("Current Dir"+filePath);
    //file location and filename
	//FileInputStream fis=new FileInputStream("F:\\Online Class\\Training Syllabus-20210816T050832Z-001\\Training Syllabus\\CoreJavaSessions\\JavaTraining\\AppData\\SignupDetails.properties");
		//or
	//FileInputStream fis1 =new FileInputStream(filePath);
	    //or relative path
	FileInputStream fis2=new FileInputStream(".\\Property\\demo.properties");
	
	// create an instance of properties class	
	Properties prop=new Properties();	
	 prop.load(fis2);
	 
	//read data from property file using getProperty (string key)	
	System.out.println("first name="+prop.getProperty("firstname"));	
	System.out.println("last name="+prop.getProperty("lastname"));	
	System.out.println("Email id="+prop.getProperty("emailId"));	
	System.out.println("mobile="+prop.getProperty("mobileNumber"));	
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

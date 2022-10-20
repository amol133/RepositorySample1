package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertyFile {

	public static void main(String[] args) throws IOException{

	//file name and location -Absolute path
		//String filePath1=("D:\\Workspace\\JavaBasicProgram\\Property\\demo.properties");
		
		 // or relative path
		//String filePath2=".\\Property\\demo.properties";
		          //or 
		String currentDir=System.getProperty("user.dir");
		String filePath3=currentDir+"\\Property\\demo.properties";
		
		// create an instance of FileInputStream class by passing file location to its constructor
		
		//1
		FileInputStream fis=new FileInputStream(filePath3);
		// create an instance of properties class
		//2
		Properties prop=new Properties();
	// with the help of properties class ref call load() and pass FileInputStream ref as a parameter
		//3
		prop.load(fis);
		
		//4
	//in order to read data from property file use getProperty(String key) of properties class
		
	System.out.println("Application URL ="+prop.getProperty("applicationUrl"));	
	
	System.out.println("username="+prop.getProperty("username"));
	
	System.out.println("password="+prop.getProperty("password"));
	
	System.out.println("Subject2="+prop.getProperty("Subject2"));	
	
	System.out.println("principalAmount="+prop.getProperty("principalAmount"));	
	/*
	System.out.println("lastName="+prop.getProperty("lastName"));		
	System.out.println("contactNumber="+prop.getProperty("contactNumber"));	
	System.out.println("emailId="+prop.getProperty("emailId"));	
		*/
		
		
		
		
		
		
		
	}

}

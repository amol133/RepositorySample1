package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile2 {

	public static void main(String[] args) throws IOException {

		String filePath1=("D:\\Workspace\\JavaBasicProgram\\Property\\demo.properties\\");
		
		String filePath2=(".\\Property\\demo.properties\\");
		
		String currentDir=System.getProperty("user.dir");
		String filePath3=currentDir+"\\Property\\demo.properties\\";
		
	//1
		FileInputStream fis=new FileInputStream(filePath1);
		
	//2
		Properties prop=new Properties();
	//3
		prop.load(fis);
		
     System.out.println(prop.getProperty("firstname"));
     System.out.println(prop.getProperty("lastname"));
	System.out.println(prop.getProperty("emailId"));
	System.out.println(prop.getProperty("mobileNumber"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

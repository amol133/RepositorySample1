package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepsToReadPropertFile {

	public static void main(String[] args) throws IOException{

	/**
	 * 1.first find the location where you have stored property file
	 * 2.create an instance of FileInputStream class and pass the property file location to its constructor
	 * 3.create an instance of properties class
	 * 4.with the help of properties reference variable call load() properties class and pass FileInputStream class reference to this method
	 * 5.call getProperty(key) of properties class to read data from property file 	
	 */
		
	/**
	 * property file location with
	 * absolute path :F:\JavaWorkspace\CoreJavaSession\PropertyFile\TestData.properties
	 * relative path: .\PropertyFiles\TestData.properties
	 *   //absolute path:"D:\\Workspace\\JavaBasicProgram\\src\\day18\\Property\\PropertyFile"; 
	 *     
	 *     Using system class:
	 *                    
	 *                    String currentDir=System.getProperty("user.dir);
	 *                    String propertyFileLocation = currentDir + \\PropertyFiles\\TestData.properties
	 * 
	 * 	
	 */
		System.out.println(System.getProperty("user.dir"));	
        
		String fileLocation="D:\\Workspace\\JavaBasicProgram\\src\\day18\\Property\\PropertyFile";
		
		FileInputStream fis=new FileInputStream(fileLocation);
		
		Properties prop=new Properties();
		
		prop.load(fis);
      System.out.println(prop.getProperty("applicationUrl"));
      System.out.println(prop.getProperty("username"));
      System.out.println(prop.getProperty("password"));
      System.out.println("expectedTitle");
	
		

	}

}

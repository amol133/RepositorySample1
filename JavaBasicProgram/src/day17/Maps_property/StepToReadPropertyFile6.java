package day17.Maps_property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class StepToReadPropertyFile6 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream("D:\\Workspace\\JavaBasicProgram\\Property\\demo.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String pAmount=System.getProperty("principleAmount");
        System.out.println(pAmount);
		/*
		int amount=Integer.parseInt(pAmount);
		  int res=amount/10;
		  
		 int roi=Integer.parseInt(prop.getProperty("roi"));
		 System.out.println("Result="+res);
		System.out.println("ROI="+roi);
		*/
		// to wrote content into the file use setProperty()
		
		prop.setProperty("fullname", "Amol Subhash Pawar");
		prop.setProperty("subject", "Automation map");
		
		//location where we want save file using FileOutputStream 
		FileOutputStream fos=new FileOutputStream(".\\Property\\demo2.properties");
		
		prop.store(fos, "Added two new keys");
		
		//close the connection
		fos.close();
		System.out.println("property file updated successfully");
		
		
		
		
		
		
		
		
		
	}

}

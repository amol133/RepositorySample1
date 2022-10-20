package day14_2_scanner_String_class;

import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {

		String s="Hello ,This is Predifine Class";
		// create scanner object and pass string in it 
		/**
		 * As Scanner class inherits iterator interface ,which has following method
		 * hasNext()---->check weather it has data or not and return true if it has
		 * next()-------> it return the data present in Scanner object
		 * remove()----->to remove data
		 */
  Scanner scan=new Scanner(s);
  // check if the scanner has a token
  System.out.println("Boolean Result="+scan.hasNext());
  // print the string
  System.out.println("string="+scan.nextLine());
  scan.close();
  System.out.println("-----------Enter your Details---------------------------------------");
		Scanner in=new Scanner(System.in);
	    System.out.println("enter your name=");
		String name=in.next();
	    System.out.println("name="+name);
	      System.out.println("enter your age=");
		int age=in.nextInt();
	      System.out.println("age="+age);
	      System.out.println("Enter your salary=");
		  double sal=in.nextDouble();
	      System.out.println("salary="+sal);
		in.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

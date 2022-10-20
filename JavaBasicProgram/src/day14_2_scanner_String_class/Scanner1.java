package day14_2_scanner_String_class;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		// int age=10;
	    // double salary=4566.3;
		// string name='pune';
		
		// object creation of scanner class
		Scanner scnref=new Scanner(System.in);
       int age;
       double salary;
       String name;
       boolean valid;
       // initialization of variable using Scanner class
      System.out.println("Enter age value in console");
		age=scnref.nextInt();
	  System.out.println("Enter salary in console");
		salary=scnref.nextDouble();
	  System.out.println("string name in console");
		name=scnref.next();
	  System.out.println("enter the valid true false boolean result");
		valid=scnref.nextBoolean();
	      System.out.println("age="+age);
	      System.out.println("salary="+salary);
	      System.out.println("name="+name);
	      System.out.println("boolaen valid="+valid);
	   
	 int num1,num2;
     System.out.println("Enter num1=");
	 num1=scnref.nextInt();
     System.out.println("Enter num2=");
	 num2=scnref.nextInt();
	 
	 char op;
     System.out.println("Enter operator=");
	 op=scnref.next().charAt(0);
     System.out.println("Addition of two number="+Scanner1.addNumber('+', 23, 34));
	      
	      
	      
	      		
		
	}
	static int addNumber(char op,int num1,int num2) {
		if(op=='+') {
			return num1+num2;
		}
		else {
			return 0;
		}
	}

}

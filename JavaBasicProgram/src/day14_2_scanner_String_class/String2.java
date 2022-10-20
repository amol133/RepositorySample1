package day14_2_scanner_String_class;

import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		
		String str1 ="DhanoriPune";//output : enuPironahD
		char c=str1.charAt(5);
		System.out.println("char at index 0="+c);
		
	// to print one by one character of string
		for(int i=0;i<str1.length();i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println("\n************************************************");	
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
	System.out.println("*\n*******************reverse*********************************************");
		String temp="";// DhanoriPune;//output enuPironahD
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp + str1.charAt(i);
		}
		System.out.println("original str1="+str1);
		System.out.println("reverse str1 ="+temp);
		System.out.println("DhanoriPune");
   
		Scanner s=new Scanner(System.in);
		String s2;
		System.out.println("enter String to be reverse");
		s2=s.next();
		System.out.println("reverse string is="+reverseString(s2));
		// palindrome or not
       String s3;
   	System.out.println("check palindrome or not=");
		s3=s.next();
		palinString(s3);
		System.out.println("**********************palindrome******************************************");	
		String s4="ana";
		String s5=s4;
		 String Temp="";
		for(int i=s5.length()-1;i>=0;i--) {
		 Temp=Temp+s5.charAt(i);
		}
		if(Temp.equals(s4)) {
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
		
	}

	 static String reverseString(String s2) {
		String temp="";
		for(int i=s2.length()-1;i>=0;i-- ) {
			temp=temp+s2.charAt(i);
		}
		return temp;
		
	}
	// 	System.out.println("palinString(abcd)"); 
	
	

	 
	 
	 
static void palinString(String s3) {
	String s1=s3;
	String temp="";
	for(int i=s3.length()-1;i>=0;i--) {
		temp=temp+s3.charAt(i);
	}
	if(temp.equals(s1));{
		System.out.println("palindrome number="+temp);
	}
	{
		System.out.println("not a palindrome ");
	}
}
}

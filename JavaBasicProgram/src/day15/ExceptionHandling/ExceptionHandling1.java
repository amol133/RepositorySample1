package day15.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		System.out.println("program start from here....");
		//1.abnormal statement
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("first number=");
		  i=scn.nextInt();
		System.out.println("second number=");
		  j=scn.nextInt();
		
		k=i/j;// ArithmeticException
		System.out.println("res="+k);
		System.out.println("program end");
	}

}
/**
 * 1.try ---> throws some exception ---> catch() has to catch it
 * 
 * 2.try ---> throws some exception ---> catch() doesn't that type of declaration then JVM will terminate the program execution 
 * 
 *3.try ----> doesn't have any exception ---> then catch block will not be executed24 
 * 
 */





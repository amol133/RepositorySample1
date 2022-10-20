package day15.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		System.out.println("program start from here...");
		//1. abnormal statement
		int i,j,k;
		Scanner scn=new Scanner(System.in);
		System.out.println("first number=");
		i=scn.nextInt();
		System.out.println("second number=");
		j=scn.nextInt();
		
		try {
			System.out.println("**********you are inside try block***********************");
			k=i/j;// ArithmeticException
			System.out.println("res="+k);
			System.out.println("*********no exception found******************************");
		}
		catch(ArithmeticException obj) {
			System.out.println("***********you are in catch block****************************");
			System.out.println("Exception handle="+obj);//java .lang.ArithmeticException / by zero
			// obj.printStackTrace();// it will give complete exception details
			System.out.println("exception handled");
		}
	}

}

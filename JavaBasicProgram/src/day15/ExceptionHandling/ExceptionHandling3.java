package day15.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {

		System.out.println("program start from her....");
		// 1.abnormal statement
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter array size=");
		int size=scn.nextInt();
		int[] arr=new int[size];
		
		try {
			System.out.println("***************you are in try block****************************");
			System.out.println(arr[3]);
			System.out.println("********try block end here****************************");
		}
		catch (Throwable e){
			System.out.println("**************catch block start from here**********************");
			System.out.println("exception handle="+e);
			System.out.println("Exception details by  printStackTrace");
			e.printStackTrace();
			System.out.println("with get message="+e.getMessage());
			System.out.println("****catch block ends from here");
		}
		System.out.println("program end here...");
		
		
		
		
		
	}

}

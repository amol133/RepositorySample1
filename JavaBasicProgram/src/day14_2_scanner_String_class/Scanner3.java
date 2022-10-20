package day14_2_scanner_String_class;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		
		int[] empid=new int[5];
		Scanner d =new Scanner(System.in);
		for(int i=0;i<empid.length;i++) {
		      System.out.println("insert your array element in index ="+i);
		      empid[i]=d.nextInt();
		}
	int i=0;
	for(int num:empid) {
	      System.out.println("index element="+i+"="+num);
	      i++;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

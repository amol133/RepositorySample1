package day13.Array;

import java.util.Arrays;

public class Multi_Array6 {

	public static void main(String[] args) {
		
		int[] num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		int[] num1= {11,22,33};
		/*
		int[] cloneArray=num1.clone();
		for(int z:num1) {
			System.out.println(z +" ");
		}
		*/
		System.out.println("arrays elements count="+num1.length);
		System.out.println("index 1 element or 2nd element="+num[1]);
		System.out.println("printing all the element");
		for(int i=0;i<num1.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println("\n**************copyOf*****************************************");	
		
		int[] num2=Arrays.copyOf(num1, 5);
		System.out.println("size of num2="+num2.length);
		
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i] + " ");
		}
		
		num2[3]=44;
		num2[4]=55;
		System.out.println("\n***************************************************************8");
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i] +" ");
		}
		System.out.println("\n********************************************************");
		num2[1]=100;
		num2[2]=200;
		for(int i=0;i<num2.length;i++) {
			System.out.print(num2[i] +" ");
		}
		System.out.println("\n************************************************************");
		
		Arrays.sort(num2);
		
		for(int n:num2) {
			System.out.print(n+" ");
		}
		
		
		
		
		
		
		
		
		

	}

}

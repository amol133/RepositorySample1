package day13.Array;

import java.util.Arrays;

public class Multi_Array5_clone2 {

	public static void main(String[] args) {

		char[] copy= {'a','m','o','l','p','a','w','a','r'};
		System.out.println("****************printing original copy*******************************");
		for(char c:copy) {
			System.out.print(c+ " ");
		}
		
		System.out.println("\n**************printing clone******************************88");
		char[] cloneArray=copy.clone();
		for(int i=0;i<cloneArray.length;i++) {
			System.out.print(cloneArray[i] +" ");
		}
		System.out.println("\n**********************checking copy and clone array are equal***********");	
		System.out.println("copy and clone content validate="+Arrays.equals(copy, cloneArray));
		System.out.println("\n*****************make copyOf**************************");
		char[] x=Arrays.copyOf(copy, copy.length);
		for(char m:x) {
			System.out.print(m +" ");
		}
		System.out.println("\n**************copyOfRange***********************************");
		char[] copyOfRange=Arrays.copyOfRange(copy, 4, copy.length);
		for(char z:copyOfRange) {
			System.out.print(z +" ");
		}
		System.out.println("\n********************sort*****************************8");
		Arrays.sort(copy);
		for(char C:copy) {
			System.out.print(C +" ");
		}
		
		
		
	}

}

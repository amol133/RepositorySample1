package day13.Array;

import java.util.Arrays;

public class Multi_Array4_clone {

	public static void main(String[] args) {
		int[] array= {13,33,4,67,78};
		System.out.println("printing original array");
        for(int num:array) {
			System.out.print(num +" ");
        }
		System.out.println("\n***********printing a clone array**********************************");
		int[] cloneArray=array.clone();
		for(int clone:cloneArray) {
			System.out.print(clone +" ");
		}
		System.out.println("\n are both equal array & clone array ?");
		System.out.println("array & clone array content validation="+Arrays.equals(array,cloneArray));
		System.out.println("*************************************************************************");
		
		int[] copy=Arrays.copyOf(array, array.length);
		for(int num:copy) {
			System.out.print(num +" ");
		}
		System.out.println("\n*****************copyOfRange********************************************");
		int[] copyOfRange=Arrays.copyOfRange(array, 1, array.length);
		for(int range:copyOfRange) {
			System.out.print(range +" ");
		}
		
		System.out.println("\n**************************sort***********************************");	
		Arrays.sort(array);
		for(int s:array) {
			System.out.print(s +" ");
		}
		
		
		
		
		
		
		
		
	}

}

package day13.Array;

import java.util.Arrays;

public class Multi_Array3_Arrays_predefineword {

	public static void main(String[] args) {
		//declaring a source array
		char[] copyForm= {'d','e','t','u','u','i','n','v','a'};
		
		System.out.println("element count in copyForm="+copyForm.length);
		System.out.println("**********using copyOf Arrays*******************************");
		char[]copyTo= Arrays.copyOf(copyForm,copyForm.length);
		
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i] +" ");
		}
		
		System.out.println("************using copyOfRange Arrays***********************");
		char[] range=Arrays.copyOfRange(copyForm, 2,copyForm.length);// 2,5 it take only 2 to 4
		for(int i=0;i<range.length;i++) {
			System.out.print(range[i] +" ");
		}
		
		System.out.println("*****************after sorting**********************");
		Arrays.sort(copyForm);
		for(char c:copyForm) {
			System.out.print(c+" ");
		}
		
	}

}

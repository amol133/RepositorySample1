package day13.Array;

public class Array2 {

	public static void main(String[] args) {
		/*
		// declaration 
		 * int[] a;// declaration
		 * a=new int[5];//initialization
		
		or
		int[] a=new int[5];// direct declaration and initialization
		*/
		
		int[] a=new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
       
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("*************after re-initialization******************************");		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//or
		System.out.println();
		System.out.println("array element count= "+a.length);
		System.out.println("******************8for loop******************************88");
		for(int i=0;i<a.length;i++) {// length is property of array
			System.out.println(a[i]);
		}
		System.out.println("***************for each loop*************************");
		/*
		 * LHS should be same as RHS(array) type in form of data type or class
		 * for(LHS : RHS){
		 * 
		 * }
		 * 
		 * 
		 */
		
		for(int num:a) {
			System.out.println(num);
		}
		
		char[] getArray1= {'A','B','C','D'};
		
		System.out.println("***************for each loop********************************");
		for(char c:getArray1) {
			System.out.println(c);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}

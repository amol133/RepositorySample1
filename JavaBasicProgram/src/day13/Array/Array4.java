package day13.Array;

public class Array4 {

	public static void main(String[] args) {// sum of total number and average

		int[] number= {-22,45,55,-66,3,77,88,2,1};
        double sum=0;
        double average;
		System.out.println("************accessing by using for each loop*******************8");
		for(int num:number) {
			sum= sum + num;
			
		}
		//get the total number of elements 
		//int arraylength=number.length;
		// calculate the average convert the average from int to double
		
		average=sum/number .length;
		System.out.println("sum="+sum);
		System.out.println("average="+average);
		
		
		
		
		
		
		
		
	}

}

package day8.Conditionifelseprogram;

public class Conditionifelse7 {

	public static void main(String[] args) {
	
// creating two variables for age and and weight 
		
		int age =20;// 17 |18|
		int weight=57;//50 |55|60
		char group='A';
		// applying on weight and age
		
		if (age>= 18) {
			if(weight >50 ) {
				if(group!='A') {
	                   System.out.println("if group A is not ur blood group then ur not eligible");			
			}
				System.out.println("you are eligible  to donate blood ");

			}
			else {
				System.out.println("your not eligible to donote blood");

			}
		}
		
		
	}
	
	
	
	
}
		
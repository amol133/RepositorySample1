package day8.Conditionifelseprogram;

public class Conditionifelse8 {

	public static void main(String[] args) {
		
		// creating variable age and weight and applying some condition on it
	
		
		int age=17;// 17|61
		int weight=55;// 49|101
		
		if (age >= 18 && age <=60) {
			if (weight >=50 && weight <=100) {
				System.out.println("should be eligible to donote blood");
			}
			else   {
				System.out.println("your are not eligible to donot blood");

			}
		}
		else  {
			System.out.println("age must be greater than 18");

		}
				
				
				
	}

}

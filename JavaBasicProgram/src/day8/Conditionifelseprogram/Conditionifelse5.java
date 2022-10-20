package day8.Conditionifelseprogram;

public class Conditionifelse5 {

	public static void main(String[] args) {
	    
		 int marks=60;// 10| 50| 70|80|90|100|101 invalid
		
		if (marks <50 ) {
			System.out.println("fail");
		}
		else if (marks >= 50 && marks <= 60) {
			System.out.println("grade D");

		}
		
		else if (marks >=60 && marks <=70 ) {
			System.out.println("grade C");

		}
		else if (marks >= 70 && marks <= 80 ) {
			System.out.println("Grade is B");

		}
		else if (marks >= 80 && marks <=90) {
			System.out.println("grade is A");

		}
		
		else if ( marks >= 90 && marks <=100) {
			System.out.println("Grade is A+");

		}
		
		else {
			System.out.println("invalid");

		}
		
		
		
		
		
		
		
		
		
		


	}

}

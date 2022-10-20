package day15.ExceptionHandling;

public class ExceptionHandling9 {
// fuction to check if person is eligible to vote or not
	
	public static void ValidateAge(int age) {
		if(age<18) {
			// throw arithmetic exception if not eligible to vote
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("***********program start****************************");
        // calling the function
		//ValidateAge(13);
		System.out.println("rest of the code");

		try {
			ValidateAge(14);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

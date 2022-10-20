package day15.ExceptionHandling;

public class ExceptionHandling8 {
	// function to check if person is eligible to vote or not
	
	public static void validateAge(int age) {
		if(age<18) {
			//throw Arithmetic exception if not eligible to vote
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}	

	public static void main(String[] args) {

	// without handling exception
	//validateAge(13);	
	
 // handling exception ,calling the function
		try {
			validateAge(13);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handled");
			System.out.println(e);
		}
		System.out.println("rest of the code...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

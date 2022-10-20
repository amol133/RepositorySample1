package day15.ExceptionHandling;

public class ExceptionHandling7 {

	public static void main(String[] args) {

		try {
			System.out.println("************inside the try block******************");
			//below code is divided by zero exception
			int data=25/0;
			System.out.println(data);
		}
		// handle the arithmetic exception / divide by zero exception
		catch(ArithmeticException e) {
			System.out.println("Exception is handled");
			System.out.println(e);
		}
		// executed regardless of exception occurred or not
		finally {
			System.out.println("finally block is alway executed ");
		}
		
		System.out.println("rest of the code");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

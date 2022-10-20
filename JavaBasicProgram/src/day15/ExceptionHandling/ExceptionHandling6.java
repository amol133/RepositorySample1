package day15.ExceptionHandling;

public class ExceptionHandling6 {

	public static void main(String[] args) {

		try {
			System.out.println("inside the try block");
			// bellow code throws divide by zero exception
			int data=25/5;
			//System.exit(0); // if we use system.exit(0) the program is terminated from that point and finally block also not executed and current thread dead not executed
			System.out.println(data);
		}
		// cannot handle Arithmetic type exception
		// can only accept Null pointer type exception
		catch(NullPointerException e) {
			System.out.println(e);
		}
		// executed regardless of exception occurred or not 
		
		finally {
			System.out.println("i am iniside finally block");
			int k=10/0;
			System.out.println("finally block is always executed");
			
		}
		System.out.println("rest of the code...");
		
		
		
		
		
		
		
		
		
	}

}

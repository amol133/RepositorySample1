package day15.ExceptionHandling;

public class ExceptionHandling15 {
	// defining a arithmetic exception which defined method which throws ArithmeticException
     static void method() {
 		System.out.println("inside the method()");
 		throw new ArithmeticException("throwing ArithmeticException");
     }	
	
	public static void main(String[] args) {
    //method();
		try {
			method();
		}
		catch(ArithmeticException e) {
			System.out.println("caught in main() method");
		}
		System.out.println("rest of the code");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

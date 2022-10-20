package day15.ExceptionHandling;

//Throwing UserDefineException
//class represent user-define exception

class UserDefinedException extends Exception{
	public UserDefinedException(String str) {
		// calling constructor of parent exception
		super(str);
	}
}
// class that uses above MyException
public class ExceptionHandling10 {
	
	public static void validateAge(int age) throws UserDefinedException {
		if(age<18) {
		// throw Arithmetic exception if not eligible to vote
		throw new ArithmeticException("Person is not eligible for vote");
		
		}
		else {
			System.out.println("Person is eligible to vote ");
		}
	}

 public static void main(String[] args) throws UserDefinedException {
	 
	 //validateAge(15);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		System.out.println("rest of the code...");
	 
	 
		

	}

}

/**
 *  throw ---> is used to throw explicit exception from a method body,it can be checked or unchecked exception
 *        --->if its a checked exception then we have to handle it by using try - catch block or we can declare that exception
 *        
 *        in method label using throws keyword in this case where ever this method gets called in that method we
 *           to handle to exception in order to continue the program
 *        
 *        
 * 
 * 
 * 
 * 
 */









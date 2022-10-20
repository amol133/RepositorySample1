package day15.ExceptionHandling;

//Throwing UserDefineException
//class represent user -defined exception

class UserDefineException extends Exception{
	UserDefineException(String s){
		// constructor calling of parent Exception
		super(s);
	}
}

public class ExceptionHandling11 {
	public static void validateAge(int age) throws UserDefineException{
		if(age <18) {
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("person is eligible to vote");
		}
	}

	public static void main(String[] args) throws UserDefineException {

		System.out.println("i am main exception handler");
		 //validateAge(15);
		try {
			validateAge(15);
		}
		catch(UserDefineException e) {
			System.out.println("exception handle="+e);
			//e.printStackTrace();// for details information
		}
		
		System.out.println("rest of the code...");
	}

}

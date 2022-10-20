package day15.ExceptionHandling;
//throwing UserDefinedException
// class represents user-define exception

class UserDefinedException extends Exception{
	public UserDefinedException(String s){
          // constructor calling parent constructor of exception
		super(s);
	}
}
public class ExceptionHandling12  {
	public static void validateAge(int age){
		if(age<18) {
			try {
			throw new UserDefinedException("Person is not eligible for vote");
			}
			catch(UserDefinedException e){
				System.out.println(e);
				//e.printStackTrace(); //details information of exception
			}
		}
		else {
			System.out.println("Person is not eligible for vote");
		}
	}

	public static void main(String[] args) {
		System.out.println("*****************i am main of exception handling********************");
		validateAge(15);
		System.out.println("rest of the code...");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

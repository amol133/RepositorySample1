package day15.ExceptionHandling;

public class ExceptionHandling16 {
	static void setSleep(long time) {
		try {
			Thread.sleep(time);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	static void checkNumber(int num) {
		if(num<0) {
			try {
				throw new UserDefinedException("number less than zero");
			}
			catch(UserDefinedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		//setSleep(3000);
		checkNumber(-1);
		System.out.println("hello geeak");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

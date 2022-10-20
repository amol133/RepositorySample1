package day15.ExceptionHandling;

public class ExceptionHandling13 {
	static void setSleep(long time) throws InterruptedException {
		Thread.sleep(time);
	}
	static void checkNumber(int num) throws UserDefinedException {
		if(num<0) {
			throw new UserDefinedException("number less than zero");
		}
		else {
			System.out.println("number is="+num);
		}
	}

	public static void main(String[] args) throws InterruptedException, UserDefinedException {
		setSleep(2000);
		checkNumber(-1);

	}

}

/**
 * try-catch --> to handle the exception
 * 
 * throw ------> to throw the exception from a method body ,this need to handle by using throws
 * 
 * throws -----> use to handle exception throws by a method while calling or use to declare a exception on method level 
 *
 */









package day15.ExceptionHandling;

public class ExceptionHandling5 {

	public static void main(String[] args) {

		try {
			int a[]=new int[3];
			a[3]=30/0;
		}
		catch(Throwable e) {
			System.out.println("common task completed="+e);
		}
		/*
		catch(Exception e) {
			System.out.println("task1 is completed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("task2 is completed");
		}
		*/
		
/**
 * unreachable code=a block of code which never executed by JVM		
 * 
 * as the throwable is a parent class of all the exception
 */
		
		
	}

}

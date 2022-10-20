package day15.ExceptionHandling;

public class ExceptionHandling4 {

	public static void main(String[] args) {

		try {
			int a[]=new int[5];
			a[5]=30/0;// array index out of bound exception
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("arrayindexoutBound exception is occured="+e);
		}
		catch(ArithmeticException e){
			System.out.println("Arithemtic exception occured="+e);
		
		}
		catch(Exception e) {
			System.out.println("parent Exception occured="+e);
		}
	
		try {
			int a[]=new int[5];
			a[5]=30/2;
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic Exception="+e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundException occured="+e);
		}
		catch(Exception e) {
			System.out.println("parent Exception occured="+e);
		}
		System.out.println("rest of the code");
		
		
		
	}

}

/**
 * try block can have multiple catch block,but only one catch block will be executed
 * 
 * try can handle only one abnormal condition at a time
 * 
 */









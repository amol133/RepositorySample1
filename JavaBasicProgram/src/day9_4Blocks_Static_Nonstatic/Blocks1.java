package day9_4Blocks_Static_Nonstatic;

public class Blocks1 {

	public static void main(String[] args) {
		System.out.println("main ()starts");
		System.out.println("i am main () of blocks of class block1");
		System.out.println("main () ends");
	}
	
/* static block or static initialization block or SIB */

	static {
		System.out.println("*********runing block numbere 1*****");
	}
	
}
/**
 * SIB: use to provide some information before we get into actual logic,basically used to 
 * initialize static variable of the class.
 * it will be executed before main method,as we don't have any name for this
 *   without main () SIB won't be executed
 *   if we have more than one static blocks or SIB then all the SIB will be executed in sequential order main ()
 *   
 *   block--->no name ,no return type ,no calling
 */



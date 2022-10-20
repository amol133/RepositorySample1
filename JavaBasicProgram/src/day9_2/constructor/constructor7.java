package day9_2.constructor;
class A{
	double i;
	 A(double j){
		 System.out.println("running a class c constructor ");
		 i=j;
	 }
}
public class constructor7 {

	public static void main(String[] args) {
		A c1=new A(456.54);
		System.out.println("class A global variable i="+c1.i);
		c1.i=456;		
		System.out.println("class A global variable i= " + c1.i);
		
		System.out.println("*************************************************");
		A c2=new A(1232.13);
		System.out.println("class A global variable i="+c2.i);

	}

}
/*what is the use of parameterized constructor?
 * with the help of parameterized constructor for every object we can initialize different value
 * of non static variables
 * 
 */
 

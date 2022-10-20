package day6.overloadingofmethod;

public class Overloadingmethod6 {

	//Q= what if return type ,method name and parameter are same =compile time error
	
	public int myMethod(int num1 , int num2) {
		System.out.println("first my method of class demo ");
		return num1+num2;
	}
   public int myMethod (int var1 ,int var2) {
	   System.out.println("second my method of demo");
	   return var1-var2;
   }
	public static void main(String[]args) {
		Overloadingmethod6 r=new Overloadingmethod6();
		r.myMethod(10, 10);
	    r.myMethod(20,12);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

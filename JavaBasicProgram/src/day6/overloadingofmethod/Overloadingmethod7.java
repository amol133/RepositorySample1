package day6.overloadingofmethod;

public class Overloadingmethod7 {

	//  Question = return type is same method name and and arugment are same 

	public double myMethod(int num1,int num2) {
		System.out.println("fist of myMethod demo="+(num1+num2));
		return num1+num2;
	}
	public int myMethod(int var1 ,int var2) {
		System.out.println("second of myMethod demo="+(var1-var2));
		return var1-var2;
	}
	public static void main(String []args) {
		Overloadingmethod7 r = new Overloadingmethod7();
		r.myMethod(10, 20);
		r.myMethod(30, 40);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

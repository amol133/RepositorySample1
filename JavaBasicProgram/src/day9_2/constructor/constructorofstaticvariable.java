package day9_2.constructor;

public class constructorofstaticvariable {

	static int age=35;
	int empid=200;
	void display () {
		int empid=334;
		System.out.println("empid ="+empid);
		System.out.println("nsgv empid =" + this.empid);// use to call non static variable by this in non static method when there 
		                                                   // is initialization on both side inside and out side the sub method
	}
	public static void main(String[] args) {
	
		int age=12;
		System.out.println("age =" +age);
		System.out.println("sgv age = "+ constructorofstaticvariable.age);
		
		constructorofstaticvariable c1=new constructorofstaticvariable();
		c1.display();
		System.out.println(c1.empid);

	}

}
/**
 * this keyword is an instance of current class
 *  
 * this keyword is used to differentiate non static global variable and local variable 
 * when they have same name
 * 
 * this keyword only used inside non static method
 */









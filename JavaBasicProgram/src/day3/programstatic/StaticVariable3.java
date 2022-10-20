package day3.programstatic;

public class StaticVariable3 {
	//static global variables,when we declare a global variable and try to use without initialization then
	//will get default value based on data type (only for global variable)
	static int age;
	static float roi;
	static double salary;
	static char grade;
	static boolean res;
	
	public static void main(String[] args) {
		System.out.println("default value of age is = " + age);
		System.out.println("default value of rio is = " + roi);
		System.out.println("default value of salary is = " +salary);
		System.out.println("default value of grade is = " + grade);
		System.out.println("default value res is = " + res);
				
/*
 * any variable declared outside the method body but declared in class body known as Global variable
- if its declared with static keyword dn it will known as static global variable
- static global variables are also known as 'class variable/class member'
	- these variable will be loaded in the memory at the time of compilation when a class file is generated
	- in order access static global variable we can use-
		- we can access static global variable from another static method directly
		- standard -we can access static global variable using class name as they are class member for example:
				classname.staticglobalvariablename
- if we declare any global variable but not initialized and trying use it dn it will give you default value based on data type



 */
				
				
				
				
				
				
	}

}

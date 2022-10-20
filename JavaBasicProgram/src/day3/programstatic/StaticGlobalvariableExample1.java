package day3.programstatic;

public class StaticGlobalvariableExample1 {
	// static global variable
	static int age;
	static float roi;
	static double salary;
	static char grade;
	static boolean res;
	
	public static void main(String[] args) {
		System.out.println("value of age = "+ age);
		System.out.println("rate of interest = " +roi);
		System.out.println("salary of month=" + salary);
		System.out.println("grade of class = " +grade);
		System.out.println("result of student ="+ res);
		System.out.println("**************************************");
	
		
		//Initialization 
		age=24;
		roi=5.5f;
		salary=45000;
		grade='A';
		res=true;
		
		
		System.out.println("value of age = "+StaticGlobalvariableExample1. age);
		System.out.println("value of roi = "+StaticGlobalvariableExample1.roi);
		System.out.println("value of salary = "+StaticGlobalvariableExample1.salary);
		System.out.println("value of grade = "+StaticGlobalvariableExample1.grade);
		System.out.println("value of true = "+ StaticGlobalvariableExample1.res);
		
		

	}
	

}

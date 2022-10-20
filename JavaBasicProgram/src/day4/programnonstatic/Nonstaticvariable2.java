package day4.programnonstatic;

public class Nonstaticvariable2 {
  // non static global program
	int age;
	float roi;
	char grade;
	boolean res;

	public static void main(String[] args) {
		
		// to avoid first we need to load all the non static variable into the memory
		//create an instance or object of required class
		
		Nonstaticvariable2 ref; // instance/object declaration
		ref=new Nonstaticvariable2();// object initialization
		      // or
		Nonstaticvariable2 ref1=new Nonstaticvariable2();
		
	       System.out.println("default value of age =" + ref1.age);	
	       System.out.println("default value of roi =" + ref1.roi);	
	       System.out.println("default value of grade=" +ref1. grade);	
	       System.out.println("default value of res=" +ref1.res);	

	}

}

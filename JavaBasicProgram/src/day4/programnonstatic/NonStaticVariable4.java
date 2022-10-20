package day4.programnonstatic;

public class NonStaticVariable4 {
	// non static Global variable
	int age;
	float roi;
	char grade;
	boolean res;

	public static void main(String[] args) {
		// we have create instance / object required for class
    	//	classname ref=new classname();
		NonStaticVariable4 ref1= new NonStaticVariable4();
		
		System.out.println("default value of variable age =" + ref1.age);
		System.out.println("default value of variable roi =" + ref1.roi);
		System.out.println("default value of variable grade =" + ref1.grade);
		System.out.println("default value of variable res =" + ref1.res);
		System.out.println("********************************************");
		// initialization of non static global variable
		ref1.age=34;
		ref1.roi=3.3f;
		ref1. grade='C';
		ref1.res=true;
		
		System.out.println("updated value of variable age =" + ref1.age);
		System.out.println("updated value of variable roi=" + ref1.roi);
		System.out.println("updated value of variable grade =" + ref1.grade);
		System.out.println("updated value of variable res =" + ref1.res);
		System.out.println("*************************************************");


		// create a new object/ instance for required class
		NonStaticVariable4 ref2=new NonStaticVariable4();
		System.out.println("default value of variable age =" + ref2.age);
		System.out.println("default value of variable roi =" + ref2.roi);
		System.out.println("default value of variable grade =" + ref2.grade);
		System.out.println("default value of variable res =" + ref2.res);

	

	}

}

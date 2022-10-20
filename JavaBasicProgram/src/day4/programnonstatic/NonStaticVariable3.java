package day4.programnonstatic;

public class NonStaticVariable3 {
// non static global variable
	int age;
	float roi;
	char grade;
	boolean res;
	
	public static void main(String[] args) {

		NonStaticVariable3 ref1=new NonStaticVariable3();
		
		System.out.println("default value of non static variable age=" + ref1.age);
		System.out.println("default value of non static variable roi=" + ref1.roi);
		System.out.println("default value of non static variable grade =" + ref1.grade);
        System.out.println("default value of non stati variable res=" + ref1.res);
		System.out.println("******************************************************");
		
		// initialization 
		ref1.age=25;
        ref1.roi=4.4f;
        ref1.grade='B';
        ref1.res=true;
        
		System.out.println("updated value of non static variable age = " + ref1.age);
		System.out.println("updated value of non static variable roi = " + ref1.roi);
		System.out.println("updated value of non static variable grade = " + ref1.grade);
		System.out.println("updated value of non static variable res = " + ref1.res);

	}

}

package day3.programstatic;

public class StaticVariable4 {
	// static global variable
	static int age;
	static boolean res;
	static char grade;
	static float roi;

	public static void main(String[] args) {
	System.out.println("default value of age = "+ StaticVariable4.age);
	System.out.println("default value of res = "+ StaticVariable4.res);
	System.out.println("default value of grade = "+ StaticVariable4.grade);
	System.out.println("default value of roi = "+ StaticVariable4.roi);
	System.out.println("************************************************");
	
	// initialization
      StaticVariable4.age=24;
      StaticVariable4.res=true;
      StaticVariable4. grade='A';
      StaticVariable4. roi=4.5f;

   	System.out.println("updated  value of age = "+ StaticVariable4.age);
	System.out.println("updated value of res = "+ StaticVariable4.res);
	System.out.println("updated value of grade = "+ StaticVariable4.grade);
	System.out.println("updated value of roi = "+ StaticVariable4.roi);



	}

}

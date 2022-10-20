package day3.programstatic;

public class StaticVariable2 {
// global variable declare outside the method body but present inside the class body is known as global variable
	static int age=25;// static global variable//in static variable the name present static
	double salary=45000;//non-static global variable

	public static void main(String[] args) {
// local variable present inside the method ,block or constructor body is known as local variable
//we dont use static keyword with local variable		
		int x,y,res;
		x=20;
		y=30;
		res=x+y;
		

	}

}

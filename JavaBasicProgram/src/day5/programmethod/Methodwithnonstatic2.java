package day5.programmethod;

public class Methodwithnonstatic2 {

	double x=10,y=20,z=30;  // non static method
	
	public double average(double a,double b,double c) {
		return (a+b+c)/3;
	}
	
	boolean checkSameOrNot(int a ,int b) {
	boolean res=(a==b);
	return res;
	}
	
	//method type static
	static void display() {
		Methodwithnonstatic2 r1=new Methodwithnonstatic2();
		System.out.println("first number = "+ r1.x);
		System.out.println("second number = "+ r1.y);
		System.out.println("third number = "+ r1.z);
	}
	
  public static void main(String[] args) {
	  Methodwithnonstatic2 r2=new Methodwithnonstatic2();
	  System.out.println("program start");
	  System.out.println("the average of the number =" +r2.average(r2.x,r2.y,r2.z));
	  
	  
	  boolean res=r2.checkSameOrNot(10,10);
	  System.out.println("is both number same ="+res);
	  System.out.println(r2.checkSameOrNot(10,20));
	  r2.checkSameOrNot(20, 20);// not seen in console is used for only execution method body
	 display();
	
	
	
	
	}

}

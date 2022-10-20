package day14_3_String_buffer_builder;
class demo1{
	private demo1() {
		System.out.println("i am constructor of class demo");
	}
	public static demo1 d=new demo1();// static ref variable
	String name="pune";
	
	public static demo1 getInstance() {
		return d;
	}
	void display() {
		System.out.println("i am method of demo1 class");
	}
}

public class Singleton3 {

	public static void main(String[] args) {
     //demo1 g =new demo1();
		
		demo1 x=demo1.getInstance();
		System.out.println(x.name);
		x.display();
		System.out.println(x.name);
		
		x.name="mumbai";
		System.out.println("d ref="+x.name);
		
		demo1 y= demo1.getInstance();
       		System.out.println("d2 ref="+y.name);
		
		
		
		
	}

}

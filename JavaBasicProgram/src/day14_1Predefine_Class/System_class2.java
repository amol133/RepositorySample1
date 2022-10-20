package day14_1Predefine_Class;
class Dem{
	Dem(){
		System.out.println("i am constructor of demo");
	}
	void display() {
		System.out.println("i am display method of demo class");
	}
	void show() {
		System.out.println("i am show method of demo class");
	}
}
public class System_class2 {
	static int age=25;
	final static Dem d1=new Dem();
	System_class2(){
		System.out.println("i am constructor of system class");
	}
	static void test() {
		System.out.println("i am static method test of system class");
	}

	public static void main(String[] args) {
		System.out.println("static reference class test method");
		System_class2.d1.display();
		System_class2.d1.show();
		// class.static-ref.non static _method
		
		Dem d2=new Dem();
		d2.display();
		d2.show();
		test();
    System_class2 d3=new System_class2();
    d3.test();
	System.out.println("static variable="+d3.age);
    
    
    
    
	}

}

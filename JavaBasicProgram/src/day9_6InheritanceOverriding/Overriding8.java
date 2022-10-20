package day9_6InheritanceOverriding;
class Parent2{
	// static method in parent class which will hidden in sub class  
	static void m1(){
		System.out.println("i am static method of class Parent2");
	}
	void m2() {
           System.out.println("i am non static m2() of class parent2");
	}
}
class Child2 extends Parent2{
	// static method hides m1() in parent class
	static void m1(){
		System.out.println("i am static method of child2 class");
	}
	// this method overrides m2() in parent
     public void m2() {
    	 System.out.println("i am m2() method of class child2");
     }
}
public class Overriding8 {

	public static void main(String[] args) {
		Parent2 o1=new Child2();
		o1.m1();// static method cannot be overridden gives parent m1();
		
		o1.m2();// gives child m2() overridden take place
	//	Child2 o2=new Child2();
	//	o2.m1();

	}

}

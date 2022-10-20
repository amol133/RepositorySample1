package day9_7AbstractionClass;
abstract class Abs1{
	// abstarct method------>67%
	abstract void call1();
	abstract void call2();
	// non abstract method
	void display() {
    System.out.println("hello display");
	}
}
abstract class Abs2 {
	// Abstract method------>100%
	abstract void call1();
	abstract void call2();
	
}
abstract class Abs3{
	public void print() {
		System.out.println("i am ABs3 print() ");
	}
}

public class Abstraction7 extends Abs2 {
	void call1() {
           System.out.println("i am call1 ()");
	}
    void call2() {
    	System.out.println("i am call2 ()");
    }
	public static void main(String[] args) {
		Abstraction7 o1=new Abstraction7();
		o1.call1();
		o1.call2();
		
		Abs2 o2=new Abstraction7();
		o2.call1();
		o2.call2();
		

	}

}

package day9_6InheritanceOverriding;
class ABC{
	void myMethod() {
		System.out.println("i am my method of class ABC");
	}
}

public class Overriding4 extends ABC {
	public void myMethod() {
		// this will call parent class myMethod()
		super.myMethod();
		System.out.println(" i am method of overriding4 class");
	}

	public static void main(String[] args) {
        Overriding4 o1=new Overriding4();
        o1.myMethod();
	}

}

package day9_6InheritanceOverriding;
class Animal3{
	void eat() {
  	  System.out.println("i am eat() method of animal class");
	}
}
class Dog3 extends Animal3{
	void eat() {
  	  System.out.println("i am eat() of Dog3");
	}
	void bark() {
  	  System.out.println("bark () of Dog3");
	}
	void work() {
		super.eat();
		bark();
		eat();
  	  System.out.println("work() of Dog3");
	}
}

public class Superkeyword2 {

	public static void main(String[] args) {
		Dog3 o1=new Dog3();
		o1.work();

	}

}

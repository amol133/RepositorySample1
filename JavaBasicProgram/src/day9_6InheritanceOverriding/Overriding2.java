package day9_6InheritanceOverriding;
// parent class
class Animal1{
	public void move() {
		System.out.println("dog can move");
	}
	void diplay() {
		System.out.println("i am display () of animal class");
	}
}
//child class
class Dog1 extends Animal1{
	public void move() {
		// Animal1 o1=new Animal1();
		// b1.move();
		// super.move();
		System.out.println("dog can run and walk");
         diplay();// super.display();
         super.move();
		}
}
public class Overriding2 {

	public static void main(String[] args) {
     Animal1 o1=new Dog1();
     o1.move();
	}

}

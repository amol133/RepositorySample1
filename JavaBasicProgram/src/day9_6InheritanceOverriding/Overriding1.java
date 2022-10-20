package day9_6InheritanceOverriding;
// parent class 
class Animal{
	Animal(){
		// default constructor
	}
	public void move() {
		System.out.println("dog can move");
	}
}
// child class
class Dog extends Animal{
	Dog(){
		// default super()
	}
	public void move() {
		System.out.println("dog can walk and run");
	}
	void bark() {
		System.out.println("dog can bark");
		
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		Animal o1=new Animal();
		o1.move();
		Dog o2=new Dog();
		o2.move();
		o2.bark();
     Animal o3=new Dog();// we get dog class move()
     o3.move();
//	o3.bark();	 compile time error because parent class only access there properties and due to overriding move() method get override by the dog class 
		
		

		
		
		
	}

}

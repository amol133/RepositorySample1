package day9_7AbstractionClass;
// Abstract class
abstract class Animal{
	// Abstraction method (does not have a body)
	public abstract void animalSound();
	
	// regular method/normal method or complete method
	public void sleep() {
		System.out.println("animal are sleeping");
	}
	}
// subclass (inherit from animal)
class pig extends Animal{
	public void animalSound() {
		// the body of the animalsound() is provided here 
		System.out.println("pig  making sound wee wee");
	}
}
// subclass (inherit from Animal)	
class dog4 extends Animal{
	public void animalSound() {
		// the body of the animalSound is present here
		System.out.println(" the dog is barking");
	}
}

public class Abstraction1 {

	public static void main(String[] args) {
         pig o1=new pig();// created a pig object
         o1.animalSound();
         o1.sleep();
         dog4 o2=new dog4();
         o2.animalSound();
         o2.sleep();
	}

}

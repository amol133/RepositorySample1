package day12.Polymorphism;
class Animal{
	void eat() {
 	   System.out.println("Animal eat");
	}
}
class herbivores extends Animal{
	void eat() {
 	   System.out.println("herbivores eat");
	}
}
class omnivores extends Animal{
	void eat() {
 	   System.out.println("omnivores eat");
	}
}
class carnivores extends Animal{
	void eat() {
	   System.out.println("carnivores eat");
		   
	   }
}
public class Poly_runtime1 {

	public static void main(String[] args) {
		Animal p0=new Animal();
		p0.eat();
		Animal p1=new carnivores();
		p1.eat();
		Animal p2=new omnivores();
		p2.eat();
		Animal p3=new herbivores();
		p3.eat();

	}

}

/*
 * when method gets to know its implementation at the time of execution / runtime is known as run time polymorphism
 * it can be achieved by using method overriding  
 * 
 * inheritance
 * up casting
 * method overriding
 * 
 */





package day12.Polymorphism;
class Vehicle{
	void run() {
 	   System.out.println("vehicle running");
	}
}
class Car extends Vehicle{
	void run() {
 	   System.out.println("car running");
	}
}
public class Poly_overriding_1 {

	public static void main(String[] args) {
		Car p1=new Car();
		p1.run();

	}

}

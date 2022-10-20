package day9_7AbstractionClass;

abstract class Bike1{
	       abstract void run();
	       
	   public void speed(int spd) {
			System.out.println("bike speed :"+spd);
	   }
}
class Honda extends Bike1{
	void run() {
		System.out.println("running safely");
	}
	 public void speed(int spd) {
			System.out.println(" bike speed child ="+spd);
            super.speed(75);
	 }
	 void colore() {
			System.out.println(" honda colore is red");
	 }
}
public class Abstraction3 {

	public static void main(String[] args) {
		Honda o1=new Honda();
		o1.run();
		o1.speed(90);
		o1.colore();
		
		// Bike1 o2 =new Bike1(); we can't create object as incomplete class		
      Bike1 o2=new Honda();
      o2.run();
      o2.speed(90);
		// o2.colore(); can't acess bcoz its honda properties here bike returning its properties from child class
                      // so he can return only its property which are overided by child class
	}

}

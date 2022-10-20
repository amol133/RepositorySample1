package day9_5InheritanceOOPs;

// parent class
class vehicle{
	public void wheels() {
		System.out.println("i am wheels");
	}
}
// first child class of vehicle
class car1 extends vehicle{
	public void count() {
		System.out.println("i am car and has 4 wheels");
	}
}
// second child class of vehicle
class bike extends vehicle{
	void countbk() {
		System.out.println("i am bike and has 2 wheels");
	}
}
// third child class of vehicle
class scooter extends vehicle{
	void call () {
		System.out.println("i am scooter and has 2 wheels");
	}
}
public class Inheritance5 {

	public static void main(String[] args) {// Hierarchical inheritance
		car1 o1=new car1();
		o1.wheels();
		o1.count();
System.out.println("***************************************************************88");
        bike o2=new bike();
        o2.wheels();
        o2.countbk();
System.out.println("*******************************************************************");
        scooter o3=new scooter();
        o3.wheels();
        o3.call();
       

	}

}

package day12.Polymorphism;
class car1{
	int price=25000;
	void run() {
 	   System.out.println("car running");
	}
}
class innova extends car1{
	int prince=50000;
	void run211() {
 	   System.out.println("innova running at 120km");
	}
}
public class Poly_runtime3 {

	public static void main(String[] args) {
		car1 p1=new innova();
		p1.run();
 	   System.out.println(p1.price);

	}

}

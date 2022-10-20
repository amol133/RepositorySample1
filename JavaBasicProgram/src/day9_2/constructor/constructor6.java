package day9_2.constructor;

 public class constructor6 {

	int i=20;
	constructor6(){
		System.out.println("running constructor6 class");
	}
	void display() {
		System.out.println("im display method of class constructor6 ");
	}
 }
class x{
	int j=30;
	x(){
		System.out.println("running x class construction");
	}
	void display() {
		System.out.println("im display method of class x");
	}
}
class cons5 {
	   void display() {
		   System.out.println("im display method of class cons5");
	   }



public static void main(String[] args) {
		constructor6 c1=new constructor6();
		c1.display();
		System.out.println("class constructor6 global variable i="+c1.i);
		
		x c2=new x();
		c2.display();
		System.out.println(" class x global variable j="+c2.j);
		
      cons5 c3=new cons5();
      c3.display();
	}

	}

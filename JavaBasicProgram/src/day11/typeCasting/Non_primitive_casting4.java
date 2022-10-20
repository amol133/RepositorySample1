package day11.typeCasting;
class Grandfather{            // up casting
	void myhome() {
 	   System.out.println("this is grandfather home");
	}
}
class Parent extends Grandfather{
	void show() {
 	   System.out.println("show method of parent");
	}
	void callme() {
 	   System.out.println("i am callme method of parent");
	}
}
class child extends Parent{
	void myread() {
 	   System.out.println("myread method of child");
	}
}
public class Non_primitive_casting4 {

	public static void main(String[] args) {
		child c1=new child();
		c1.myread();
		c1.callme();
		c1.show();
		c1.myhome();
		
		Parent c2=new Parent();
		c2.show();
		c2.callme();
		c2.myhome();
		
		Grandfather c3=new Grandfather();
		c3.myhome();
		
		Parent c4=new child();
		Parent c5=c1;// implicit up casting
		c5.show();
		c5.callme();
		c5.myhome();
		
		
	Grandfather c6=c1;
	c6.myhome();
		

	}

}

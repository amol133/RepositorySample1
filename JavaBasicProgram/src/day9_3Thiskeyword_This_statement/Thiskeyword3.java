package day9_3Thiskeyword_This_statement;

class A{
	void m() {
		System.out.println("hello m");
	}
	void n() {
		System.out.println("hello n");
	   this.m();
	   // m();or directly
	}
}

public class Thiskeyword3 {
	void methodOne() {
		System.out.println("inside method one");
	}
 void methodTwo() {
	 System.out.println("inside method two");
	 methodOne();
 }
	public static void main(String[] args) {
	A c1= new A();
	c1.n();
	
	Thiskeyword3 c2=new Thiskeyword3();
	c2.methodTwo();

	}

}

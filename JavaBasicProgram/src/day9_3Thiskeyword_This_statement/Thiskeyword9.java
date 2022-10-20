package day9_3Thiskeyword_This_statement;
class test{
	void m() {
		System.out.println("hello m method");
	}
	void n() {
		System.out.println("hello n method");
		// m() or this.m();
      this.m();
	}
}
public class Thiskeyword9 {
	
	void display1() {
		System.out.println("hello display1 method");

	}
	void display2() {
		System.out.println("hello display2  method");
      // display(); or this. display();
		this.display1();
	}

	public static void main(String[] args) {
	 
		test c1=new test();
		c1.n();
		Thiskeyword9 c2=new Thiskeyword9();
		c2.display2();

	}

}

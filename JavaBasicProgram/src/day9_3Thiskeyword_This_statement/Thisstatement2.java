package day9_3Thiskeyword_This_statement;

class A1{
	A1(){
		this(25.23);
		System.out.println("hello zero ");
	}
	A1(double d){
		this(25);
		System.out.println("hello double="+d);
	}
	A1(int x){
		System.out.println("hello int ="+x);
	}
}
public class Thisstatement2 {

	public static void main(String[] args) {

		A1 c1=new A1();
		A1 c2=new A1(23.34);
		A1 c3=new A1(12);
		
		// or
		A1 a1=new A1();
		
	}

}

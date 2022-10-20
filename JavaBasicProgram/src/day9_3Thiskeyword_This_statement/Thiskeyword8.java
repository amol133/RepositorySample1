package day9_3Thiskeyword_This_statement;

public class Thiskeyword8 {
	int a;
	int b;
	Thiskeyword8(int a,int b){// parameterized constructor
		this.a=a;
		this.b=b;
	}
	void display() {// displaying value of variable a and b
             System.out.println(" a ="+a + " b ="+ b);
	}

	public static void main(String[] args) {
		Thiskeyword8 c1=new Thiskeyword8(13,13);
		c1.display();
		System.out.println(c1.a +" " +c1.b);
		
		Thiskeyword8 c2=new Thiskeyword8(100,200);
     c2.display();
     System.out.println(c2.a +" " +c2.b);
	}

}

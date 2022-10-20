package day9_3Thiskeyword_This_statement;

public class Thiskeyword6 {
 int variable=95;
 void method (int variable) {
		System.out.println("local variable value="+ variable);//13
		variable=80;
		System.out.println("initialize local variable value="+ variable);//80
		System.out.println("global variable value="+this. variable);//95
 this.variable=variable;
	System.out.println("updated local variable value="+ variable);//80
	System.out.println("updated global variable value="+this. variable);//80

 }
	void method() {
		int variable=25;
		System.out.println(" method global variable value="+this. variable);//80
		System.out.println("method local  variable value="+ variable);//25
 this.variable=variable;
	System.out.println("global variable value="+this. variable);//25
	System.out.println("method local variable value="+ variable);//25

	}
	public static void main(String[] args) {
	 Thiskeyword6 c1=new Thiskeyword6();
	 c1.method(13);
	c1.method();	
  
	System.out.println("global variable value----="+c1. variable);

	
	}

}

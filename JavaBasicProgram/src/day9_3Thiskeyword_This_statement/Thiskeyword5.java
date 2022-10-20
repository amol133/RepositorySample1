package day9_3Thiskeyword_This_statement;

public class Thiskeyword5 {
 int variable=5;
 int age =10;
 
 void method(int variable) {
		System.out.println("local variable value="+variable);
		System.out.println("global variable value="+this. variable);
   this.variable=variable;
	System.out.println("updated local variable value = "+variable);
	System.out.println("global variable value ="+ this.variable);

 }
	void method() {
		int variable=40;
		System.out.println("method local variable value="+variable);

	}	
	public static void main(String[] args) {
    Thiskeyword5 c1=new Thiskeyword5();
     c1.method(13);
     c1.method();
     Thiskeyword5 c2=new Thiskeyword5();
		System.out.println("global variable value="+c2.variable);

		
		
	}

}

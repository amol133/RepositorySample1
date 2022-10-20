package day5.programmethod;

public class Voidexample1ofmethod {
	
	/**
	 * non static method with access modifier as default ,return type as void with no parameter
	 */
	 void display () {
     System.out.println("im display method ");
	}
	static void print(char c1) {
		System.out.println("i m print and priting char = " +c1);
	}
	private void call (long num) {
		System.out.println("i m call and calling a number ="+ num);
	}
		
		public static void main(String[] args) {
			Voidexample1ofmethod ref1=new Voidexample1ofmethod();
			System.out.println("im display method");
		   ref1.display();
		      ref1.call(345);
			 print('A');
			 
		System.out.println("************using parameter**********");	 
			 long x=345;
			 char c='A';
			 print(c);
			ref1. call(x);
			ref1.display();
			 
		}
	
	
	
	
	
		
		
		
		
		
	}



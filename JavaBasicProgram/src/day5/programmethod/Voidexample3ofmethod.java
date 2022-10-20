package day5.programmethod;

public class Voidexample3ofmethod {
	
	static void display() {
		System.out.println("I am display method");
	}
	static void print(char c1) //char c1='A'; | char c1=c='A'
	{
		System.out.println("I am print method and printing char as: "+c1);
	}
	static void call(int num) //int num =123;| int num=x=123
	{
		System.out.println("I am call method and calling number is: "+num);
	}
	public static void main(String[] args) {	
		System.out.println("Program Starts");
		Voidexample3ofmethod.display();
		Voidexample3ofmethod.print('A');
		Voidexample3ofmethod.call(123);
		System.out.println("************passing parameter using variable**************");
		int x=123;
		char c='A';
		Voidexample3ofmethod.print(c);
		Voidexample3ofmethod.call(x);
		//System.out.println("print ="+ x);
		System.out.println("Program Ends");

	}
}
/**
when we don't want to return any value to JVM we use return type as void
 */

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


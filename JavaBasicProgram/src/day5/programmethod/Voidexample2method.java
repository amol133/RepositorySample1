package day5.programmethod;

public class Voidexample2method {

	static void display() {
		System.out.println("im display method");
		
	}
	static void print (char c1) // char c1 ='A';| char c1=c='A';
	{
	   System.out.println("i m print method and priting a char =" + c1);
	}
	static void call (int num )// int num=123 | int num=x=123
	{
	   System.out.println("i m call and calling num =" + num);
	}
	
	public static void main(String[] args) {
	System.out.println("program start");
	System.out.println("im display method");
	display ();
	print ('A');
	call (123);

	System.out.println("*********************passing parameter using variable ***************");
	int x=123;
	char c ='A';
	print (c);
	call (x);
	}
}
	

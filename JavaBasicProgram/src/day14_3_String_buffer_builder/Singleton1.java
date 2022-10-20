package day14_3_String_buffer_builder;

class Singleton{
	// constructor of this class ,here private constructor is used to restricted to this class itself
	
	private Singleton() {
		s="hello i am a string part of single1 class";
	}
	// static variable single_instance of type single1
	private static Singleton single_instance =new Singleton();
	// declaring variable of type String
	public String s;
	
	// Method static method to create instance of singleton class
	public static Singleton getInstanceOfSingleton() {
		// to ensure only one instance is created
		return single_instance;
	}
	
	
	
}

public class Singleton1 {

	public static void main(String[] args) {

		//Singleton s1=new Singleton();// cant created an object of singleton class as its constructor is declared as private
		
		// initiating singleton class with variable x
		Singleton x=Singleton.getInstanceOfSingleton();
		System.out.println("String from x is="+x.s);
		
		// initiating singleton class with variable y
		Singleton y=Singleton.getInstanceOfSingleton();
		System.out.println("String from y is="+y.s);
		
		// initiating singleton class with variable z
		Singleton z=Singleton.getInstanceOfSingleton();
		System.out.println("string from z is ="+z.s);
		
		// now changing variable of instance x via toUpperCase() method
		System.out.println("***********after converting to upper case****************");
		x.s=(x.s).toUpperCase();
		// print and display commands
		System.out.println("String from x is ="+x.s);
		System.out.println("string from y is="+y.s);
		System.out.println("String from z is ="+z.s);
		
		// now again changing the variable of instance x
		System.out.println("*************after converting to lower case*******************");
		z.s=(z.s).toLowerCase();
		System.out.println("string from x is="+x.s);
		System.out.println("string from y is ="+y.s);
		System.out.println("string from z is ="+z.s);
		
		
		
		
		
		
		
		
		
	}

}

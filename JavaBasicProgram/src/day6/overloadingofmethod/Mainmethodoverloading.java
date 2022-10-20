package day6.overloadingofmethod;

public class Mainmethodoverloading {

	public static void main(String[] args) {
		System.out.println("program start");
		main(23);
		main(45.54);
		
		

	}

	//static int a=34;
	public static void main(int a) {
		
		System.out.println("diplay method having a parameter=" +a);
		
	}
	
	//static double b=445.22;
	public static void main (double b) {
		System.out.println("main method with double parameter=" +b);
	}
	
	
}

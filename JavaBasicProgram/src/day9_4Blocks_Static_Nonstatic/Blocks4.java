package day9_4Blocks_Static_Nonstatic;

public class Blocks4 {
	
	Blocks4(){
		System.out.println(" running zero parameterized constructor ");
	}
	
	 /*non static blocks or NSIB */
	{ 
		System.out.println(" running non static blocks1 of class blocks4");
	}

	public static void main(String[] args) {
		System.out.println("main () starts");
		Blocks4 b1 = new Blocks4();
		System.out.println("------------------------------------------------------");
	    Blocks4 b2= new Blocks4 ();
		System.out.println("main () ends");

		

	}
	
	 /*non static blocks or NSIB */
	{
		System.out.println("running non static blocks 2 of class blocks4");
	}
	
}

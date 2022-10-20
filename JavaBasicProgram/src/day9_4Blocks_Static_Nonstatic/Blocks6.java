package day9_4Blocks_Static_Nonstatic;

public class Blocks6 {

	/* static blocks or SIB */
	static {
		System.out.println("running static blocks1 of class blocks6 ");
	}
	/* non static blocks or IIB OR NSIB */
	{
		System.out.println("running non static blocks1 of class blocks6");

	}
	
	public static void main(String[] args) {
		System.out.println("main () starts");
       Blocks6 b1=new Blocks6();
		System.out.println("-------------------------------------------------");
        Blocks6 b2 =new Blocks6 ();
		System.out.println("main () ends");


	}
/* static blocks or SIB */
	static {
		System.out.println("running static blocks2 of class blocks 6");
	}
	/* non static blocks or IIB OR NSIB */
	{
		System.out.println("running non static blocks2 of class blocks6");

	}
}

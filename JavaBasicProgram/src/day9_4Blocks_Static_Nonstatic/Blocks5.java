package day9_4Blocks_Static_Nonstatic;

public class Blocks5 {
	
	/* static blocks or SIB */
 static {
		System.out.println("running static block1 of class block5");
 }
 /* non static blocks or NSIB  */
 {
		System.out.println("running non static blocks1 of class blocks5");

 }
 
	public static void main(String[] args) {
		System.out.println("main () starts");
        Blocks5 b1=new Blocks5();
		System.out.println("-----------------------------------------------");
        Blocks5 b2=new Blocks5();
		System.out.println("main () end");

	}

}

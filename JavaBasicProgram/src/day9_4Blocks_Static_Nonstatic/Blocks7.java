package day9_4Blocks_Static_Nonstatic;

public class Blocks7 {
	final static int age;// using SIB we can initialize final static global variable
	final double salary;
	/* static blocks or SIB */
	static {
		//System.out.println("running static blocks");
		age=25;
	}
   /* non static blocks or IIB */
	{
		salary=34000.45;
	}
	public static void main(String[] args) {
		System.out.println("main () starts");
		System.out.println("age ="+Blocks7.age);
    	System.out.println("---------------------------------------------------------");
        Blocks7 b1 =new Blocks7 ();
		System.out.println("salary="+b1.salary);
		System.out.println("main () End");


	}

}

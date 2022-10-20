package day9_4Blocks_Static_Nonstatic;

public class Blocks3 {

	/* Non static blocks or NSIB */
	{
		System.out.println(" running non static blocks 1 of class blocks3");
	}
	
	public static void main(String[] args) {
		System.out.println("main () starts");
		Blocks3 b1 = new Blocks3 ();
		
		System.out.println("------------------------------------------------");
		Blocks3 b2 =new Blocks3();
		System.out.println(" main () ends");
	}

}
/** use to execute before constructor and use to provide additional information to object before 
 *  its gets created.
 *  
 *  for every instance NSIB will be executed
*/
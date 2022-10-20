package day9_4Blocks_Static_Nonstatic;

public class Blocks2 {
	/*static block or SIB */
	static {
		System.out.println("running static block 1 of class blocks2 ");
	}
	

	public static void main(String[] args) {
		System.out.println("main () starts");
		System.out.println("i am main () blocks of class blocks 2");
		System.out.println("main () end");
		
	}
   static {
	   System.out.println("running static block 2 of class blocks 2");
   }
	
}

package day9_4Blocks_Static_Nonstatic;

public class Blocks9 {
	static int age;
	static void print() {
		System.out.println("age ="+ age);
	}
/* static blocks or SIB */
	static {
		//age=34;// it will print 34 earlier if we initialize before print();
		print();// now it give here 0
		System.out.println("running static block1 of class blocks9 ");
       age=34;
	}
	
	public static void main(String[] args) {
		System.out.println("main () starts");
		print ();// now as it initialize after print call in static it will updated as 
		System.out.println("main () end");



	}

}

package day9_3Thiskeyword_This_statement;

public class Thisstatement1 {
	Thisstatement1(){
	      System.out.println("hello zero parameter");
	}
	Thisstatement1(double a){
		System.out.println("hello double parameter");
	}
	Thisstatement1(int x){
		System.out.println("hello int parameter");
	}
	
	public static void main(String[] args) {
		Thisstatement1 c1 = new Thisstatement1 ();
		Thisstatement1 c2 = new Thisstatement1 (34.78);
		Thisstatement1 c3 = new Thisstatement1 (133);

	}

}
/**
 * this & this () are currently class object
 * this--> keyword --> used only for non static variable / method /constructor
 * this ()--> statement ---> used inside the constructor body only
 * this();used to call another constructor of current class based on its arguments
 * should be the first statement inside the constructor body
 * 
 */
 
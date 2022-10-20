package day9_8InterfaceAbstraction;
interface Drawable1{
	void draw();// by default public static abstract
	// below default keyword can be used only inside interface
	default void msg(){
   		System.out.println("default method");
	}
	static int cube(int x) {
		return x*x;		
	}
	//default static int print() {// default static can't be written together 
		//System.out.println("");
    //}
	//	private void test() {
	//		System.out.println("private method");	
	//       }
}
class Rectangle1 implements Drawable1{
	public void draw() {
   		System.out.println("draw");
	}

}
public class Interface8 {

	public static void main(String[] args) {
         Rectangle1 o1=new Rectangle1();
         o1.draw();
  System.out.println("*************************************************************");
        Drawable1 o2=new Rectangle1();
        o2.draw();
        o2.msg();
   		System.out.println("Drawable1="+Drawable1.cube(5));

	}

}
/**
 * from JDK8 : in interface we have complete / non abstract method also but
 *             those method should be declare with default or static
 * 
 * 
 */





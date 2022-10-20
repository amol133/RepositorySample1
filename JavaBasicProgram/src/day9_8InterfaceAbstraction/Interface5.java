package day9_8InterfaceAbstraction;

interface Printable2{
	void print();
}
interface Showable2 extends Printable2{
	void show();
}

public class Interface5 implements Showable2 {
        public void show() {
       		System.out.println("hello show 2");
        }
	 public void print() {
    		System.out.println("hello print 2");
    		//this.show();
	 }
	
	public static void main(String[] args) {
        Interface5 o1=new Interface5();
        o1.show();
        o1.print();
   System.out.println("****************************************************************************");
       Printable2 o2=new Interface5();
       o2.print();
 System.out.println("*********************************************************************************8");
       Showable2 o3=new Interface5();
       o3.show();

	}

}

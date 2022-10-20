package day9_8InterfaceAbstraction;
interface 	Printable{
	int age=44;// default take public final static
	void print();
}
interface Showable{
           void show();
}
public class Interface3 implements Printable,Showable {
	public static int age=23;
           public void print() {
       		System.out.println("hello i am print");
           }
           public void show() {
          		System.out.println("hello i am show");
           }
	
	public static void main(String[] args) {
        Interface3 o1=new Interface3();
        o1.print();
        o1.show();
   		System.out.println("**********************************************");

        Showable o2=new Interface3();
        o2.show();
   		System.out.println("***************************************************");
         Printable o3=new Interface3();
         o3.print();
    		System.out.println("printable age="+Printable.age);
       		System.out.println("Intyerface age="+Interface3.age);

	}

}

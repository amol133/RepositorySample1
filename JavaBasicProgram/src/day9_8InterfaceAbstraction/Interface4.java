package day9_8InterfaceAbstraction;
interface Printable1{
	void print();
}
interface Showable1{
      void print();
}
public class Interface4 implements Printable1,Showable1{
       public void print() {
       		System.out.println("hello print");
      
        }
	
	public static void main(String[] args) {
          Interface4 o1=new Interface4();
          o1.print();
   System.out.println("***************************************************************************");
          Printable1 o2=new Interface4();
          o2.print();
   System.out.println("**************************************************************");
           Showable1 o3=new Interface4();
           o3.print();

	}

}

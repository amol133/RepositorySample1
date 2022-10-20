package day9_8InterfaceAbstraction;
interface Animal5{
	int age=78;
	public void animalsound();
	public void sleep();
}
interface Reptiles{
	void colore ();
}
class pig5 implements Animal5{
	public void animalsound() {
   		System.out.println("sound was wee wee");
	}
	public void sleep() {
   		System.out.println("zzzzz sleeping");
	}
}
class Dog6 extends pig5 implements Reptiles{
	// pig4 non static method are virtually present 
		public void colore() {
       		System.out.println("colore are black");
		}
}
public class Interface7 {

	public static void main(String[] args) {
		pig5 o1=new pig5();
		o1.animalsound();
		o1.sleep();
  System.out.println("*************************************************************************************8");
       Dog6 o2=new Dog6();
       o2.animalsound();
       o2.sleep();
       o2.colore();
  		System.out.println("interface animal variable ="+Animal5.age);

		

	}

}

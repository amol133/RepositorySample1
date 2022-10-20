package day9_8InterfaceAbstraction;

interface Animal0{
	int age=45;  // default final static int age =45;
	public void animalSound();// interface method (does not have a body)
	public void sleep();    // interface method (does not have a body)
}
// pig 'implements'Animal interface
class pig4 implements Animal0{
	public void animalSound() {
   		System.out.println("pig sound wee wee wee");// body provided by child class
	}
	public void sleep() {
   		System.out.println("pig are sleeping");// body provided by child class
	}
}
public class Interface6 {

	public static void main(String[] args) {
		pig4 o1=new pig4();
		o1.animalSound();
		o1.sleep();
 System.out.println("******************************************************************");
       Animal0 o2=new pig4();
       o2.animalSound();
       o2.sleep();
		System.out.println(Animal0.age);

	}

}

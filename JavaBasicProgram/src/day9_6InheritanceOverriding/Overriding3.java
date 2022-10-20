package day9_6InheritanceOverriding;
class Human{
	// overridden method
	// in overriding we can increase the visibility of overridden method -->private-->default-->protected--->public
   // default --> protected or public
   // protected --> public 
	//public---> public
	void eat() {
		System.out.println("human is eating");
	}	
}
class Boy extends Human{
	// overriding method
	protected void eat() {
		System.out.println("Boy is eating");
	}
}


public class Overriding3 {

	public static void main(String[] args) {
		Boy o1=new Boy();
		o1.eat();
		Human o2=new Boy(); //overriding of method
		o2.eat();
	}

}

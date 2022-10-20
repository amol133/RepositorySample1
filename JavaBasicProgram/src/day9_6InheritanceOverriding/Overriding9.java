package day9_6InheritanceOverriding;
class Parent3{
	void show() {
		System.out.println("parents show()");
	}
}
class Child3 extends Parent3{
	// this method overrides show() of parent class
	      void show() {
	    	  super.show();
	    	  System.out.println("Childs show()");
	      }
}
class Grandchild extends Child3{
	// This method overrides child class
           void show() {
        	   super.show();
 	    	  System.out.println("Grandchild show()");
           }
}
public class Overriding9 {

	public static void main(String[] args) {
		Parent3 o1=new Grandchild();
        o1.show();
	}

}

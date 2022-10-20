package day9_6InheritanceOverriding;
class Parent{
	void show() {
		System.out.println("i am show() of parent class");
	}
}
class Child extends Parent{
	// this method overrides show() of parent class
      void show() {
  		System.out.println("i am show()of child class");
      }
}
//driver class
public class Overriding5 {

	public static void main(String[] args) {
   // if a parent type reference refer to parent object,then parent's show() is  called
		Parent o1=new Parent();
		o1.show();// parent show()
	//if a parent type reference refer to child object then child show() is called.this is called RUN TIME 
	// POLYMORPHISM	
		Parent o2=new Child();
		o2.show();// childs show();
		
	}

}

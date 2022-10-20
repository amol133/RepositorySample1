package day9_6InheritanceOverriding;
class Parent1{
	// private method are not overridden,because private member doesn't participate in inheritance
	private void m1(){
		System.out.println("i am m1() of class parent1");
	}
	protected void m2() {
		System.out.println("i am m2() of class parent1");
	}
}
class Child1 extends Parent1{
	// new m1() method
	//no overriding here as its private method,unique method of child class
	public void m1() {
		System.out.println("from child class m1()");
	}
	//overriding method
	//with more accessibility
	@Override
	public void m2() {
		System.out.println("from child class m2()");
	}
}
public class Overriding6 {

	public static void main(String[] args) {
    // Child1 o1=new Child1();
     //o1.m1();
		Parent1 o2=new Parent1();
		o2.m2();
	Parent1 o3=new Child1();
	o3.m2();
	}

}
/** in java we increased the visibility of member but we can not decrease it
 * (private ---> default or protected or public),not possible (public-->protected,default or private)
 * private member of parent class can't be overridden
 * 
 */






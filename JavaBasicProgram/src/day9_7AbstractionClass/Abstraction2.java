package day9_7AbstractionClass;

abstract class Demo{// 50% abstract
	abstract void print();  // abstract method or incomplete method
	
	void display() {// normal class or complete class
		System.out.println("i am non abstarct method display() ");
	}	
}
abstract class Demo1{// 0% Abstract
	 void display() {
			System.out.println("i am a non abstarct display method() of class demo1 ");
	 }
	 void display1() {
			System.out.println("i am non abstarct display1 method() of class demo1");
	 }
}
abstract class Demo2{ // 100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
}
public class Abstraction2 extends Demo {
	 void print() {
		 System.out.println("print of abstract class");
	 }
	 

	public static void main(String[] args) {
        Abstraction2 o1=new Abstraction2();
       o1. print();
       o1.display();
	}

}
/**  class declare with Abstract keyword known as abstarct class ,0 to 100% abstarct
 * 
 * it will have
 *              - Abstract method-->method declare with abstract keyword without body
 *              - Non abstract method --> normal method / concrete method
 *              
 *              -static method
 *              -constructor
 *              -global variable
 *       
 *Abstract class object can't be created as they are incomplete class  
 *
 * if any class contain even one abstract method then class should be declare as abstract class
 * 
 * when abstract class is getting inherited by the child class/ sub class then there will a contract between these classes that
 * sub class need to override all abstract method of abstract class (super class) otherwise subclass becomes
 *   abstract class 
 *            
 * 
*/
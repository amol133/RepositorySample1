package day9_5InheritanceOOPs;

//Super class / parent class/base class
 class A1{
	 // default constructor
	 static int a=10;
	 int b=34;
	 double c=53.34;	 
 }
 /* B1=child class/sub class/derived class
  * A1=Parent class /super class /base class/inherited class
  * All the non static member of A1 class will inherited into B1 class
  * (A non static member will be present virtually in the class B1)
  */
class B1 extends A1{
	//default constructor
	
	static int x=20;
	/*
	 * These non static member of class A1 are virtually present in class B1
	 * b=34;
	 * c=53.34;
	 */
	int y=40;
	double z=55.55;
}

// C inherits class B non static member
class C1 extends B1{
	//  default constructor with super() statement
	static int p=44;
	/*
	 * these non static member of the B1 class are virtually present in the class C1
	 * int b=34;
	 * double c=53.34;
	 * int y=40
	 * double=55.55;
	 * 
	 */
	int q=60;
	double r=66.66;
}



public class Inheritance2 {

	public static void main(String[] args) {
		System.out.println("******static member***********************************");
		System.out.println(" non static member of classA="+A1.a);
		System.out.println(" non static member of classA="+B1.x);
		System.out.println(" non static member of classA="+C1.p);

		System.out.println("******************non static member*******************");
        C1 o1=new C1();// it will have all the non static member of class A1,B1 and C1-->b,c,x,y,q,r
		System.out.println(" non static member of classA1="+o1.b);
		System.out.println(" non static member of classA1="+o1.c);
		System.out.println(" non static member of classB1="+o1.y);
		System.out.println(" non static member of classB1="+o1.z);
		System.out.println(" non static member of classC1="+o1.q);
		System.out.println(" non static member of classC1="+o1.r);
		System.out.println("*****************************************************************");


		B1 o2=new B1();// it will have all  the non static member of class A1 and B1 --->b,c,x,y
		System.out.println(" non static member of classA1="+o2.b);
		System.out.println(" non static member of classA1="+o2.c);
		System.out.println(" non static member of classB1="+o2.x);
		System.out.println(" non static member of classB1="+o2.y);


	}

}

/**
 * Inheritance:
 * when a child class inherit the property of its parent class are known as inheritance
 * 
 * Representation ::
 *                  class childclassname extends parentclassname{
 *                  
 *                  }
 *                  
 *  Inheritance is achieved by using super() statement        
 *          ---> used to call parent / super class constructor based on parameter
 *          ---> super () should be the first statement inside the constructor body
 *          
 * Note         
 *        --  super() and this() can't be  written together
 *        --  static member never participate in inheritance
 *                  
 */












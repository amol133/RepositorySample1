package day14_1Predefine_Class;
class Demo{
	void display() {
		System.out.println("i am display method");
	}
}

public class Object_class1 extends Demo {
	static int last_roll=100;
	int roll_no;
	Object_class1(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
     Demo d1=new Demo();
     System.out.println(d1);// d1.toString();---->day14.Predefine_Class.Demo@7852e922
	 Demo d2=new Demo();
     System.out.println(d2.toString());//---->day14.Predefine_Class.Demo@4e25154f
    System.out.println("*******************************************************************");
	 Object_class1 d3=new Object_class1();
	// below two statement are equivalent
    System.out.println(d3);// java compiler write --->d3.toString()--->string representation of an object
    System.out.println(d3.toString());	// string representation of object
    System.out.println("****************************************************************");	
		 Demo d4=new Object_class1();
	     System.out.println(d4);
	 System.out.println("***************************************************************");	
     System.out.println(new Object_class1());
     System.out.println(Object_class1.last_roll);
     System.out.println(d3.roll_no);
		
		
		
	}

}
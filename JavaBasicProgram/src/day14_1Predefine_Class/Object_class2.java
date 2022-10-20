package day14_1Predefine_Class;

public class Object_class2 extends Demo {
	static int last_roll=100;
	int roll_no;
	Object_class2(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
     Object_class2 d1=new Object_class2();
     // below two statement are equivalent
     System.out.println(d1);// string representation of an object
     System.out.println(d1.toString());// string representation of an object
     System.out.println(d1.hashCode());// it convert hexadecimal into decimal or integer and return the value	
		
		Demo d2=new Demo();
	     System.out.println(d2);
	     System.out.println(d2.toString());
	     System.out.println(d2.hashCode());
		
		
		
	     
	     
	}

}

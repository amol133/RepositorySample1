package day14_1Predefine_Class;
class Demo2{
	void display() {
	     System.out.println("i am disply method of demo2");
	}
}

public class Object_class4 extends Demo2 {
	static int last_roll=200;
	int roll_no;
	Object_class4(){
		roll_no=last_roll;
		last_roll++;
	}
@Override
    void display() {
    System.out.println("i am display method 2");
}
 @Override
     public int hashCode() {
	     return 222;
  }
@Override
     public String toString() {
	       return "basic predifind of object class";
}
	public static void main(String[] args) {
     Object_class4 d1=new Object_class4();
     System.out.println(d1);
     System.out.println(d1.toString());
     System.out.println(d1.hashCode());
		
     System.out.println("************************************************************");
     Demo2 d2=new Demo2();
     System.out.println(d2.toString());
     System.out.println(d2.hashCode());

		
		
		
		
		
		
		
		
	}

}

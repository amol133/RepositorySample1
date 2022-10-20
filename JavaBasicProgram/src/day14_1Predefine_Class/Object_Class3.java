package day14_1Predefine_Class;
class Demo1{
	void display() {
	     System.out.println("i am display method");
	}
}
public class Object_Class3 extends Demo1 {
	static int last_roll=100;
	int roll_no;
		Object_Class3(){
		roll_no=last_roll;
		roll_no++;
	}
     @Override
     void display() {
         System.out.println("i am display method 2");
     }
	@Override
	public int hashCode() {
		return roll_no;
	}
	public static void main(String[] args) {

		Object_Class3 d1=new Object_Class3();
	     System.out.println(d1);
	     System.out.println(d1.toString());
	     System.out.println("hashCode value from Object class3="+d1.hashCode());
        d1.display();
        System.out.println("**************************************************************");
		Demo1 d2=new Demo1();
	     System.out.println(d2);
	     System.out.println(d2.toString());
	     System.out.println("hashCode value from Demo1 class="+d2.hashCode());

		
		
		
		
		
		
		
	}

}

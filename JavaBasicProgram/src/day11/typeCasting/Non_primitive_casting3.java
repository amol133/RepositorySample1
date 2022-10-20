package day11.typeCasting;

class A{
       void test() {
    	   System.out.println("running test");
    }
}
class B extends A{
	void test1() {
 	   System.out.println("running test 1");
	}
}
class C extends B{
        void test2() {
     	   System.out.println("running test 2");
        }
}

public class Non_primitive_casting3 {

	public static void main(String[] args) {
		C b1=new C ();
		b1.test();
		b1.test1();
		b1.test2();
		
		B b2=new C();// implicit auto up casting 
		b2.test1();
		b2.test();
		B b3=b1;// implicit up casting
		B b4=(B) b1;// explicit up casting
	    B b5=(B)new C();
	    b5.test();
	    b5.test1();
	    
	    A b6=new C();// implicit up casting 
	    b6.test();
	    A b7=b1;// implicit up casting
	    A b8 =(A)b1;
	    A b9=(A)new C();// explicit up casting
	    b9.test();
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		

	}

}

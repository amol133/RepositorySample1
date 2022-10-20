package day11.typeCasting;
 class sample{
	    void test1 (double d) {
	        System.out.println("d value="+d);
	    }
	    void test1(int k) {
	        System.out.println("k value="+k);
	    }
 }
public class Primitive_Casting5 {

	public static void main(String[] args) {

	       System.out.println("program start");
             sample c1=new sample();
             c1.test1(7);// it will execute or access k value as integer value is pass in method if it will 7.7 then it access double d value 
             System.out.println("program end");

		
	}

}

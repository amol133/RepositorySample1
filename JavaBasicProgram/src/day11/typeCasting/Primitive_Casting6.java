package day11.typeCasting;
class sample1{
	double test1() {
	       System.out.println("running test");
          return 4;
	}
}
public class Primitive_Casting6 {

	public static void main(String[] args) {
     
	       System.out.println("program start");
           sample1 c1=new sample1();
          int res=(int)c1.test1();
           System.out.println("return value="+res);// direct also c1.test1();
           System.out.println("program end");
		
		
	}



}

package day6.overloadingofmethod;

public class Overloadingmethod5 {

		void disp() {
			System.out.println("display without parameter");
		}
  void disp(int a,double b) {
	double res=a*b;
	  System.out.println("display with parameter double and integer ="+res);
	}
   void disp(double b , double c) {
	   System.out.println("display with double,double");
   }
    void disp(double a ,int b) {
    	System.out.println("disp with double ,int");
    }
   
   
  public static void main(String[] args) {
    Overloadingmethod5 r=new Overloadingmethod5();
    r.disp();
    //r.disp( 2,5);// compile time error
    r.disp(23,90.654);
    r.disp(56.67,56.98);
    r.disp (87.0,90);
    
    }
}
    
    
   


package day5.programmethod;

public class MethodWithReturnType1 {
	
	/** 
	 * simple interest: roi = (p*r*t)/100; 
	 * 
	 */

	static double getROI() {
		int p =55000,t=2;
	float r=5.5f;
	double roi=(p*r*t)/100;
	System.out.println("principal amount is = "+p);
	System.out.println("duration is="+t);
    System.out.println("interest of the total amount="+roi);
    return roi;
	}
	static double getROI(int p,int t,float r) {
		double roi=(p*r*t)/100;
		System.out.println("principal amount ="+ p);
		System.out.println("duration is="+t);
		System.out.println("rate of interest is ="+roi);
		return roi;
	}
	 
   public static void main(String[] args) {
	  System.out.println("final interest= "+getROI());// 1st way value come in consol and execution will done
	  
	  System.out.println("************************************************");
	   getROI(); // 2nd way only get value it will not come in console
	   
	   System.out.println("**************************************************");
	     double x=getROI(); // inorder to store value in variable for use in future
	   double finalamount=55000+x;
	   System.out.println("final amount including interest="+finalamount);
	   
	   System.out.println("*************passing parameter in variable*********** ");
	   int p=65000;
	   int t=3;
	   float r=3.5f;
	   double roi=(p*r*t)/100;
	   double totalamount=65000+roi;
	   System.out.println("rate of interest= " + roi);
	   System.out.println("final amount ="+totalamount);
	              //OR
	   int amount=65000;
	   int duration=3;
	   float rate=3.5f;
	   double interest=getROI(amount,duration,rate);
	   double wholeamount=amount+interest;
	   System.out.println("interest of three year="+interest);
	   System.out.println("whole amount of three year= "+ wholeamount);
	   
	   System.out.println("***********using paramerer 2******************88");
	   interest=MethodWithReturnType1.getROI(amount,duration,rate);
	   wholeamount=amount+interest;
	   System.out.println("final amount = " + wholeamount); 
	   
	   
	   
   }
	
}

package day5.programmethod;

public class Methodwithreturntype2 {
/**
 * simple interest roi=(p*r*t)
 * 
 */
	static double getROI() {
		int p=5500;
		int t=2;
		float r=5.5f;
		double roi=(p*r*t);
		System.out.println("principal amount ="+ p);
		System.out.println("duration is ="+t); 
		System.out.println("rate of interest is ="+roi);
		return roi;
	
	}
	
       static double getROI(int p,int t,float r) {
	    double roi=(p*r*t);
	    System.out.println("principal amount="+p);
        System.out.println("duration is ="+t);
        System.out.println("rate of interest ="+roi);
        return roi;
       }
   public static void main(String[] args) {
	   System.out.println("program start");
	   getROI();//we will able to execute method but wont get its return value to print or use
	   
	   System.out.println("******************get value of roi in console*****************");
	   System.out.println("final rate of interest="+getROI());
	   // we will able to execute method body as well as also get a return value in console
	   
	   System.out.println("***************getROI return value store in variable******************");
	   // we will able to execute the method body and return value can be stored in the variable for future use
	   double x=getROI();
	   double finalAmountToBePaid=5500+x;
	   System.out.println("final amount to be paid ="+finalAmountToBePaid);
	   
	System.out.println("******************using parameter************");
	int amount=95000;
	int duration=2;
	float roi=4.5f;
	double interest=getROI(amount,duration,roi);
	double finalamount=amount+interest;
	System.out.println("final amount including interest="+finalamount);
	
	
	System.out.println("**************using parameter 2********************");
	interest=Methodwithreturntype2.getROI(8500,2,4.5f);
    finalamount=8500+interest;
	System.out.println("total amount is ="+finalamount);
	
	
	
	   
	   
   }
        
        
        
        
        
        
        
        
}     

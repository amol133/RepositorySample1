package day9_7AbstractionClass;
abstract class RBIBank{
	abstract double getRateOfIntrestForHomeLoan();
	  final void loan() {
			System.out.println("i am final loan method of class rbibank");
	  }
}
class SBI extends RBIBank{
	double getRateOfIntrestForHomeLoan() {
		return 6.6;
	}
}
class PNB extends RBIBank{
	double  getRateOfIntrestForHomeLoan() {
		return 7.77;
	}
}
public class Abstraction5 {

	public static void main(String[] args) {
       PNB o1=new PNB();
      System.out.println("PNB home loan intrest = "+ o1. getRateOfIntrestForHomeLoan()+"%");
		o1.loan();
		System.out.println("*************************************************************8");
		SBI o2=new SBI();
	      System.out.println("SBI home loan intrest = "+ o2. getRateOfIntrestForHomeLoan()+"%");
       o2.loan();
System.out.println("*************************************************************8");
        RBIBank o3=new SBI();
	      System.out.println("SBI home loan intrest = "+ o3. getRateOfIntrestForHomeLoan()+"%");
          o3.loan();
  System.out.println("*************************************************************8");
         RBIBank o4=new PNB();
         System.out.println("PNB home loan intrest = "+ o1. getRateOfIntrestForHomeLoan()+"%");
         o4.loan();

  
  
  
	}

}

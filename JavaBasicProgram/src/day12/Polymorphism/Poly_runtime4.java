package day12.Polymorphism;
class Bank{
	float  getrateOfInterest() {
         return 0;
	}
}
class SBI extends Bank{
	float getrateOfInterest() {
		return 5.5f;
	}
}
class ICICI extends Bank{
	float getrateOfInterest() {
		return 8.8f;
	}
}
class Axis extends Bank{
	float getrateOfInterest() {
		return 7.7f;
	}
}
public class Poly_runtime4 {

	public static void main(String[] args) {
     Bank p1=new SBI();// up casting
	   System.out.println("SBI rate of interst="+p1.getrateOfInterest());
	   Bank p2=new ICICI();
	   System.out.println("ICICI rate of interest="+p2.getrateOfInterest());
	Bank p3=new Axis();
	   System.out.println("AXIES rate of interest="+p3.getrateOfInterest());
	   
	   System.out.println("********down casting************8");
		Axis p4=(Axis)p3;
 	   System.out.println("Axies bank="+p4.getrateOfInterest());
	   System.out.println("bank ="+p4.getrateOfInterest());

		
		
	}

}

package day9_8InterfaceAbstraction;

interface Bank{
	float rateOfInterest();
}
class SBI1 implements Bank{
	public float rateOfInterest() {
		return 5.5f;
	}
}
class PNB1 implements Bank{
	public float rateOfInterest() {
		return 7.7f;
	}
}

public class Interface2 {

	public static void main(String[] args) {
        SBI1 o1=new SBI1();
		System.out.println("sbi interest="+o1.rateOfInterest());
System.out.println("******************************************************");
        PNB1 o2=new PNB1();
		System.out.println("pnb interest ="+ o2.rateOfInterest());
System.out.println("***************************************************************88");
        Bank o3=new SBI1();
		System.out.println("sbi interest="+o1.rateOfInterest());

	}

}

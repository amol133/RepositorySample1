package day10.Encapsulation;

class Demo2{
	public static final String System = null;
	private int pincode=425111;
	private double salary=95000;
	private char Grade='A';
	// getter return should be match with the private data member 
	public int getpincode() {
		return pincode;
	}
	public double getsalary() {
		return salary;
	}
	public char getGrade() {
		return Grade;
	}
	public void setpincode(int pincode) {
		this.pincode=pincode;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public void setGrade(char g) {
		this.Grade=g;
	}
}

public class Encapsulation5 {

	public static void main(String[] args) {
		Demo2 e1=new Demo2();
		System.out.println("get pincode="+e1.getpincode());
		System.out.println("get salary="+e1.getsalary());
		System.out.println("get grade="+e1.getGrade());

		System.out.println("************value modify*****************************");
        e1.setpincode(123456);
        e1.setsalary(1230000);
        e1.setGrade('B');
        System.out.println("updated pincode="+e1.getpincode());
		System.out.println("updated salary="+e1.getsalary());
		System.out.println("updated grade="+e1.getGrade());

	}
}

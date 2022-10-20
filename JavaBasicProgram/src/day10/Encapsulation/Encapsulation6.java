package day10.Encapsulation;
class Demo4{
	private int pincode=345654;
	private double salary =140000;
	private char grade='A';
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	
	
}
public class Encapsulation6 {

	public static void main(String[] args) {
		Demo4 e1=new Demo4();
       System.out.println("pincode="+e1.getPincode());
       System.out.println("salary= "+e1.getSalary());
       System.out.println("char="+e1.getGrade());
       
       System.out.println(" ***********we can modify value**********");

       e1.setGrade('B');
       e1.setPincode(123456);
       e1.setSalary(349900);
       System.out.println("pincode up="+e1.getPincode());
       System.out.println("salary up="+e1.getSalary());
       System.out.println("char up="+e1.getGrade());

       
       
       
       
       

	}

}

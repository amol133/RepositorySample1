package day10.Encapsulation;

class student1{
	private int pincode= 411052;
	
	// setter method allow we to modify private data member value without impacting original data 
	public void setPinCode(int x) {
		pincode=x;
	}
	
}

public class Encapsulation_writeOnlySetter {

	public static void main(String[] args) {
		student1 e1=new student1();
		e1.setPinCode(234555);
		System.out.println("setter method");


	}

}

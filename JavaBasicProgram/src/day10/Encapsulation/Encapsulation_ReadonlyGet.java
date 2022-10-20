package day10.Encapsulation;
class student{
	// private data member 
	private int pincode=425111;
	
   //getter method allow we to use our private data from outside the class
	
	public int getPinCode() {
	       return pincode;
	}
//	public void setpinCode(int pincode) {// setter method allow to modify the private variable from outside the class without impacting the original data
	//	this.pincode=pincode;
	//}
	
}

public class Encapsulation_ReadonlyGet {

	public static void main(String[] args) {
		// creating instance of the encapsulated class
		
		student e1=new student();
	//	System.out.println(e1.pincode);// error as private member are not accessible from outside the class
    
   // getting value of the name member
		System.out.println("get method ="+e1.getPinCode());

		
	}

}

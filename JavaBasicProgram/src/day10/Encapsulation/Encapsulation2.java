package day10.Encapsulation;
 class demo{
	 private int empId=1313;
	 private double salary=100000;
	 
	 public int getempId() {
		 return empId;
	 }
	 public void setEmpId(int empId) {
		 this.empId=empId;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void setSalary(double salary) {
		 this.salary=salary;
	 }
 }

public class Encapsulation2 {

	public static void main(String[] args) {
		System.out.println("accessing private member from another class by using getter method");
		demo e1=new demo();
		System.out.println("accessing the private member of empid="+e1.getempId());
		System.out.println("accessing the private member of salary="+e1.getSalary());
		System.out.println("********modifying the private data member value by setter method*********");
		e1.setEmpId(1212);
		e1.setSalary(150000);
		
		System.out.println("accessing the modify private data member value of empid="+e1.getempId());
		System.out.println("accessing the modify private data member value of salary="+e1.getSalary());

		System.out.println("*************creating new instance or object it will give first value or default alredy given value********8");
		demo e2=new demo();
		System.out.println("accessing the private member data in new object empid="+e2.getempId());
		System.out.println("accessing the private memebr data in new object salary="+e2.getSalary());
		
	}

}
/**
 * In order to access private variable outside the class we need to used / implement getter method
 *      --->getter method --> helps to access private variable from outside the class
 *                       ---> declare with public 
 *                       --->return type of this method should be same as private variable
 *                       --->it should return private variable
 *                       
 *In order to modify private variable outside the class we need to use /implements setter method
 *       --->setter method---> helps to modify private variable from outside the class
 *                        ---> declare with public
 *                        --->return type of this method is void 
 *                        --->parameter datatype should be same as private variable      
 *                       
 *                       
 *                       
 */









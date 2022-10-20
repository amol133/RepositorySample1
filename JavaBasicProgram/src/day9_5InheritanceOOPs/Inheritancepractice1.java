package day9_5InheritanceOOPs;
class company1{
	int age;
	company1(){
		this(23);
		System.out.println("i am zero parameter constructor");
		age=25;
	}
	company1(int a){
		System.out.println("i am comapany constuctor with int parameter");
	}
	public void display() {
		System.out.println("i am display() with zero parameter");
		this.display(45.53);
	}
	public  void display(double b) {
		System.out.println("i am display() with double parameter="+b);
       // this.display();
	}
}
class employee1 extends company1{
	int age;
	       employee1(){
	    	   this(66);
	    	   System.out.println("i am zero parameter constructor");
	    	   age=66;
	    	   
	       }
	       employee1(int num){
	    	   super();
	    	   System.out.println("i am constructor with int parameter");
	       }
	 public void print() {
	           System.out.println(" i am print with zero paramter");
	           
	 }
	 public void print(double z) {
		 System.out.println(" i am print method with parameter double z="+z);
		this. print();
		 super.display();
		 System.out.println("employee class age="+age);
		 System.out.println("company class age="+super.age);

	 }
}

public class Inheritancepractice1 {

	public static void main(String[] args) {
		employee1 o1=new employee1();
		o1.print(34.34);
	

	}

}

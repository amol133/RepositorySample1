package day9_3Thiskeyword_This_statement;

public class constructorThisKeyword {

	static int age;
	int salary; // non static global variable
	int empid;
	
	void display(int salary) {
		
	             System.out.println("salary="+salary);	
		         System.out.println("nsgv salary="+this .salary);
		         this.salary=45000;
		         System.out.println("nsgv this salary="+ this .salary);
	}
	public static void main(String[] args) {
		int age=23;
		System.out.println("age="+age);
		System.out.println("global age="+ constructorThisKeyword.age);
        
		int salary=12000;// local variable
		int empid=122;
		System.out.println("local salary="+salary);
		System.out.println("local empid="+empid);

		constructorThisKeyword c1=new constructorThisKeyword();
		System.out.println("nsgv salary="+c1.salary);
		System.out.println("nsgv empid="+c1.empid);
		c1.display(3452);
		System.out.println("updated nsgv salary="+c1.salary);

		constructorThisKeyword c2=new constructorThisKeyword();
        
		System.out.println("nsgv salary="+c2.salary);
		System.out.println("nsgv empid="+c2.empid);		

	}
}
/**
 * this keyword is a pre defined keyword in java
 * this keyword is an object of current class
 * this keyword is used to differentiate non static global variable and local variable when both have same name
 * this keyword can be used only for non static method
 * 
 * 
 * 
 */







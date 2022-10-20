package day5.programmethod;

public class Methodwithnonstatic1 {
	
	int age;  // int age=25; tried also
	public void display() {
    System.out.println("im display () of Methodwithnonstatic1 class and age value is ="+age);
	}
	public void display(int a) {
		age=a;
		System.out.println("im display() of Methodwithnonstatic1 class and age is= "+ age);
	}		

	public static void main(String[] args) {
		
		Methodwithnonstatic1 ref1=new Methodwithnonstatic1();
		//ref1.display(50); we can take directly also when we create new object it take default value given at the starting or at class
	System.out.println("age =" +ref1. age);//age=0
	  ref1.display();// age=0     
	 ref1.display(25);// age =25
	 
	 System.out.println("age =" + ref1.age);
	 
	 Methodwithnonstatic1 ref2=new Methodwithnonstatic1();
	 System.out.println("age = " + ref2.age);//age=0
	 ref2.display(50);//age =50
	 System.out.println("age =" + ref2.age);
	 
	System.out.println("**********************************************************"); 
	 Methodwithnonstatic1 ref3=new Methodwithnonstatic1();
	 System.out.println("age = " + ref3.age);
	 ref3.display();
	 ref3.display(40);
	 System.out.println("new age=" +ref3.age);
	 
	 
	 
	 
	 
	
	}

}

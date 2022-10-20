package day9_5InheritanceOOPs;
// parent class
class company{
	void display() {
		System.out.println("i am display() of class company");
	}
}

//chid class
class employee extends company{
	// Overriding method
	void display() {
		super.display();
		System.out.println("i am employee class of display ()");
	}
	void callme() {
		System.out.println("i am employee of class of method call me");
      //  super.display();
        //display();
	}
}
public class Inheritance10 {
	

	public static void main(String[] args) {
     employee o1=new employee();
     o1.display();
     o1.callme();
     System.out.println("*********************************************************8");
     company o2=new company();
     o2.display();
     System.out.println("**************************************************");
     company o3=new employee();
     o3.display();
     
     
     
	}

}

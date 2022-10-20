package day14_1Predefine_Class;
class Traning{
	Traning(){
		System.out.println("i am training constructor of training class");
	}
	void manualTesting() {
		System.out.println("i am manual testing method");
	}
	void automationTesting() {
		System.out.println("i am automation testing method");
	}
}

public class System_class3 {
	final static Traning d1=new Traning(); 

	public static void main(String[] args) {
		// calling method by using static reference

		System_class3.d1.manualTesting();
		System_class3.d1.automationTesting();
		// class.static ref.non static method
		
		Traning d2=new Traning();// as regular
		d2.manualTesting();
		d2.automationTesting();
		// predifine system class "out ,err,in"have three reference
		System.err.println("i am error");
		
		
		
		
		
	}

}

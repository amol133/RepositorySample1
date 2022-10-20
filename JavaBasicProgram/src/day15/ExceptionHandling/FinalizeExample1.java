package day15.ExceptionHandling;

public class FinalizeExample1 {
	public void finalize() {
		System.out.println("hi i am your finalize method");
	}

	public static void main(String[] args) {

	// finalize --> just before destroying any object,garbage collector always calls finalize()
	//	            activities on that object
		
		FinalizeExample1 F=new FinalizeExample1();
		System.out.println(F.hashCode());
		
		F=null;
		Object obj;
		System.gc();
		System.out.println("program ends");
		
	
	}

}

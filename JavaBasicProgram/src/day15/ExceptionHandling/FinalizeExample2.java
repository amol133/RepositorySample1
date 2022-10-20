package day15.ExceptionHandling;

public class FinalizeExample2 {
	public void finalize() throws Throwable {
	
	try {
		System.out.println("inside the try block");
	}
	catch(Throwable e) {
		throw e;
		
	}
	finally {
		System.out.println("calling finalize method of the object class ");
		super.finalize();
	}
	}
	public static void main(String[] args) throws Throwable {
//		finalize --> just before destroying any object ,garbage collector always calls finalize () to perform clean up 
//                   Activities on that object
		
		FinalizeExample2 F=new FinalizeExample2();
        F.finalize();
		
		System.out.println("program end");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

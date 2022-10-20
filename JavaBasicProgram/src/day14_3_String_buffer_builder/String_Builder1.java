package day14_3_String_buffer_builder;

public class String_Builder1 {

	public static void main(String[] args) {
		
		/**
		 * mutable :can be changed without creating object
		 * not a thread safe-can access multiple member at time
		 * object will be created only by using new keyword 
		 */
		StringBuilder b=new StringBuilder("Hello ");
		b.append("java");
		System.out.println(b);// hello java
		
		b.reverse();
		System.out.println(b);
		
		StringBuilder b1=new StringBuilder("Hello java");
		System.out.println(b1);
       
		StringBuilder b2=new StringBuilder("Hello java");
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));// address basis comparison
		System.out.println(b1==b2);  //address basis comparison
		
		// we dont have any method in StringBuffer and StringBuiler to compare object values ,so to
		//then we use equals() of string class
		
		System.out.println(b1.toString().equals(b2.toString()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

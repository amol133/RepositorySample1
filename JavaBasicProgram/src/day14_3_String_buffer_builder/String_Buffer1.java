package day14_3_String_buffer_builder;

public class String_Buffer1 {

	public static void main(String[] args) {
		
		//String str=new String("ABC")
		//str.
		/**
		 * Mutable - it can be changed without creating new object
		 * thread safe-one member can access one time
		 * object created only using new keyword
		 */
		
		StringBuffer B1=new StringBuffer("hello ");
		System.out.println("original stringBuffer value="+B1);// hello 

		B1.append("java");//now original string is changed it will added from last to previous word
		System.out.println(B1);
		
		B1.insert(5, "nashik");
		System.out.println(B1);//hellonashik java
		
		B1.replace(1, 3, "aaa");
		System.out.println(B1);
		
		B1.delete(1, 4);
		System.out.println(B1);
		
		StringBuffer sb=new StringBuffer("Banglore is known for IT");
		
		sb.reverse();
		System.out.println(sb);
		System.out.println("&**********************************************************");
		StringBuffer B2=new StringBuffer();
		System.out.println(B2.capacity());// default 16
		
		B2.append("hello");
		System.out.println("first word="+B2);
		System.out.println(B2.capacity());//now 16
		
	   B2.append("java is my favourite language");
    	System.out.println("2nd word="+B2);
		System.out.println(B2.capacity());//(16*2)+2=34
		
		B2.append("i am from automation area");
		System.out.println("3rd word="+B2);
		System.out.println(B2.capacity());//(34*2)+2=70
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}

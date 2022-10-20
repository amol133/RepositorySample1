package day14_2_scanner_String_class;

public class String1 {

	public static void main(String[] args) {
		
		String1 c1=new String1();
	      System.out.println("c="+c1);// toString()
		// String class object creation
	    //1 using literal
	    String s1="mumbai";// new object will be created in string constant pool
	    String s2="mumbai";// no object will be created as its a duplicate object ,so's2' will point to 's1'object
	    String s3="Bangalore";// new object will be created in string constant pool
	    System.out.println("s1: "+s1);// object value because toString is override in String class
	    System.out.println("s2:"+s2);
	    System.out.println("s3:"+s3);
       System.out.println("s1 char count="+s1.length());// here length() and in Array ie length only
	   System.out.println("s2 char count="+s2.length());
       System.out.println("s3 char count="+s3.length());
      /**
       * Out side String class 
       *       == ---> compare two values
       *       .equal(obj)-->compare two object based on there address
       * inSide String class      
       *    == ----> compare on two object on there address
       *    .equal(obj)-->compare two object based on value
       * 
       */

       System.out.println("s1 & s2 using equals()="+s1.equals(s2));// compare s1 and s2 values
       System.out.println("s1 and s2 using '== :"+(s1==s2));// compare s1 and s2 based on address
       System.out.println("s1 and s3 using equals="+s1.equals(s3));
       System.out.println("s1 and s3 using ==:"+(s1==s2));
   
       String s4=new String("mumbai");// two object 1.one in constant pool and one in non constant pool
       System.out.println("s4 ="+s4);
       
       System.out.println("s1 and s4 using equals()="+s1.equals(s4));
       System.out.println("s1 and s4 using ==:"+(s1==s4));

       String s5=new String("mumbai");// two object 1.
       System.out.println("s5="+s5);
		
       System.out.println("s4 and s5 usinig equals="+s4.equals(s5));
       System.out.println("s4 and s5 using == :"+(s4==s5));

	 String s6=new String("Hyderabad");// two object 1.constant string  pool 2.from non constant pool
     System.out.println("s6="+s6);
		
     System.out.println("s1 and s6 using equals="+s1.equals(s6));
     System.out.println("s1 and s6 using == :"+(s1==s6));		
		

	}

}
/**
 *  String pre define class in java belongs to java.lang package
 *  it represent group/collection of character
 *  in string class following methods are override
 *   
 *                 1.toString()-->instead of printing string representation of object it will print value store
 *                                 inside then string object
 *                 2. equals () --->override
 *                 3.hashCode()                   
 * 
 * we can create String class object in two ways
 * 
 *    1.by using new keyword 
 *                         --->object will be store in non constant pool
 *                         --->by using this we can have duplicate object also
 * 
 *   2.by using literal
 *                      ------>object will be stored in string constant pool(inside heap)
 *                      ------> by using this we can create only unique object inside the pool
 *                      
 * 
 * 
 * 
 * 
*/
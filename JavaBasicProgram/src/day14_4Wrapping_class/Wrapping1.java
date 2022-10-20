package day14_4Wrapping_class;

public class Wrapping1 {

	public static void main(String[] args) {
		int a=20;
		// converting int into integer
		Integer k=new Integer(a);  // converting int into integer explicitly
		Integer I=new Integer(20);// converting int into integer explicitly
		
		Integer j=a;  // auto boxing now compiler will write integer .valueOf(a)internally
		
		System.out.println("\na="+a+"\nk="+k+"\nI="+I+"\nj="+j);
		
		System.out.println("****unboxing of boxed object******************************");
		//converting Integer into int
		Integer a1=new Integer(25);
		int x=a1.intValue();// converting integer into int explicitly
		System.out.println("a1="+a1+ "\n x="+x);

		System.out.println("a1==x="+(a1==x));
		System.out.println("a1.equals(x)="+a1.equals(x));
	}

}
/**
 *  Wrapper class is predefined class in java belong to java.lang package
 *  
 * it is used to convert primitive type to object type 
 *            ------>boxing operation ---> implicitly or auto boxing
 *            
 * converting back the boxed object into primitive type is known as 
 *         -------->un-boxing operation
 *         
 * in wrapper class toString() & equals & '==' are overridden
 * 
 */




















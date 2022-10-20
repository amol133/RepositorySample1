package day14_2_scanner_String_class;

public class String7 {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer();
		System.out.println("length ="+s1.length());
		System.out.println("capacity ="+s1.capacity());
		
		s1.append("JavaBasic");
		System.out.println("length="+s1.length());
		System.out.println("capacity="+s1.capacity());
		
		
		s1.trimToSize();
		System.out.println("Length="+s1.length());
		System.out.println("capacity="+s1.capacity());
		
		String s2="JavaBasics";// split
		String[] arr=s2.split("B");
          for(String x:arr) {
      		System.out.println(x);
          }
          
       String s3=arr[0];
       String s4=arr[1];
		System.out.println(s3);
		System.out.println(s4);
          
          
	}

}

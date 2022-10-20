package day14_2_scanner_String_class;

public class String3 {

	public static void main(String[] args) {
		String s="I am from india ,i am working in xyz ,i am working as QA Engg";
		System.out.println("Actual String="+s);
		
		String[] sArray=s.split(" ");
		for(String x:sArray) {
			System.out.println(x);
		}
		System.out.println("****************************************************************");
		String s1="i am amol pawar from pune";
		String[] arr=s1.split(" ",2 );
		for(String z:arr) {
			System.out.println(z);
		}
		System.out.println("************************************************");	
		String s2="i am from nashik";
		//System.out.println("original="+s2);
		String[] ar=s2.split(" ");
		String temp="";
		for(String a:ar) {
			System.out.println(a);
		}
		for(int i=ar.length-1;i>=0;i--) {
			temp=temp+" "+ar[i];
		}
		System.out.println("reverse statement="+temp);
		System.out.println("**************************************************************************88");

		String s3="       i am Amol       ";
		System.out.println("actual string with space="+s3);// it give answer in only space outside word
		System.out.println("Actual string with length="+s3.length());
		System.out.println("Actual string without string="+s3.trim());
		System.out.println("Actual string lenght without spaces="+s3.trim().length());
		System.out.println("***************************************************************");

		String s4="i        am             amol       ";
		System.out.println("Actual string without space="+s4.trim());// not trim as space inside the word
		System.out.println("Actual lenght without space="+s4.trim().length());


		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

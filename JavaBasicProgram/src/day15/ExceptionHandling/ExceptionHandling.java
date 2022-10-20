package day15.ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("program starts from here....");
	
	   //1.abnormal statement
		int i=10;
		int j=i/0;// ArithmeticException
		System.out.println("res="+j);
		
	 // 2.abnormal statements
		int[] empId=new int[3];
		empId[3]=111;// arrayIndexOutOfBoundException
		
	// 3.abnormal condition
		String str=null;
		System.out.println(str.length());// nullPointException
		
	// 4.abnormal statement
		String s="abc";
		int num=Integer.parseInt(s);// NumberFormatException
		System.out.println("num="+num);
		System.out.println("program end");
		
	}

}

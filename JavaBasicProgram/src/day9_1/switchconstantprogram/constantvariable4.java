package day9_1.switchconstantprogram;

public class constantvariable4 {
	
	final static int empId=34;
	final int acc=100;
	
	public static void main(String[] args) {
		
		final int age= 23;
		
		System.out.println("age ="+age);// local fixed variable

		System.out.println("empId ="+empId);// static final variable

        constantvariable4 ref1=new constantvariable4();
		System.out.println("acc ="+ref1.acc);// non static final variable

		
	}

}

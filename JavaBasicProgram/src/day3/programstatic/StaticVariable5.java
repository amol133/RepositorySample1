package day3.programstatic;

public class StaticVariable5 {
	//static global Variable
	static int num1,num2=25,res;

	public static void main(String[] args) {
	System.out.println("number 1= " +num1);
	System.out.println("number2 =" +num2);
	res=num1+num2;
	System.out.println("**********************************");

	num1=75;
	res=num1+num2;
	System.out.println("number1 = " + num1);
	System.out.println("number2 = " + num2);
	System.out.println("sum of both num = " + res);
	System.out.println("********************************");
	
	num1=85;
	num2=65;
	res=num1-num2;
	System.out.println("number1 = " + num1);
	System.out.println("number 2 = " + num2);
	System.out.println("subtraction of both num = " + res);



	


	}

}

package day4.programnonstatic;

public class Allinonevariable2 {
	static int num1;
	static int num2;
	static int res;
	int num3;
	int num4;
	int res1;

	public static void main(String[] args) {
	
		int num5=10;
		int num6=17;
		Allinonevariable2 ref1=new Allinonevariable2();
		ref1.res1=num5+num6;
		System.out.println("sum of the number ="+ ref1.res1);
		
		Allinonevariable2 ref2=new Allinonevariable2();
		ref2.num3=25;
		ref2.num4=50;
		//ref2.res1=ref2.num3+ref2.num4;
		System.out.println("num of number ="+ (ref2.num3+ref2.num4));
		
		int num1=50;
		int num2=100;
		res=num1+num2;
		System.out.println("sum of the number ="+ res);
		
		
		
		
		
		
		

	}

}

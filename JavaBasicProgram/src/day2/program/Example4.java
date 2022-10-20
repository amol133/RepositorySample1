package day2.program;

public class Example4 {

	public static void main(String[] args) {
		// variable declare and initialization 
		int age1=50;
		int age2=45;
		int sum=age1+age2;	
	System.out.println("age of first person = "+age1);
	System.out.println("age of second person = " + age2);
	System.out.println("sum of both person = " + sum);
 // compound interst A=p*(1+(r/n)^(n*t)
	int p=4800;
	float r=5.5f;
	int n=3;
	int t=5;
	double A=p*Math.pow(1+(r/n),n*t)-p;
	
	System.out.println("principal =" +p);
	System.out.println("compound interst = " + A);

	
	
	

	}

}

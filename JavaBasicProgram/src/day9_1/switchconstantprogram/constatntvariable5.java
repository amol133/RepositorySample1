package day9_1.switchconstantprogram;

public class constatntvariable5 {
	
	final int empid=90;
	double salary=34400.667;

	 void run() {
		 System.out.println("empid="+empid + " " +"salary ="+salary);
	 }
	public static void main(String[] args) {
		constatntvariable5 c1=new constatntvariable5();
		c1.run();
		System.out.println(c1.salary);
		
		
		
	}

}

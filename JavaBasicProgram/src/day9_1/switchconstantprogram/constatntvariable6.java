package day9_1.switchconstantprogram;

public class constatntvariable6 {

	final int speedlimit;// blank final variable

	constatntvariable6(){
		speedlimit=70;
		System.out.println(speedlimit);
	}
	
	
	public static void main(String[] args) {

		constatntvariable6 c1=new constatntvariable6 ();
		System.out.println(c1.speedlimit);
		
	}

}
/**
any variable which is declare as final should be initialize at the same time
but for non static global final variable can be declare and initialize inside the constructor body

*/
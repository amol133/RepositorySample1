package day9_2.constructor;

public class constructor3 {
	    
	int age;
	double salary;
	/** below is default constructor ,that will written by the java compiler at the time of compilation
	 * 
	 */
	constructor3(){
		// empty body
	}
	

	public static void main(String[] args) {

		constructor3 c1=new constructor3();
		System.out.println(c1.age);
        System.out.println(c1.salary);
       c1. age=56;
       c1.salary=89000;
       System.out.println(c1.age);
       System.out.println(c1.salary);
        
	}

}

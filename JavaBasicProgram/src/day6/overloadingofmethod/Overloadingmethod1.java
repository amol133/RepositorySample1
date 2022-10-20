package day6.overloadingofmethod;

public class Overloadingmethod1 {

	/**
	 * method overloading=if a class has multiple number of method havind the same name but different parameter
	 * 
	 * rule of declare method overloading
	 * 1.type of the parameter should be different 
	 * 2.number of the parameter should be different
	 * 3.position of the parameter should be different
	 * 
	 * why: to perform same action in different ways we use overloading of method
	 * 
	 * 
	 */
	static double res;
	static public void square (double number) {
		res= number *number;
	System.out.println("method with double argument called ="+res);
	}
	static public void square() {
	System.out.println("no parameter method called");
	}
	static public void square(int number) {
	res=number*number;
	System.out.println("method with integer argument called ="+res);
	
	}
	static public void main(String[] args) {
	Overloadingmethod1.square(2);
	Overloadingmethod1.square();
	Overloadingmethod1.square(4.5);
	
System.out.println("********************passsing parameter**************");	
	double num=34.45;
	int x=23;
	 square(num);
     square(x);
	}

}


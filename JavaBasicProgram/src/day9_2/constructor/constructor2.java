package day9_2.constructor;

public class constructor2 {

	constructor2(){
		 System.out.println("this is a zero parameter constructor");
	}
	public constructor2(char c) {
		System.out.println(" this is single parameter constructor");
	}
	constructor2(int  num1,int num2){
		System.out.println("this is int int type parameter constructor");
	}
	constructor2(double num1,int num2){
		System.out.println("this is double int type parameter constructor");
	}
	constructor2(int num1,double num2){
		System.out.println("this is a int double type parameter constructor");
	}
	public static void main(String[] args) {
	 constructor2 c1=new constructor2();
	 constructor2 c2=new constructor2('A');
     constructor2  c3=new constructor2(12,23);
     constructor2  c4= new constructor2(34.56,67);
     constructor2  c5=new constructor2(13,54.45);
     //System.out.println("double and int value ="+ (34.56+67));
	}

}

/*
 * constructor overloading: when class have more than one constructor with same but different in parameter
 * rule 1.type of parameter should different 
 *       2.number of parameter should be diff
 *       3.position of parameter should be diff.
 */    














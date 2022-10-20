package day9_2.constructor;

public class constructor9 {
        int age;
        double salary;
        constructor9(){
        	System.out.println("****using program zero parameter start from here********");
        	age=46;
        	salary=8976.56;
        	System.out.println("****using program zero parameter end from here********");

        }
	public static void main(String[] args) {
     constructor9 c1=new constructor9();
     System.out.println("class constructor global variable =" + c1.age);
     System.out.println("class constructor global variable =" + c1.salary);

	}

}
/**
 * as we know the constructor is used to initialize the non static member of the class hence here
 * variable value getting initialize by the constructor
 * 
 */



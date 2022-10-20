package day1.program;

import day9_9AccessModifires.ProtectedMember1;

public class Example extends ProtectedMember1 {

	public static void main(String[] args) {
		Example m1=new Example();
	    System.out.println("accessing the protected member from package 9_9 to 1");
         m1.displayAccNum();
         System.out.println("protected data ="+m1.AccNum);


	}

}
// using inheritance we can access the protected member from outside the package
//  protected member only support single level inheritance doesn't support multi level inheritance
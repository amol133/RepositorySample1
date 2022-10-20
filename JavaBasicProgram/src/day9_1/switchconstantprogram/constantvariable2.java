package day9_1.switchconstantprogram;

public class constantvariable2 {

	public static void main(String[] args) {
		
		final int age=24; // the keyword used "final" means constant the age value is not change 
		     System.out.println("age ="+age);
		     
           /*  age=50;
     		System.out.println("updated age ="+age);// compile time error
            age=34;
    		System.out.println("updated age ="+age);
            age=67;
    		System.out.println("updated age ="+age);

			*/
// when we dont want to change  variable value then that variable should be declare with final keyword
// if we try to change value of final variable then it will compile time error	     
	}

}

package day9_1.switchconstantprogram;

public class constantvariable3 {

	public static void main(String[] args) {
		
	   int age=34;
		System.out.println("age ="+age);
       age=45;
		System.out.println("updated age ="+age);
       age=23;
		System.out.println("updated age ="+age);
       // final age=33; // wrong syntax final keyword should be used at time of declaration only
		System.out.println("updated age ="+age);
       age =104;
		System.out.println("updated age ="+age);

// if we used 'final' in between then all statement shows compile time error
	}

}

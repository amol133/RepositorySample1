package day7.Operatorprogram;

public class Unaryoperation4 {

	public static void main(String[] args) {
		
		int a=0,b;
		b= a++ + ++a + ++a +a;
// intial=0+2+3 +3=8		
//final =0+2+3+3=3
				
				
		System.out.println("a="+ a);
		System.out.println("b="+ b);
		
		a=0;
		b= a-- + --a + --a + a;

//intial=0	+-2+-3+-3=-8	
// final =0+-1=-2+-3=-3
		
		System.out.println("a="+ a);
		System.out.println("b="+ b);

    a=0;
    b= --a + --a + --a + a + ++a + a++;

 //intial b=-1 + -2 + -3 + -3 + -2 + -2=-13     
 // final a=-1+ -2 + -3 + -3 +-2 +-1=-1   
    
	System.out.println("a="+ a);
	System.out.println("b="+ b);

		
	a=0;
	b= a-- + a + ++a + a++ + ++a + a++ + a;
	//b=6;
	//a=3;
	
	System.out.println("a="+ a);
	System.out.println("b="+ b);

		
		
		
		
		
		
		
		
		

	}

}

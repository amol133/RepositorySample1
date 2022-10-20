package day7.Operatorprogram;

public class Unaryoperation3 {

	public static void main(String[] args) {
	
		int a=-1, b;
		b=a++ + ++a + ++a  +a;
 //intial=-1 + 1	+2   +2=4;
// final= -1 + 1    +2   +2=2;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("****************************************");

		a=7 ;
		b=a-- + --a + --a + a;
//intial= 7   +5 	+4  +4=20
//final=  7	  +5    +4  +4=4
		System.out.println("a="+a);
		System.out.println("b="+b);

		a=-21;
		b=--a + --a + --a +a + ++a + a++;
//intial b=-22 + -23 + -24+ -24+-23+-23=139;
// final a=-22+ -23 + -24 + -24+-23+-22= -22;
		System.out.println("a="+a);
		System.out.println("b"+b);

		
		a=-5;
		b=--a +a + ++a +a++ + ++a + a++ +a;
//intial=-6 +-6+-5 +-4+-3+-2+-2=-30
//final=-6 + -6 +-5+-4+-3+-2+-2=-2
		System.out.println("a="+a);
		System.out.println("b="+b);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

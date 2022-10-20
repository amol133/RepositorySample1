package day4.programnonstatic;

public class Nonstaticvariable5 {
    int num=2323;
    float num2=45.45f;
    long num3=2345;
    double res=((num*num2)/num3);
	public static void main(String[] args) {
		
		// we have create instance or object for a class
		Nonstaticvariable5 ref;
		ref=new Nonstaticvariable5();
		//or
		Nonstaticvariable5 ref1=new Nonstaticvariable5();
		//ref1.res=((ref1.num*ref1.num2)/ref1.num3);
		System.out.println("final amount of result = " + ref1.res);
		

	}

}

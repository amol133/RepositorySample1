package day14_4Wrapping_class;

public class UnBoxing_wrapping1 {

	public static void main(String[] args) {
     
		Double dboj=25.453;//implicit boxing operation or auto boxing
		System.out.println("dboj="+dboj);
		
		// un boxing
		double salary=dboj.doubleValue();
		System.out.println("salary="+salary);
		
		System.out.println(dboj==salary);
		
		Boolean b=true;
		boolean b1=b.booleanValue();
		System.out.println("b1="+b1);
		System.out.println(b==b1);
		
		Integer I=24;
		int a=I.intValue();
		System.out.println("I="+I);
		System.out.println("a="+a);			
		System.out.println(I==a);
	}

}

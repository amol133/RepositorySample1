package day11.typeCasting;

public class Primitive_Casting1 {

	public static void main(String[] args) {
		
		int myInt=9;
		double mydouble=myInt;// widening implicit ,when java compiler writes behalf of we-->double mydouble=(double)myInt;
		double d=(double)myInt;// explicit widening
	       System.out.println(myInt);
	       System.out.println(mydouble);
	       System.out.println(d);
	       
	   double salary=23500.4545558899899;
	   int sal=(int)salary;// narrowing,explicit
	   long l=(long)salary;// narrowing explicit
	   float f=(float)salary;//

       System.out.println("actual salary="+salary);
       System.out.println("int salary="+sal);
       System.out.println("long salary="+l);
       System.out.println("float salary="+f);

	}

}

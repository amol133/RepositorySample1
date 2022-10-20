package day11.typeCasting;

public class Primitive_Casting2 {

	public static void main(String[] args) {

		  int salary=45000;
	     /* explicit widening */
		  double sal=(double)salary;
		  float fsal=(float)salary;
	System.out.println("*************explicit widening*******************************8");
          System.out.println("actual salary="+salary);
          System.out.println("double salary="+sal);
          System.out.println("float salary="+fsal);
    System.out.println("int salary="+salary +"\ndouble salary="+sal +"\nfloat salary="+fsal);
    System.out.println("*********implicit widening************************888");
          /*implicit widening   or auto widening   */
         double dsal=salary;
         float salf=salary;
         System.out.println("double salary="+dsal +"\n flaot salary="+salf);

          double salarydb=30000.45d;
          /* explicit narrowing*/
		int sal1=(int)salarydb;
		float sal2=(float)salarydb;
System.out.println("*********************explicit narrowing******************************************");
         System.out.println("double salary="+salarydb+"\n int salary="+sal1+"\n float salary="+sal2);

      // implicit narrowing is not possible 
     //    int sal3=salarydb;
      //   float sal4=salarydb;

		
		
		
		
		
		
		
		
	}

}

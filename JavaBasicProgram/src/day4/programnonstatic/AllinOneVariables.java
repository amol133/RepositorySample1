package day4.programnonstatic;

public class AllinOneVariables {
   static int empId=10;// static global variable
   double salary;   // non static global variable
   
	public static void main(String[] args) {

		int age=25;// local variable we have print one by one local,static,non static global variable
		System.out.println("local variable age = " +age);
		System.out.println("**************************************************");
		
		// static global variable
		System.out.println("static variable empId="+empId);
		
		AllinOneVariables.empId=101;
		//empId=101;
		System.out.println("updated variable empId="+empId);
		System.out.println("*********************************************************");
		
		// non static global variable
		// we have create a instance/object for required class
		AllinOneVariables ref1=new AllinOneVariables();
		System.out.println("default non static variable for salary="+ref1.salary);
		
		ref1.salary=95000;
		System.out.println("updated salary ="+ ref1.salary);
		System.out.println("*************************************************************");

		// create instance/ object for required class
		AllinOneVariables r2=new AllinOneVariables();
		System.out.println("default value of non static gloabal variable for salary=" +r2.salary);
		 r2.salary=25000;
			System.out.println("updated salary for NSGV ="+ r2.salary);
			System.out.println("*******************************************************************");

			// re initialization of static global variable
			AllinOneVariables.empId=1001;
            //empId=1001;
			System.out.println("udtaed value of SGV empId="+empId);

			

		

		
		
		



		

		


	}

}

package day9_4Blocks_Static_Nonstatic;

public class Blocks8 {
	int age;
	double salary;
	
	void print() {
		System.out.println("age="+age);
		System.out.println("salary ="+ salary);
	}

	public static void main(String[] args) {
		System.out.println("main () starts");
        Blocks8 b1=new Blocks8();
      // b1. age=47;
       //b1. salary=95000.65;   // it will this value for b1.print() because it is re initialize
        b1.print();
		System.out.println("main () End");
	}
/* non static blocks or IIB */
	{
		print();
		age= 45;
		salary=95000;
		//print();
	}
}

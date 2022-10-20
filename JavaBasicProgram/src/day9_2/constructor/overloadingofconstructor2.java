package day9_2.constructor;

public class overloadingofconstructor2 {

	int age;
	double salary;
	overloadingofconstructor2(){
		System.out.println(" having no parameter");
	}
	overloadingofconstructor2(int a){
		System.out.println("having a int parameter");
		age=a;
	}
	
	overloadingofconstructor2(double b ){
		System.out.println("having double parameter");
		salary=b;
	}
	overloadingofconstructor2(int a,double b){
		System.out.println("having a parameter int and double");
		age=a;
		salary=b;
	}
	public static void main(String[] args) {
		overloadingofconstructor2 c1=new overloadingofconstructor2();
		System.out.println("after zero parameter="+c1.age);
		System.out.println("after zero parameter="+c1.salary);

		overloadingofconstructor2 c2=new overloadingofconstructor2(234);
		System.out.println("after int parameter="+c2.age);
		System.out.println("after int  parameter="+c2.salary);

		overloadingofconstructor2 c3=new overloadingofconstructor2(34.65);
		System.out.println("after double parameter="+c3.age);
		System.out.println("after double parameter="+c3.salary);

		overloadingofconstructor2 c4=new overloadingofconstructor2(56,909.76);
		System.out.println("after int parameter="+c4.age);
		System.out.println("after double parameter="+c4.age);


		
		
		
		
		
	}

}

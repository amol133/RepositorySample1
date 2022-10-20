package day9_2.constructor;

public class overloadingofconstructor1 {
	int a;

	overloadingofconstructor1(){
		System.out.println(" no parameter constructor");
	}
	overloadingofconstructor1(int a1){
	 	 a=34;
		System.out.println("int parameter constructor");
	}
	overloadingofconstructor1(double b){
		System.out.println("double paramter constructor");
	}
	overloadingofconstructor1(int a,double b ,int c){
		System.out.println(" consturctor contain int double and int parameter");
	}
	
	overloadingofconstructor1(double a,int b,int c){
		System.out.println("constructor have a parameter double int and int");
	}

	
	public static void main(String[] args) {
		overloadingofconstructor1 c1=new overloadingofconstructor1();
		overloadingofconstructor1 c2=new overloadingofconstructor1(34);
		System.out.println(c2.a);
		overloadingofconstructor1 c3=new overloadingofconstructor1(34.43);
		overloadingofconstructor1 c4=new overloadingofconstructor1(23,432.4,24);
		overloadingofconstructor1 c5=new overloadingofconstructor1(23.423,45,54);

	}

}

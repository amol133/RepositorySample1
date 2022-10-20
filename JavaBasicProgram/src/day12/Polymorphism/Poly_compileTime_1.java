package day12.Polymorphism;

public class Poly_compileTime_1 {  // compile time Polymorphism method overloading
	static void sum(int a,int b) {
		int c=a+b;
 	   System.out.println("addition of two number= "+c);
	}
	static void sum(int a,int b,int c) {
		int d=a+b+c;
 	   System.out.println("addition of three number="+d);
	}

	public static void main(String[] args) {
		Poly_compileTime_1.sum(13, 13);
        Poly_compileTime_1.sum(13, 13, 13);
	}

}

/*
 * when method gets to know its implementation at the time of compilation is known as compiler time polymorphism
 * this can we achieved by using static method overloading
 */







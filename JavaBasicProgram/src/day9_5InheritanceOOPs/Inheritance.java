package day9_5InheritanceOOPs;

class A{
	static int a=10;
	int b=20;
	double c=13.54;
}

class B{
	static int x=30;
	int y=40;
	double z=53.34;
}

class C{
	static int p=50;
	int q=60;
	double r=66.45;
}
public class Inheritance {

	public static void main(String[] args) {
		
		// accessing static member
		System.out.println(" class A static variable="+A.a);
		System.out.println("class B static variable= "+B.x);
		System.out.println(" class c static variable= "+C.p);
System.out.println("******************************************************");

		A o1=new A();
		System.out.println(" non static member of classA="+o1.b);
		System.out.println(" non static member of classA="+o1.c);

		System.out.println("*******************************************888");

		B o2=new B();
		System.out.println(" non static member of classA="+o2.y);
		System.out.println(" non static member of classA="+o2.z);

		System.out.println("***************************************************");
        C o3=new C();
		System.out.println(" non static member of classA="+o3.q);
		System.out.println(" non static member of classA="+o3.r);

	}

}

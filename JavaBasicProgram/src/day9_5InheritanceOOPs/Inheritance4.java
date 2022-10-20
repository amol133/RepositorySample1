package day9_5InheritanceOOPs;

class fourwheeler{
	// default constructor
	void wheeles() {
		System.out.println("i am wheels");
	}
}
class car extends fourwheeler{
	// default constructor with super();
	
	void type() {
		System.out.println("i am type");
	}
}
class maruti extends car{
	// default constructor
	void company() {
		System.out.println("i am company");
	}
}
public class Inheritance4 {

	public static void main(String[] args) {
      maruti o1=new maruti();
      o1.wheeles();
      o1.type();
      o1.company();
	}

}

package day9_2.constructor;

class B{
	int i=10;
	B (){
		System.out.println("running a class B constructor");
		i=34;
	}
}

public class constructor8 {

	public static void main(String[] args) {
    B c1=new B();
    System.out.println("class b global variable i ="+c1.i); 
    
    B c2=new B();
    System.out.println("class b global variable i ="+c2 .i); 

	}

}

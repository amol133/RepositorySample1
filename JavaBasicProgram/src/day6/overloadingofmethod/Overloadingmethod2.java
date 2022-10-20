package day6.overloadingofmethod;

public class Overloadingmethod2 {
	
	public void square() {
		System.out.println("no parameter method called");
	}
	public void square(int number) {
	int square=number*number;
	System.out.println("method with integer parameter calling number="+square);
	}
	public void square(float number) {
	float square=number *number;
	System.out.println("method with fioat parameter calling number="+square);
	}
	
	public static void main(String[] args) {
	Overloadingmethod2 r1=new Overloadingmethod2();
	r1.square();
    r1.square(2.5f);
    r1.square(5);
    
    int num=5;
    float x=2.5f;
    
 System.out.println(num);
 System.out.println(x);
	}
}

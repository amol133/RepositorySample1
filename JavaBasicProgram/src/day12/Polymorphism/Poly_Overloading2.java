package day12.Polymorphism;

class shape{
	public void area() {
 	   System.out.println("find area");
	}
	public void area(int r) {
 	   System.out.println("area="+r);
	}
	public void area(double b,double h) {
 	   System.out.println("double  area="+(b*h));
	}
	public void area(int a, int b) {
 	   System.out.println("int area="+(a+b));
	}
}
public class Poly_Overloading2 {
	public static void main(String[] args) {
    shape p1=new shape();
    p1.area();
    p1.area(13);	
	p1.area(13.13,14.14);
	p1.area(55,55);
		
		
		
		
		
	}

}

package day9_7AbstractionClass;

abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{
	    void draw() {
			System.out.println("the shape of rectangle is same on all side");
	    }
}
class circle extends shape{
	  void draw() {
	System.out.println("the shape of the circle is round");
}
}
public class Abstraction4 {

	public static void main(String[] args) {
		shape o1=new Rectangle();
		o1.draw();
		System.out.println("***********************************************");
        shape o2=new circle();
          o2.draw();
	}

}

package day11.typeCasting;
class JD{
	void printMe1(){
 	   System.out.println("i am print me method of jd");
	}
	void disp() {
 	   System.out.println("i am disp method of JD");
	}
}
class Java extends JD{
	void printMe2() {
 	   System.out.println("i am printme2 method of java");
	}
	void disp() {
 	   System.out.println("i am disp method of java");
	}
}
class Android extends Java{
	void printMe3() {
 	   System.out.println("i am printme 3 of android ");
	}
	void disp() {
 	   System.out.println("i am android disp");
	}
}
public class Non_primitive_casting6 {

	public static void main(String[] args) {
      JD c1=new Android();// implicit up casting
      c1.printMe1();
      c1.disp();
System.out.println("******** down casting************************************************");		
	  Java c2=(Java)c1;
	  c2.printMe1();
	  c2.printMe2();
	  c2.disp();
		
 System.out.println("*******************down casting********************************88");	
	 Android c3=(Android)c1;	
		c3.printMe1();
		c3.printMe2();
		c3.printMe3();
		c3.disp();
		
		
		
		
		
		
		
	}

}

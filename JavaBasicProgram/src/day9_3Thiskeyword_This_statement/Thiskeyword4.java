package day9_3Thiskeyword_This_statement;

public class Thiskeyword4 {
  int age;
   void call () {
	   System.out.println("i am call method");
}
      void m (int age) {
  		System.out.println("local age ="+age);
		System.out.println("global age ="+this.age);
		//call (); // or 
		this.call();
		System.out.println("this keyword value ="+this);// print same as object hence called as object of class
   }
	public static void main(String[] args) {

		Thiskeyword4 c1= new Thiskeyword4();
		c1.m(25);
 
		System.out.println("object c1 value is ="+c1);// its same as this keyword

		
		
	}

}

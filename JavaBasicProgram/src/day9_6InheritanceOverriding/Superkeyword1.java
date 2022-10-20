package day9_6InheritanceOverriding;
class Animal2{
	String color="white of red";
}
class Dog2 extends Animal2{
	String color= "black";
	   void printColor() {
	    	  System.out.println("Dog color is ="+color);//print a color of dog class 
	    	  System.out.println("Animal color is ="+super.color);// print a color of animal class
	   }
}

public class Superkeyword1 {

	public static void main(String[] args) {
		Dog2 o1=new Dog2();
		o1.printColor();
		
		String s1="12 servers";
  	  System.out.println(s1.matches(".+[\\s]servers)"));
	  System.out.println(s1.indexOf("amol"));
	  String[]  str=s1.split("Amol");


	}

}

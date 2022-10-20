 package day9_5InheritanceOOPs;

 class fruit1{
	 int fruitage;
	 fruit1(){
			System.out.println("i am fruit constructor");
			fruitage=10;
	 }
	 void taste() {
			System.out.println("taste of the fruit is sweet");
	 }
 }
 // child class
 class orange extends fruit1{
	 int fruitage;
	 orange(){
			System.out.println("i am orange constructor");
			fruitage=13;
	 }
	 public void taste() {
			System.out.println("orange are sweet");
	 }
	 public void shape() {
			System.out.println("shape of the orange is round");
			System.out.println("fruiteage of the child class="+fruitage);
			System.out.println("fruitage of the super class ="+super.fruitage);
           taste();// calling child method
           super.taste();//calling parent method
	 }
 }
public class Inheritance8 {

	public static void main(String[] args) {
		orange o1=new orange();
		o1.shape();

	}

}

/** Overriding : when parent class and child class both are having same member then that will be known as overriding
 *  
 * super:is a keyword or instance of super class 
 *                 use to refer super class non static member
 *                 mainly used when subclass and super class having same common non static member
 * 
 *  * what is this keyword?
 * why to use this keyword?
 * where can we use this keyword?
 * 
 * what is super keyword?
 * why to use super keyword?
 * where can we use super keyword?
 * 
 * what is super()?
 * why to use super()?
 * where can we use super()?
 * 
 * what is this()?
 * why to use this()?
 * where can we use this()?
 * 
 * this vs super
 * this() vs super() 
 */
 

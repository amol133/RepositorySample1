package day9_2.constructor;

public class constructor1 {
	 int age=23;
	 constructor1(){
		 // empty body --> default constructor --> written by java compiler
	 }
	     void display () {
	    	 System.out.println("hi im display method ");
	     }
	public static void main(String[] args) {
		constructor1 c1=new constructor1();
		System.out.println(c1.age);
       c1.display();
	}

}
 /** In every class where we have created object there was a constructor.
  * 
     constructor
     1.its similar to method 
     2.but its name should be same as class name 
     3.but it will not have any return type and its wont return any value to jvm.
     4.we can't call / execute constructor based our requirement ,it will be called /executed
       whenever class object/ instance are created
       
   *    
    constructor used to initialization non static member of the class
    types
         1.default constructor --->when class doesnt have any type of constructor then java 
                                   compiler write a constructor which is known as default constructor
                               --- default constructor doesnt have any parameter and its body will be empty
                               
         2.user define constructor-->                
                               when a programmer write a constructor then that will known as user define constructor.
                               
             
  */

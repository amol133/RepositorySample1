package day11.typeCasting;
class Member{
	long phone;
	void chat() {
 	   System.out.println("chatting in whats group with phone="+phone);
	}
}
class Admin extends Member{
	void addNumber() {
 	   System.out.println("adding new number in groups");
	}
}

public class Non_primitive_casting5 {

	public static void main(String[] args) {
		Member c1=new Admin();
		c1.phone = 9304444;
		c1.chat();
 	   System.out.println("******after down casting********************************* ");
		Admin c2=(Admin)c1;
		c2.addNumber();
		c2.chat();
 	   System.out.println(c2.phone);
		
		//Admin c3=new Member(); direct down casting is not possible we have to first make up casting then we 
 	                            // convert into down casting
 	   
 	   
 	   
/*
 *  child class object is referred by any of its parent class  known as up casting
 *  
 *  parent class object referred by any of the child class is known as down casting
 *   direct down casting is not possible
 *  
 *  child c1=new parent()//  down casting this is not possible
 *  
 *  parent c2= new child();
 *  child c3=(child)c2;   this the way to possible the down casting
 *           
 */
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
 	   
	}

}

package day11.typeCasting;
class Pune{                   // up casting 
	void Deccan() {
		System.out.println("your in deccan");
	}
}
class mumbai extends Pune {
       void kurla() {
   		System.out.println("your in kurla");
       }
}

public class Non_primitive_casting2 extends mumbai{
	void mycity() {
		System.out.println("you are in my city");
	}

	public static void main(String[] args) {
		Non_primitive_casting2 c1=new Non_primitive_casting2();//normal
		c1.mycity();
		c1.kurla();
		c1.Deccan();
		
		mumbai c2= new Non_primitive_casting2();
		c2.kurla();// implicit up casting
		mumbai c3=c1;
	    Pune c4=new Non_primitive_casting2();
	    c3.Deccan();// implicit up casting
		Pune c5=c1;// up casting
	    
	    mumbai c6=(mumbai) new Non_primitive_casting2();// explicit up casting
	    mumbai c7=(mumbai)c1;
	    Pune c8=(Pune)new Non_primitive_casting2();
	    Pune c9=(Pune)c1;// explicit up casting
	    
	    Pune c11=new mumbai();
	    Pune c12=(Pune) new mumbai();// explicit up casting
	    

	}

}

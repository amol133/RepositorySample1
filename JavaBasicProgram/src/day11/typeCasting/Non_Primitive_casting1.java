package day11.typeCasting;
class parent1{
	void myhome() {
		System.out.println("parent home");
	}
}
class child1 extends parent1{
	void mycar() {
		System.out.println("child car");
	}
}

public class Non_Primitive_casting1 {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.mycar();
		c1.myhome();
       parent1 c2=new parent1();
		c2.myhome();
		System.out.println("**********up casting***********************");
		child1 c7=new child1();
		c7.mycar();
		c7.myhome();
		parent1 c3=c7; // implicit up or auto up casting---->parent1 c3=c1=new child1();		
		c3.myhome();
	
		parent1 c4=new child1();// implicit up casting
		parent1 c5=(parent1)new child1();// explicit up casting
		parent1 c6=(parent1)c7;// explicit up casting
		
		
		
		
		
		
	}

}

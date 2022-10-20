package day9_5InheritanceOOPs;

// parent class 
class fruitA{
	int fruitAge;
	fruitA(){
            System.out.println("i am fruitA constructor ");
            fruitAge=11;
	}
	public void taste() {
		System.out.println("taste of the fruit is sweet");
	}
}
//child class
class mango extends fruitA{
	int fruitAge;
	mango(){
		System.out.println("i am mango constructor");
      fruitAge=12;
	}
	public void taste() {
		System.out.println("mango are tart in taste");
		//super.taste();
	}
	public void shape() {
		System.out.println("mango is round");
        
	}
}


public class Inheritance9 {

	public static void main(String[] args) {
   mango o1=new mango();
   o1.taste();
   o1.shape();
   
   System.out.println("fruitage="+o1.fruitAge);
   System.out.println("****************************************************************");
     fruitA o2=new fruitA();
     o2.taste();
     System.out.println("super class fruitAge="+o2.fruitAge);

   
	}

}

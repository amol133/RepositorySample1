package day9_5InheritanceOOPs;

// parent class
class fruit{
	fruit(){
		System.out.println("fruit class constructor");
	}
	public void taste() {
		System.out.println("fruit are sweet");
	}
}
// child class of fruits
class apple extends fruit{
	
	apple(){
		// super() ;// java compiler will write default super()
		System.out.println("apple class constructor");
	}
	public void shape() {
		System.out.println("shape are round");
	
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
   apple o1=new apple();
   o1.taste();       //call method parent class 
   o1.shape();      // call method child class
		
		
	}

}

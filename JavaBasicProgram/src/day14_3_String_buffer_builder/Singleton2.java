package day14_3_String_buffer_builder;
class Demo{
	/**
	 * 1.constructor should be private
	 * create static ref variable of the class
	 * create static method  which return current class object
	 */
	int age =24;
	private Demo(){
		
	}
	public static Demo single=new Demo();// creating static ref variable of the class 
	
	public static Demo getSingleton() {// creating static method
		return single;
	}
	public void display(int num) {
		age=num;
	}
	
}

public class Singleton2 {

	public static void main(String[] args) {
         //Demo d1=new Demo();
		
		Demo x=Demo.getSingleton();
		System.out.println(x.age);
		x.display(34);
		System.out.println(x.age);
		
		Demo y=Demo.getSingleton();
		System.out.println(y.age);
		y.display(44);
		System.out.println(y.age);
		System.out.println(x.age);
		
		
		
		
		
	}

}

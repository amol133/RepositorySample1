package day9_5InheritanceOOPs;
 class A2{
	 void msg() {
			System.out.println("hello everyone");
	 }
 }
class B2{
	void msg() {
		System.out.println("welcome to java");
	}
}
class Inheritance6 extends A2,B2{
	           Inheritance6(){
	        	   // super(); confusion
	        	   
	           }

	public static void main(String[] args) {
        Inheritance6 o1=new Inheritance6();
        o1.msg();
	}

}

/** 
 * is java support multiple inheritance or not?
 * why java doesnt support multiple inheritance using classes?

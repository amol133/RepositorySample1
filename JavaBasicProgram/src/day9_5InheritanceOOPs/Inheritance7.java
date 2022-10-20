package day9_5InheritanceOOPs;
// parent class /base class /super class
class Grandfather{
	Grandfather(){
		System.out.println("i am grandfather constructor");
	}
	void myHome() {
		System.out.println("i am myhome of class grandfather");
	}
}
// child class
class father extends Grandfather{
	father(double d){
		System.out.println("i am father constructor havind double parameter");
	}
	void mycar() {
		System.out.println("i am mycar of class father");
	}
}
// child2 class
class child extends father{
	child(int a){
		super(13.13);
		System.out.println("i am child constructor");
	}
	void mybike() {
		System.out.println("i am mybike of class child");
	}
}
public class Inheritance7 {

	public static void main(String[] args) {
		child o1=new child(23);
		o1.myHome();
		o1.mycar();
		o1.mybike();

	}

}

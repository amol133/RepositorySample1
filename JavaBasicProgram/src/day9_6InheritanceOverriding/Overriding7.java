package day9_6InheritanceOverriding;
// final method cannot be overridden
class Forest{
	// cannot be overridden
	final void show() {
		System.out.println("i am show() method of forest class");
	}
}

class Tree extends Forest{
	// produce error because final method can not be overridden
	void show() {
		System.out.println("i am show() method of class tree");
	}
}
//Driver class
public class Overriding7 {

	public static void main(String[] args) {

	}

}

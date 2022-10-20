package day9_7AbstractionClass;
abstract class RBIBank1{
	final public abstract double rateOfIntrestOfHomeLoan();
	// abstract mean must be overridden
	// final means can't be override
}

class SBI1 extends RBIBank1{
	public double rateOfIntrestOfHomeLoan() {
		return 5.55;
	}
}
public class Abstraction6 {

	public static void main(String[] args) {

	}

}

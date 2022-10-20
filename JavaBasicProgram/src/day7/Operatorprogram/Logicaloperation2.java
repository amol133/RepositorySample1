package day7.Operatorprogram;

public class Logicaloperation2 {

	public static void main(String[] args) {
 
		// variable definition and initialization 
		int num1=5,num2=10;
		boolean res1,res2;
		res1=(num1 != num2);
		res2=(num1 < num2);
		System.out.println("result ="+res1);// t
		System.out.println("result ="+ res2);//t
		
		// Logical AND
		System.out.println("bool1 && bool2="+(res1 && res2));
		
		//logical OR
		System.out.println("bool1 || bool2="+(res1 || res2));

		// logical NOT
		System.out.println("!bool1 && bool2="+!(res1 && res2));

		
	/**	
		LHS & RHS result should be in boolean format
		&& --> and

		LHS && RHS ---> if both side are having result as true dn its will retur true else false
		true && true --> true
		false && true --> false
		true && false --> false

		|| --> or

		LHS || RHS --> if any one side return true dn the result will be true else false
		true || true --> true
		false || true --> true
		true || false --> true
		false || false ---> false

		! --> not
*/
		
		
		
		
		
		
		
		
		
	}

}

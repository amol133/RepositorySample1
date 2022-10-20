package day5.programmethod;

public class SyntaxDeclarationOfMethod {
{
// this class contain method syntax example
	
	// public Class MethodSyntax 
	/**
	 * static void testMyCode(){
	 * 
	 * Method type        =static
	 * Access Modifier    =default
	 * non-access modifier=static
	 * return type        =void
	 * method name        =testMyCode
	 * argument/parameter =NA
	 * return value       =NA
	 *
	 * Return ;// its completely optional in void,if we dont write it java compiler write on behalf
	 */
		
	/**private double getSalary() {
	 * return 15.356;
	 * 
	 * Method type        =non static
	 * Access Modifier    =private
	 * non-access modifier=non static
	 * return type        =double
	 * method name        =getSalary
	 * argument/parameter =NA
	 * return value       =15.356
	 */
	/** protected int empId() {
		int x=101;
		return x;
		Method Name =non static
		access modifier =protected
		non access modifier=non static
		return type =int
		method name=empId
		Argument/parameter=NA
		return value=100
		*/
	
	/**
	 * public void deptNum(int num) {
	 * 
	static boolean deptNum3(int num) {
		boolean res=(num==15);
		return res;
	 */
		
      /**
       * static void deptNum2(String num)
       * method type=static
       * access modifier=default
       * non access modifier=static
       * return type= void
       * method name=deptnum2
       * argument/parameter=string num
       * return value=NA   
       */
	
	/**static boolean deptNum3(int num) {
		boolean res=(num==15);
		return res;
	* Method type        =static
	 * Access Modifier    =default
	 * non-access modifier= static
	 * return type        =boolean
	 * method name        =deptnum3
	 * argument/parameter =int num3
	 * return value       =15
   /**
    * private char deptNum4(boolean b1) {
		return 'A';
     * Method type        =non static
	 * Access Modifier    =private
	 * non-access modifier= non static
	 * return type        =char
	 * method name        =deptnum4
	 * argument/parameter =boolean b1
	 * return value       =A
    */
	
	/** 
	 * public static void main(String[] args)
	 * 
	 * * Method type      =static
	 * Access Modifier    =private
	 * non-access modifier=static
	 * return type        =void
	 * method name        =main
	 * argument/parameter =(string[] args)
	 * return value       =NA
	 */
/**	Method or function both are same
	- it contains set of repetitive statements or reusable statements
	- it can be two types
			- static
			- non static
	- Syntax:
				modifier returntype methodname(args)
				{	
					.........;//statement1
					.........;//statement2
					.........;//statement3
					return value;
				}
		where: 
				modifier = accessmodifier + nonaccessmodifier;
					- accessmodifers --> define visibility of the class members
							* private
							* default
							* protected
							* public
					- non-accessmodifers ---> 
							* static/non-static
							* abstract 
							* native & etc
				returntype: define type of value method should return
							* datatype - primitive or non-primitive datatype
							* void (return value statement is optional) --> won't return any value to JVM
				methodname: valid identifier
				args: argument/parameter ---> optional ----> primitive or non-primitive datatype
				return value---> based on return type, value should be return from the method
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}

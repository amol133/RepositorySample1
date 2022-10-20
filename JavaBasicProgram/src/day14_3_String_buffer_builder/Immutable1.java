package day14_3_String_buffer_builder;

/**
 * Immutable class:its value can't be changed ,if we change new object will be created
 * 
 *1.class and data variable should be declared as final
 *2.constructor should be parameterized ,to initialize final data variable
 *3.use only getter method to get final variables value 
 *
 */

final public class Immutable1 {
	final String name;
	final int salary;
	Immutable1(String s,int sal){
		name=s;
		salary=sal;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		Immutable1 s1=new Immutable1("amol",96500);
		System.out.println(s1.getName());
		System.out.println(s1.getSalary());
		
		// change its data variable value create new object
		Immutable1 s2=new Immutable1("pawar",98500);
		System.out.println(s2.getName());
		System.out.println(s2.getSalary());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

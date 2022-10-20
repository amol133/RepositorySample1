package day16_0Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist4 {

	public static void main(String[] args) {

//		ArrayList<Integer> l1=new ArrayList<Integer>();// Generic
//		l1.add(12);
//		ArrayList<Boolean> l2=new ArrayList<Boolean>();// Generic
//		l2.add(true);
//		ArrayList<Character> l3=new ArrayList<Character>();
//		l3.add('a');
		
	// using generic way
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Gaurav");
		System.out.println("an intial list of element="+a1);
		
		// removing specific element from arraylist
		System.out.println("removing vijay from collection=" +a1.remove("Vijay"));
		System.out.println("After invoking remove(index)method="+a1);
		// removing element on the basis of specific position
		System.out.println("remove index 0 from collection ="+a1.remove(0));
		System.out.println("after invoking remove (index) method="+a1);
		
		System.out.println("****************************************************");
		// creating another arraylist
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Ravi");
		a2.add("hanumat");
		
		//Adding new element to arraylist
		a1.addAll(a2);
		System.out.println("updated list="+a1);
		
		// removing all the new element from arraylist
		a1.removeAll(a2);
		System.out.println("After invoking removeAll() method="+a1);
		
		// removing element on the basis of specified condition 
		if(a1.contains("Ajay")) {
			a1.remove("Ajay");
		}
		
		// or
		a1.removeIf(str ->str.contains("Ajay"));// here we are using lambda expression
		System.out.println("after invoking removeIf() method ="+a1);
		
		// removing all the element available in the list
		a1.clear();
		System.out.println("After invoking clar() method="+a1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

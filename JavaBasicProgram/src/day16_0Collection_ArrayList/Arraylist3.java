package day16_0Collection_ArrayList;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		System.out.println("Intial list of element="+a);
		System.out.println("list of element status="+a.isEmpty());

		// adding element to the end of the list
		a.add("Ravi");
		a.add("Vijay");
		a.add("Ajay");
		
		System.out.println("after invoking add() method="+a);
		// adding an element at the specific position
		a.add(1, "Gaurav");
		System.out.println("after invoking add(int index,E element) method="+a);
		
		ArrayList a2=new ArrayList();
		a2.add("sonoo");
		a2.add("Hanumat");
		
		// Adding the second list of element to the first list
		System.out.println("list a2 element="+a2);
		System.out.println("a1 element before adding a2="+a);
		
		a.add(a2);
		System.out.println("list of element after adding list a2="+a);
		
		ArrayList a3=new ArrayList();
		a3.add("john");
		a3.add("Rahul");
		System.out.println("element of a2="+a2);
		System.out.println("element of a3="+a3);
		
// adding second list element to the first list at specific position
		
		a2.add(a3);
		System.out.println("after adding a3 into a2="+a2);
		
		
	}

}

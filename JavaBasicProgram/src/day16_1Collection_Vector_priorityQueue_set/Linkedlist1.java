package day16_1Collection_Vector_priorityQueue_set;

import java.util.LinkedList;

public class Linkedlist1 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		   System.out.println("Intial list of element ="+l);
		   l.add("Rvi");
		   l.add("Vijay");
		   l.add("Ajay");
		   
		   System.out.println("After invoking add(E e) method="+l);
		// adding an element at the specific position
		   l.add(1,"Gaurav");
		   System.out.println("After invoking add(int index ,E element) method="+l);
		   LinkedList<String> l1=new LinkedList<String>();
		l1.add("sonoo");
		l1.add("hanumat");
		
		//Adding second list element to the first list
		l.addAll(l1);
		   System.out.println("after invoking addAll(collection? extends E > c) method="+l);
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("john");
		l2.add("Rahul");
		
		// adding second list element to the first list at specific position
		l.addAll(1,l2);
		   System.out.println("after invoking addAll(int index,collection ? extends E > c)method="+l);
		
		// adding an element at first position 
		   l.addFirst("Lokesh");
		   System.out.println("after invoking at first position="+l);
		   
		   // adding an element at last position
		   
		   l.addLast("Harsh");
		   System.out.println("after invoking at last="+l);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

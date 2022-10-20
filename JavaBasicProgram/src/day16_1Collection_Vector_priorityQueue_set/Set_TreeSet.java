package day16_1Collection_Vector_priorityQueue_set;

import java.util.Iterator;
import java.util.TreeSet;

public class Set_TreeSet {

	public static void main(String[] args) {
// creating and adding elements
		TreeSet<String> t=new TreeSet<String>();
		t.add("Ravi");
		t.add("Vijay");
		t.add("Ravi");
		t.add("Ajay");
		 System.out.println("treeset element="+t);
		// traversing element
		 Iterator<String> i=t.iterator();
		 while(i.hasNext()) {
			   System.out.println(i.next());
		 }
		   System.out.println("Traversing element through iterator");
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(24);
		t1.add(66);
		t1.add(12);
		t1.add(15);
		   System.out.println("element of treeset="+t1);
		   System.out.println("remove first element value="+t1.pollFirst());
		   System.out.println("after pollfirst() element are="+t1);
		   System.out.println("last element value="+t1.pollLast());
		   System.out.println("after polllast() element are="+t1);
		   
		   TreeSet<String> t2=new TreeSet<String>();
		   t2.add("A");
		   t2.add("B");
		   t2.add("C");
		   t2.add("D");
		   t2.add("E");
		   
		   System.out.println("element of t2="+t2);
		   
		   System.out.println("reverse set="+t2.descendingSet());// high to low
		   System.out.println("Head set="+t2.headSet("C"));// a,b
		   System.out.println("head set="+t2.headSet("C",true));// a,b,c

		   System.out.println("subset="+t2.subSet("A", "E"));//abcd -e exclude
		   System.out.println("sunset="+t2.subSet("A", false, "E" ,true));
		   
		   System.out.println("tailset="+t2.tailSet("C"));//cde
		   System.out.println("tailset="+t2.tailSet("C",false));
		   
		   
		   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

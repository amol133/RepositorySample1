package day16_1Collection_Vector_priorityQueue_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_HashSet1 {

	public static void main(String[] args) {
// crating hashset and adding element
		Set<String> s=new HashSet<String>();
		// in set if we try to add duplicate element then then it will neglect that element
		// instead of throwing error
		s.add("Ravi");
		s.add("Vijay");
		s.add("Ravi");//it wont get added in set 
		s.add("Ajay");
		   System.out.println("after invoking remove(object) method="+s);
		   System.out.println("set size="+s.size());
		
	// traversing elements
		   Iterator i=s.iterator();
		while(i.hasNext()) {
			   System.out.println(i.next());
		}
		
		   System.out.println("removing ravi from set="+s.remove("Ravi"));	
		   System.out.println("after invoking remove(object)method="+s);
		   
		   HashSet<String> s1=new HashSet<String>();
		   s1.add("Ajay");
		   s1.add("Gaurav");
		   System.out.println("element of s1="+s1);
		   s.addAll(s1);
		   System.out.println("udated element="+s);
		   
		// remove all new element from hashset
		   
		s.removeAll(s1);
		   System.out.println("after invoking removeall() method="+s);
		
// removing element on the basis of specific condition
		   s.removeIf(str ->str.contains("Vijay"));   
		   System.out.println("after invoking removeIf() method="+s);
		   
// remove all the element available in the set
		   s.clear();
		   System.out.println(s);
		   
		
		   
		   
		
	}

}

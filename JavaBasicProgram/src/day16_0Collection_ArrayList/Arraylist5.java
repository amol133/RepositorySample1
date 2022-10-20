package day16_0Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist5 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println("is arraylist empty="+a1.isEmpty());
		
		a1.add("Ravi");
		a1.add("Vijay");
		a1.add("Ajay");
		a1.add("Hanumat");
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("Ravi");
		a2.add("Hanumat");
		
		a2.add(new String("pune"));
        System.out.println("a1 list element="+a1);
	    System.out.println("a2 list of element="+a2);
		
	    a1.retainAll(a2);// list similar name in both object
	    System.out.println("a1 list after retainAll()="+a1);
	    System.out.println("iterating the element after retaining the element of a2");
	    
	    Iterator itr=a1.iterator();
	    while(itr.hasNext()) {
		    System.out.println(itr.next());
	    }
	    
	    List l1=new ArrayList();
	    l1.add("pune");
	    l1.add("pune");
	    l1.add(123);
	    l1.add("pune");
	    l1.add(null);
	    System.out.println(l1);
	    
	    
	    
	    
	    
	    
	    
		
	}

}

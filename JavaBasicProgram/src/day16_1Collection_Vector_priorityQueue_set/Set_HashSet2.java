package day16_1Collection_Vector_priorityQueue_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Set_HashSet2 {

	public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Ravi");
        a.add("Vijay");
        a.add("Ajay");
        a.add("Ravi");
 	   System.out.println("list of element="+a);
		
		
	HashSet<String> s=new HashSet<String>(a);
	   System.out.println("intial set element="+ s);
		s.add("Gaurav");
		   System.out.println("set element ="+s);
		
	Iterator<String> i=s.iterator();
	while(i.hasNext()) {
		   System.out.println(i.next());
	}
	   System.out.println("*************************************");
		
		s.removeIf(st -> st.contains("Ravi"));
		   System.out.println("set element="+s);
		
		
		
		
		
		
		
		
		
		
		
	}

}

package day16_0Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylist7 {

	public static void main(String[] args) {

     //Generic : with the help of generic we can force collection to store similar type of data
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(10);
		list.add(2);
		list.add(15);
		list.add(18);
	    System.out.println("size="+list.size());
	    System.out.println("Element of collection="+list);
		
		Collections.sort(list);
        System.out.println("after sorting element of collection= "+list);
		
		Collections.reverse(list);
		System.out.println("reversing sorted element of collection="+list);		
		
		Arraylist7 a=new Arraylist7();
		a.display();
		
		List<Arraylist7> l=new ArrayList<Arraylist7>();
		l.add(new Arraylist7());
		l.add(a);
		
		l.get(0).display();
		l.get(1).display();
		
		
		
		
		
		
		
	}
void display() {
	System.out.println("hi i am display method ");
}
}

package day16_0Collection_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
      ArrayList list =new ArrayList();
		list.add("mango");
		list.add("Apple");
		list.add("Banana");
		list.add("123");
		
		// printing the arraylist object
		System.out.println("size of list="+list.size());
		System.out.println("element of list="+list);
		
	
		// accessing particular element
		System.out.println(list.get(0));
		
		System.out.println("traversing list through for loop= ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("traversing list through for each loop=");
		for(Object fruit:list) {
			System.out.println(fruit);
		}
		
		// changing the element
		list.set(1, "Dates");
		System.out.println("size of list="+list.size());
		System.out.println("element of list="+list);
		
		// sorting list
		Collections.sort(list);//by default it sort the passed collection element in ascending order and store it in the same collection
		System.out.println("size of list="+list.size());
		System.out.println("element of list="+list);
		
		System.out.println("traversing list through forEach() method=");
		//the forEach() method is a new feature,introduced in java 8.
		list.forEach(a ->{   // here we are using lambda expression
			System.out.println(a);
		});
		
		System.out.println("traversing list through iterator interface");
		   Iterator i=list.iterator();
   /**
    * list element:[ Banana ,Dates ,Grapes, Mango]
    * Iterator is a Interface in collection ,which is used to iterate collection elements
    * Iterator interface has following method to iterate collection elements
    * 1.hasNext() ---> boolean -->true next Element is present ,false no next element is present
    * 2.next() ---> Object ---> it will return next element from collection
    * 3.remove()-->void ------>element deletion
    * 
    * Iterator object can be use to iterate a collection only once ,for 2nd iteration create new Iterator object	   
    */
		
		//	System.out.println(i.hasNext());
	    //  System.out.println(i.next());//123
		//	System.out.println(i.next());//dated
		//	System.out.println(i.next());//grapes
		//	System.out.println(i.next());//mango
		//	System.out.println(i.next());// no such element exception 
			
			while (i.hasNext()) {
				System.out.println(i.next());
			}
			System.out.println(i.hasNext());
		
			System.out.println("**********with used iterator object***********************");	
			   while(i.hasNext()) {
					System.out.println(i.next());
			   }
		System.out.println("*********with new iterator object ********************");
	          Iterator i1= list.iterator();
	          while(i1.hasNext()) {
	      		System.out.println(i1.next());
	          }
			
			
			
	}

}

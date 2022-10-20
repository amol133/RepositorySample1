package day16_0Collection_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {

		List list =new ArrayList();// creating arraylist - default size is 10
		
		list.add("Mango");// auto up casting from String to object class object
		list.add(1234);//  first boxing for int to Integer class object --> upcasting to object class
		
		list.add("Banana");// auto - up casting from string to object class object
		list.add(null);
		list.add('C');// first boxing char to Character class object---> upcasting to object class 
		list.add(15.45);//first boxing double to Double class object--> upcasting to object class
		list.add(true);// first boxing boolean to Boolean class object --> up casting to object class
		
		list.add(new Arraylist1());// Arraylist1 class object will be up casted to object class object
		list.add("Banana");// duplicate
		
		// printing the array list object
		System.out.println("size of list ="+list.size());
		System.out.println("Element of list ="+list);// to string override in collection
		System.out.println("Traversing list through for loop=");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Traversing list through for each loop=");
		for(Object fruit:list) {
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println("returning element ="+list.get(1));// it will return the second element,because index start from 0
		
		// from 0
		// changing /update existing object
		
		list.set(1, "dates");
		System.out.println("size of list ="+list.size());
		System.out.println("element of list="+list);
		
		
		
		
		
		
		
		
		
	}

}

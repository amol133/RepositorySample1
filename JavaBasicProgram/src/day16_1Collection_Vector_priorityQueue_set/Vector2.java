package day16_1Collection_Vector_priorityQueue_set;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {

		//create vector
		Vector<String> v=new Vector<String>();
		// Adding element using add() method of list
		v.add("Tiger");
		v.add("Lion");
		v.add("Dog");
		v.add("Elephant");
		
		// adding elements using addElement() method of Vector 
		v.addElement("Rat");
		v.addElement("Cat");
		v.addElement("Deer");
		   System.out.println("Element are="+v);
		 for(String x:v) {
			   System.out.println(x);
		 }
		 
/**
 * Synchronized --> Thread safe --> slow
 * default capacity --> 10 --> increase capacity by 100%
 * vector comes from jdk 1.0 --> also known as legacy class
 * 
 * 		 
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

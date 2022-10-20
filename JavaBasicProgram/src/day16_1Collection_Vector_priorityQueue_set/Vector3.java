package day16_1Collection_Vector_priorityQueue_set;

import java.util.Vector;

public class Vector3 {

	public static void main(String[] args) {
		// create a vector 
		Vector<String> v=new Vector<String>();
		   System.out.println("elements are ="+v.capacity());
           // adding element using add() method of list
		   v.add("lion");
		   v.add("tiger");
		   v.add("Dog");
		   v.add("Elephant");
		   v.add("lion");
		   v.add("Dog");
		   v.add("Elephant");
		   v.add("Cat");
		   System.out.println("element are="+v);
		   v.addElement("mat");
		   System.out.println("Element capacity="+v.capacity());
		   System.out.println("element are="+v);
		   System.out.println("size of vector="+v.size());
		
		for(String x:v) {
			   System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

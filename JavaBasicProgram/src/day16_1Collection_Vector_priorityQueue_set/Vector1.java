package day16_1Collection_Vector_priorityQueue_set;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
       Vector<String> vcTr=new Vector<String>();	
       System.out.println("Default ,Vector capacity="+vcTr.capacity());// default 10
	   System.out.println("vector Size="+vcTr.size());//0
	   vcTr.setSize(2);
	   System.out.println("Vector size="+vcTr.size());
	   System.out.println("vector element="+vcTr);
		vcTr.addElement("Sunday");
		vcTr.addElement("Monday");
		   System.out.println("after addition ,Vector elements="+vcTr);
		   System.out.println("after add,vector size="+vcTr.size());
		   vcTr.addElement("wenesday");
		   System.out.println("After addElement ,vector size="+vcTr.size());
		   System.out.println("vector capacity="+vcTr.capacity());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package day17.Maps_property;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		
		Map m1=new HashMap();
		m1.put("key1", "admin");//upcasting
		m1.put("key2", "admin");
		m1.put(null, "admin23");
		System.out.println("map element are="+m1);
		System.out.println("map element count="+m1.size());
		
		Map m2=new HashMap();
		m2.put("A1", 123);
		m2.put("A2", 456);
		m2.put("A3", 789);
		m2.put("key2", "admin");
		System.out.println("map element are="+m2);
		System.out.println("map element count="+m2.size());

		m1.putAll(m2);
		System.out.println("map element of m1="+m1);
		System.out.println("count of element of map ="+m1.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

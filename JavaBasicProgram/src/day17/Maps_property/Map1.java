package day17.Maps_property;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {

		Map m=new HashMap();
		m.put("key1", "admin");//upcasting
		m.put("key2", "admin");//upcasting
		m.put(null, "admin123");//up casting
		System.out.println("map element are ="+m);
		System.out.println("map element count="+m.size());
		
		m.put("key2", "manager");
		m.put("456", "manager");
		m.put(null, 1234);//boxing then upcasting
		System.out.println("map element are="+m);
		System.out.println("map element count="+m.size());
		System.out.println("get the key value="+m.get("key2"));
		System.out.println("key set of map="+m.keySet());
		System.out.println("value set of map="+m.values());
		
		
		
		

/**
 * to add any element in map we need use 'put'(key , value)
 * toString() is overrided here as well
 * to get only keys from map use getKeys()
 * to get only values from map use values()
 * if you want get a particular key value then use get(key)
 * 		
 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

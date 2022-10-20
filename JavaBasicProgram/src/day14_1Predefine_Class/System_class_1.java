package day14_1Predefine_Class;

public class System_class_1 {

	public static void main(String[] args) {
		// system class have prefined method or function
		
		// checking specific property
		System.out.println("system user Dir="+System.getProperty("user.home"));
		System.out.println("current working Dir="+System.getProperty("user.dir"));

		// clearing the property
         System.clearProperty("user.home");
 		System.out.println(System.getProperty("user.home"));
	// setting a specific property	
		System.setProperty("user.country"," India");
		System.out.println("new set property="+System.getProperty("user.country"));
		
	// checking property other than system property
	// illustrating getProperty(String key,	String def)
		System.out.println("other than system property="+System.getProperty("user.password","none of your business"));
		
		System.out.println("difference between the time and midnight,january 1,1970 UTC is ="
				+System.currentTimeMillis());

		System.out.println("current time in="+"nano.sec="+System.nanoTime());
		
		System.out.println(System.getProperty("java.home"));

		
				

	}

}

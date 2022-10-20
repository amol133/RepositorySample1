package day9_8InterfaceAbstraction;
interface I1{
	// variable--> by default --->public static final
	//method-->by default--->public abstract
	// no complete method /no non abstract method we can write only abstract method allow
	//no constructor
}
// interface declaration:by first user

interface Drawable{
	int salary=25000;//by default public static final int salary=25000;
	void draw();// by public abstract void draw();
	
}
// Implementation : by second user
class Reactangle implements Drawable{
	public void draw() {
		System.out.println("drawing Rectangle");
	}
}
class circle implements Drawable{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("interface variable="+Drawable.salary);
            circle o1=new circle();
            o1.draw();
  System.out.println("********************************************************8888");
           Reactangle o2=new Reactangle();
            o2.draw();
   System.out.println("***************************************************");
           Drawable o3=new circle();// circle class object and interface drawable reference 
           o3.draw();
           System.out.println("interface variable="+Drawable.salary);
  }

}

/** Interface--> used to achieved abstraction in java
 *                ---> as we know java doesn't provide multiple inheritance using classes to over come this
 *                    java provide interface to support this
 *                --->its 100% abstract ,no non abstract method
 *                --->inside interface will have (no constructor )
 *                        -variable --> default -->public static final variable
 *                        -method ---> by default -->public abstract     
 *   
 *        ---> whenever sub class inherit the interface they use implements keyword
 *        
 *              class childclass implements interfacename{
 *              }
 *   we are not allow to create instance of abstract class similarly we are not allow to create  
 *       instance or object of interface(because incomplete )
 *       
 *  -->when a interface is getting inherited by a sub class then there will a contract between these classes thats
 *        subclass need to override all the abstract method of interface otherwise subclass become abstract class 
 *        
 *          -- between
 *                            
 *             1.two classes we use 'extends'
 *             2.two interface we use 'extends'
 *             3.class and interface use 'implements'   
 *                
 *                
 *                
 *                
 *                
 * 
 */
















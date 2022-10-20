package day12.Polymorphism;
class Hillstation {
	void location() {
 	   System.out.println("location is");
	}
	void famousfor() {
 	   System.out.println("famous for");
	}
}
class Manali extends Hillstation{
	void location() {
 	   System.out.println("manali is in himachal pradesh");
	}
	void famousfor() {
 	   System.out.println("it is famous for hadima temple and adventures sport");
	}
}
class Mussoorie extends Hillstation{
	void loaction() {
 	   System.out.println("Mussoorie is in uttarakhand");
	}
	void famousfor() {
 	   System.out.println("it is famous for education institute");
	}
}
class Gulmarg extends Hillstation{
	void location() {
 	   System.out.println("Gulmarg in j&k");
	}
	void famousfor() {
 	   System.out.println("it is famous for stricking");
	}
}
public class Poly_runtime2 {

	public static void main(String[] args) {
    Hillstation p1=new Hillstation();
    p1.location();
    p1.famousfor();
    
    Hillstation p2=new Gulmarg();
    p2.location();
    p2.famousfor();
    
    Hillstation p3=new Mussoorie();
    p3.location();
    p3.famousfor();
    
    Hillstation p4=new Manali();
    p4.location();
    p4.famousfor();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
		
		
		
		
	}

}

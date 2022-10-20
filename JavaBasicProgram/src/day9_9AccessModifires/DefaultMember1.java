package day9_9AccessModifires;

public class DefaultMember1 {

	     int AccNum=1234;
	     void displayAccNum() {
	          System.out.println("Account number="+AccNum);
 
	     }
	public static void main(String[] args) {
            DefaultMember1 m1= new DefaultMember1();
            m1.displayAccNum();
            System.out.println("default acc="+m1.AccNum);
	}

}
class AccessDefaultMember{
	
	public static void main(String[] args) {
	DefaultMember1 m2=new DefaultMember1();
      System.out.println("accessing default member from another class");
	m2.displayAccNum();
    System.out.println(m2.AccNum);	
    System.out.println("****************************************************************8888");
  
    System.out.println("accessing the protected member withing package");
    ProtectedMember1 m1=new ProtectedMember1();
    m1.displayAccNum();
    System.out.println("default member="+m1.AccNum);


	}
}





/**
 *Default member are accessible within package 
 *
 */
 

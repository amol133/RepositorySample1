package day9_9AccessModifires;

public class PrivateMember1 {
	private int accNum=1234;
	private void displayAccNum() {
		System.out.println("Account Number ="+accNum);
	}
	public static void main(String[] args) {
          PrivateMember1 m1=new PrivateMember1();
          m1.displayAccNum();
          System.out.println("private acc num="+m1.accNum);
	}

}
class AccessPrivateMember2{
	
	public static void main(String[] args) {
		PrivateMember1 m1=new PrivateMember1();
		m1.displayAccNum();
        System.out.println(m1.accNum);	
        
       /** System.out.println("accessing the default member within package");
         DefaultMember1 m1=new DefaultMember1();
         m1.displayAccNum();
         System.out.println("default member from another java file="+m1.AccNum);
         */
		
	}
	
}
/**
 * Private member are accessible within class only  
 */
 



















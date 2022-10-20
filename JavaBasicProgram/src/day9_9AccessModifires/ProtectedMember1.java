package day9_9AccessModifires;

public class ProtectedMember1 {
        protected int AccNum=1234;
        protected void displayAccNum() {
               System.out.println("Account number ="+AccNum);
       
 }
	public static void main(String[] args) {
     ProtectedMember1 m1=new ProtectedMember1();
     m1.displayAccNum();
     System.out.println("protected data="+m1.AccNum);

	}

}
class AccessProtectedMember{
	public static void main(String[] args) {
		ProtectedMember1 m1=new ProtectedMember1();
		m1.displayAccNum();
        System.out.println("protected data="+m1.AccNum);

	}
}
/**
 * Protected member are accessible within package  
 *  but can be access these member from outside the package using inheritance
*/
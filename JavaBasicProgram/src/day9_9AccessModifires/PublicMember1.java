package day9_9AccessModifires;

public class PublicMember1 {
	
	public int AccNum=1234;
	public void displayAccNum() {
	    System.out.println("Account Public ="+AccNum);
	}

	public static void main(String[] args) {
		PublicMember1 m1=new PublicMember1();
		m1.displayAccNum();
	    System.out.println("public data="+m1.AccNum);
	}

}
class AccessPublicMember{
	
	 public static void main(String[] args) {
		 PublicMember1 m1=new PublicMember1();
		 m1.displayAccNum();
		    System.out.println("public="+m1.AccNum);
	 }
	 
}

/**
 * Public member are accessible from any where like-
 * within same class
 * from outside the class
 * from outside the package but that class should be declare as public
*/
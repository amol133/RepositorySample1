package day1.program;

import day9_9AccessModifires.PublicMember1;

public class Example_ {

	public static void main(String[] args) {
    PublicMember1 m1=new PublicMember1();
    System.out.println("******public member accessing in different package************");
    m1.displayAccNum();
    System.out.println("public member="+m1.AccNum);
  
	}

}

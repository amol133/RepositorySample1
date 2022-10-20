package day9_3Thiskeyword_This_statement;

class student1{
	int rollno;
	 float fee;
	 student1(int rollno,float fee){
			System.out.println("intial value of the local rollno="+rollno);
			System.out.println("intial value of the local fee ="+fee);
			System.out.println("intial value of global rollno="+this.rollno);
			System.out.println("intial value of global fee ="+ this.fee);
      this.rollno=rollno;
      this.fee=fee;
		System.out.println("after global variable value="+this.rollno);
		System.out.println("after global variable value="+this.fee);

	 }
	 void call () {
			System.out.println(rollno + " "+ fee);
	 }
}
public class Thiskeyword7 {
	
	public static void main(String[] args) {
  student1 c1=new student1(123,321.13f);
  c1.call();
  student1 c2=new student1(1313,1111.13f);
  c2.call();
	
      
		

	}

}

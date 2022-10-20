package day9_3Thiskeyword_This_statement;

public class Thisstatement4 {
	int rollno;
	float fee;
	
	Thisstatement4(int rollno){
		this.rollno=rollno;
	}
	Thisstatement4(int rollno,float fee){
		this(rollno);// reusing constructor
		this.fee=fee;
		
	}
	void display() {
		System.out.println(rollno +" "+fee);
	}

	public static void main(String[] args) {
		Thisstatement4 c1=new Thisstatement4 (12);
		System.out.println(c1.rollno + " " +c1.fee);
		
		Thisstatement4 c2=new Thisstatement4 (12,34.432f);
		System.out.println(c1.rollno + " " +c2.fee);
         
		c1.display();
		c2.display();


	}

}

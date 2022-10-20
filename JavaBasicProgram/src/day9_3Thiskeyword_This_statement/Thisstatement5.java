package day9_3Thiskeyword_This_statement;

public class Thisstatement5 {

	int rollno;
	float fee;
	
	Thisstatement5(int rollno){
		this.rollno=rollno;
	}
	Thisstatement5(int rollno,float fee){
		this(rollno);
		this.fee= fee;
	}
	void display() {
		System.out.println(rollno + " " +fee);
	}
	public static void main(String[] args) {

		Thisstatement5 c1 =new Thisstatement5(23);
		Thisstatement5 c2 =new Thisstatement5 (34,55.55f);
		
		c1.display();
		c2.display();
		
	}

}

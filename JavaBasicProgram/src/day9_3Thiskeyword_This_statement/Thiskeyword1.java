package day9_3Thiskeyword_This_statement;

class Student {
	int rollno;
	float fee;

	Student(int rollno, float fee) {		
		this.rollno = rollno;
		this.fee = fee;
		//System.out.println(rollno);// for calling local variable in method without using this.
		//System.out.println(fee);
	}
	void display() {
		System.out.println(rollno + " " +  fee);
	}
}
public class Thiskeyword1 {
	static int age=25;
	public static void main(String args[]) {	
		int age=30;
		System.out.println("Age: "+age);
		System.out.println("SGV age: "+ Thiskeyword1 .age);

		Student s1 = new Student(111, 5000f);
		s1.display();//
		Student s2 = new Student(112, 6000f);
		s2.display();//
	}
}

/**
class student{
	int rollno;
	float fee;
	student(int rollno,float fee){
		rollno = rollno;
		fee = fee;
	}
	void display() {
	 System.out.println(rollno + " "+fee); 	
	
	}
}
public class Thiskeyword1 {
      static int age=35;
	public static void main(String[] args) {
	
		int age =25;
		System.out.println("age="+age);
		System.out.println("static age="+Thiskeyword1.age);
		student c1=new student(123,3434.56f);
		c1.display();
		
        student c2 =new student(111,5000f );
        c2.display();
	}

}
*/
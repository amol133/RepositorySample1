package day9_2.constructor;

public class constructor5 {

	int roll;
	double salary;
	constructor5(int a,double b){
		roll=a;
		salary=b;
	}
	void display() {
		System.out.println(roll +"  "+ salary);
	}
	public static void main(String[] args) {
       constructor5 c1=new constructor5(100,3456.65);
       c1.display();
       constructor5 c2=new constructor5(300,45325.657);
       c2.display();
	}

}

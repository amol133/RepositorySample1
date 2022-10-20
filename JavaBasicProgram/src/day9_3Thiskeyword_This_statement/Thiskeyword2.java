package day9_3Thiskeyword_This_statement;

public class Thiskeyword2 {
	int x;
	public Thiskeyword2(int x) {// constructor with a parameter
		this.x=x;
	}
		void display() {
			
			System.out.println(x);

			
		}
	

	public static void main(String[] args) {
		Thiskeyword2 c1=new Thiskeyword2(24);
		System.out.println(c1.x);
		c1.display();
		

	}

}

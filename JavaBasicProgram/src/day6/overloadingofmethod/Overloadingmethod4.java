package day6.overloadingofmethod;
		
public class Overloadingmethod4 {
		public void disp( char c) {
		System.out.println(c);
		}
	 
		public void disp(char c ,int num) {
			System.out.println(c + " "+num);
		}
		
		public void disp(double c,double num) {
			System.out.println(c+ "" +num);
		}
		
	
	public static  void main(String[]args) {
	Overloadingmethod4 r=new Overloadingmethod4();
	r.disp('a');
	r.disp('a',10);
	r.disp(10,34);
	Overloadingmethod4 r1=new Overloadingmethod4();
	r1.call(23.45);
	r1.call(34);
	}
	
	
	public void call (double d) {
		System.out.println("method with double calling d ="+d);
	}
	public void call (int num) {
System.out.println("method with integer parameter calling number = "+num);
	}

}

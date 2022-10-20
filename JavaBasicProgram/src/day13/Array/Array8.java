package day13.Array;
class Example{
	int age;
    double salary;
	Example(){
		System.out.println("zero parameter cons");
	}
	Example(int a){
		age=a;
		System.out.println("int parameter cons");
	}
	Example(double d){
		salary=d;
		System.out.println("double parameter cons");
		
	}
	void calling() {
		System.out.println("calling age="+age);
		System.out.println("calling salary="+salary);
	}
}

public class Array8 {

	public static void main(String[] args) {
  Example e1=new Example();
  Example e2=new Example(13);
  Example e3=new Example(44.44);
  
  e1.calling();
  e2.calling();
  e3.calling();
		
		
System.out.println("***********************************************************");		
//	Example[] e=new Example[] {new Example(),new Example(13),new Example(44.44)};	
		//or
//	Example[] e= {new Example(),new Example(13),new Example(44.44)};
		
		
Example[] e=new Example[3];
e[0]=new Example();
e[1]=new Example(13);
e[2]=new Example(44.44);

e[0].calling(); // e1.calling
e[1].calling(); // e2.calling
e[2].calling(); // e3.calling





		
		
	}

}

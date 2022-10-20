package day14_3_String_buffer_builder;

final class Testing{
	final int age;
	final double salary;
	final String name;
	Testing(int a,double d,String s){
		age=a;
		salary=d;
		name=s;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void display() {
		System.out.println(age);
		System.out.println(salary);
		System.out.println(name);
	}
}

public class Immutable2 {

	public static void main(String[] args) {
    Testing t1=new Testing(25,95600,"amol");
	System.out.println(t1.getAge());
	System.out.println(t1.getSalary());
	System.out.println(t1.getName());
		t1.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package day10.Encapsulation;

public class Encapsulation4 {

	public static void main(String[] args) {
       Demo1 e1=new Demo1();
		System.out.println("employee ssn="+e1.getSsn());
		System.out.println("employeee ampAge="+e1.getampAge());
		
		System.out.println("*********modifying value using setter*****************");
		e1.setSsn(1313);
		e1.setampAge(23);
		System.out.println("updated employee="+e1.getSsn());
		System.out.println("updated employee ="+e1.getampAge());


	}

}

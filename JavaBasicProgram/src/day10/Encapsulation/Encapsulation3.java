package day10.Encapsulation;
class Demo1{
	private int ssn;
	private int ampAge;
	
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn=ssn;
	}
	public int getampAge() {
		return ampAge;
	}
	public void setampAge(int ampAge) {
		this.ampAge=ampAge;
	}
}

public class Encapsulation3 {

	public static void main(String[] args) {
        Demo1 e1=new Demo1();
		System.out.println("employee ssn="+e1.getSsn());
		System.out.println("employee age="+e1.getampAge());
		System.out.println("******modifying private data member value by setter*******************");
         e1.setSsn(3434);
         e1.setampAge(45);
 		System.out.println("modify ssn="+e1.getSsn());
		System.out.println("modify anpAge="+e1.getampAge());

		
		
		
	}

}

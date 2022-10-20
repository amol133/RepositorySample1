package day9_1.switchconstantprogram;

public class memorymanagment {

	static int salary;
	      int empid;
	     
	    void display() {
	    	System.out.println("im display method");
	    }
	static void print() {
    	System.out.println("im print method");

	}
	public static void main(String[] args) {
    	System.out.println("salary="+salary);// static member
       print();
       
		memorymanagment ref=new memorymanagment();
    	System.out.println("empid="+ ref.empid);
        ref.display();
        
      salary=34000;// updated static member
  	System.out.println("salary="+salary);
    
      ref.empid=344;
  	System.out.println("updated salary="+ref.empid);

  	memorymanagment ref1=new memorymanagment();
	System.out.println("empid="+ref1.empid);

  	
  	
	}

}

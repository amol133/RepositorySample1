package day13.Array;

public class Array1 {

	public static void main(String[] args) {

		String[] car;
		car=new String[4];
		//or
		String[] cars =new String[4];
		
		cars[0]="hyundai";
		cars[1]="tata";
		cars[2]="jaguar";
		cars[3]="Maruti";
		
		//or
		String[] Car= {"hyundai","tata","jagaur","maruti"};
		System.out.println(Car[0]);
		// change an array element
		Car[0]="Audi";
		System.out.println("Car up="+Car[0]);
		
		System.out.println(Car.length);
		
		System.out.println("************for loop**********************");
		for(int i=0;i<car.length;i++) {
			System.out.println(Car[i]);
		}
	System.out.println("**********************for each loop***********************************");
	    		for(String x :Car) {
	    			System.out.println(x);
	    		}
		
	}

}

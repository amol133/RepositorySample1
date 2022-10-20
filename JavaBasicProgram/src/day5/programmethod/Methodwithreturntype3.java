package day5.programmethod;

public class Methodwithreturntype3 {

	static int x=10, y=20, z=30;
	public static double average(double p,double q,double r) {
		return (p+q+r)/3;
	}
  
	
	public static void main(String[] args) {
		System.out.println("first number=" + x);
		System.out.println("second number=" + y);
		System.out.println("third number=" + z);
		
		System.out.println("average of all number=" + average(x,y,z));
	
		System.out.println("the average of number= " + average(25,65,80));
		System.out.println("the average of numner =" +average(20,30,50));
        System.out.println("the average of number = " + average (50,10,30));
      
		int a=25,b=75,c=50;
		double avg=average(a,b,c);
		double result=avg+100;
		System.out.println("final number="+result);
		
		int j=300,q=400,r=500;
		double avg1=average(j,q,r);
		double res=avg1-200;
		System.out.println("average of all = " + avg1);
		System.out.println("final result="+res);
		
	}	
	}
	
	/*public static double average(double p ,double q, double r) {
		return (p+q+r)/3;
		*/
		
		
	/*	public static double average(double s ,double w, double v) {
			return (s+w+v)/3;
		}
		

		}
*/


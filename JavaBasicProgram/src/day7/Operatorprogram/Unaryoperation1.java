package day7.Operatorprogram;

public class Unaryoperation1 {

	public static void main(String[] args) {
	int a =50;
	int b=a;
	
	  System.out.println("a = " + a);
	  System.out.println("b = " + b);

	// pre ++a = first use the operation then perform a value
	//post a++ = first value perform  then operation
	
	int k = ++a ;//a= a+1=51
	  System.out.println("k = " + k);//51
	  System.out.println("a = " + a);//51

	int j=k++; //k= k/51+1=52;
	  System.out.println(" k= " + k);// 52
	  System.out.println("j = " + j);//51
	  
	  int r=-9;
	  System.out.println("r = " + r++);// -9
	  System.out.println("r = " + r); //-8

	  System.out.println("r = " + ++r);// -7
	  System.out.println("r = " + r);// -7


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}

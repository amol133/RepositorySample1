package day13.Array;

class Demo{
	// creating a method which receives an array as parameter min and max number
	
	static void min(int arr[]) {// int arr[]=a={33,13,4,50,15,1}
		int num=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(num >arr[i]) {
				num=arr[i];
			}
		}
		System.out.println("minimum number is="+num);
	}
	static void max(int arr[]) {
		int numMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(numMax < arr[i]) {
				numMax=arr[i];
			}
		}
		System.out.println("maximum number is="+numMax);
	}
}

public class Array5 {

	public static void main(String[] args) {
		int[] a= {33,13,4,50,15,1};
		Demo.min(a);
		Demo.max(a);

		
		int[] ar= {1,2,3,7,8,3,1};// min and max
		int num=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(num > ar[i]) {
				num=ar[i];
			}
		}
		System.out.println(num);
				
	}

}

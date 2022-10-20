package day13.Array;
class Demo1{
	static int[] getArray() {// array return type method
		int[] num=new int[3];
		num[0]=10;
		num[1]=13;
		num[2]=15;
		//int num[]= {10,13,15};
		return num;
		//or
		// return new int[] {10,23,44,55,66}
	}
}

public class Array6 {

	public static void main(String[] args) {
		// calling method which return array
		int arr[]=Demo1.getArray();
		// printing the value of an array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}

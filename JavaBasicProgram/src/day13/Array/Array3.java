package day13.Array;

public class Array3 {

	public static void main(String[] args) {
		
		int[] age= {10,20,30,40,50};
		System.out.println(age[0]);
		System.out.println(age[1]);
		System.out.println(age[2]);
		System.out.println(age[3]);
		System.out.println(age[4]);

		System.out.println(age.length);
		System.out.println("*************for loop ***********************************");
		for(int i=0;i< age.length;i++) {
			System.out.println(age[i]);
			if(age[i]==30) {
				System.out.println("number is present="+age[i]);
				break;
			}
			else {
				System.out.println("number is not present");
			}
		}
		
		System.out.println("****************8for  each loop*******************");
		for(int num:age) {
			System.out.println(num);
			if(num==30) {
				System.out.println("num is present="+num);
				break;
			}
			else {
				System.out.println("number is not present");
			}
		}
		
		
		
		
		
		
		
		
		

	}

}

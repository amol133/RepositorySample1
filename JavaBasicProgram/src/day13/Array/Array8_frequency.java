package day13.Array;

public class Array8_frequency {

	public static void main(String[] args) {

		int age[]= {10,25,10,30,10,25,10,20,10,30,45};
		
		// to store frequency of the array elements
		int[] freq=new int[age.length];
		
		int visited=-1;
	
		for(int i=0;i<age.length;i++) {
			int count=1;
			for(int j=i+1;j<age.length;j++) {
				
				if(age[i]==age[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!=visited) {
				freq[i]=count;
			}
		}
		
System.out.println("****************************************************************8");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
          System.out.println(age[i]+" : "+freq[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

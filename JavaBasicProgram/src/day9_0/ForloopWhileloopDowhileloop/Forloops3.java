package day9_0.ForloopWhileloopDowhileloop;

public class Forloops3 {

	public static void main(String[] args) {
		/*		 System.out.println("hello");
		 *       System.out.println("hello");
         *       System.out.println("hello");
		 * 		 System.out.println("hello"); 
		 */
// for ( initialization ; condition; incre/decre);
		
		for(int i =0 ; i <= 10 ; i++) {
			System.out.println("hello="+i);
		}
		System.out.println("**********printing of old number from 1 to 100 *********");
        for ( int i=1; i <= 100; i++) {
        	if(! (i%2==0)) {             // check both odd and even (i % 2==0)
        		System.out.println("old number =" +  i);

        	}
        	if (i % 2 !=0) {
        		System.out.println("old number = "+ i);

        	}
        }
        
		System.out.println("**************printing odd number from 1 to 25 from below method *****");
         printOddNumberFromRange(1,25);
		
		
	}

	static void printOddNumberFromRange(int start,int end) {
		int i=start;
		for (; i<=end;i++) {
		   if (i % 2 !=0)
			System.out.println("odd number "+ i );

		}
	}
	
	
	
	
	
	
}

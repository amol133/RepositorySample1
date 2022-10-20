package day13.Array;

public class Multi_Array2 {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3},{4,5},{6,7,8,9}};// each entry is one row
		
		for(int i=0;i<arr.length;i++) {// it count row row=0|| row=1|| row=2
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
		
		char[][] c= {{'a','b','c'},{'e','d'},{'p','q','r','s'}};
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		}

	}

}

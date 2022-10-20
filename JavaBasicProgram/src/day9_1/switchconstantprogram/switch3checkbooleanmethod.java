package day9_1.switchconstantprogram;

public class switch3checkbooleanmethod {

	public static void main(String[] args) {
	
      // checkVowel('z');
	     System.out.println(" is a given char vowels ="+checkVowel('z'));	
		
		
	}

	static boolean checkVowel(char ch) {
		switch (ch) {
		case 'a':
		      System.out.println("value matches a ,is a vowel");
              return true;
		case 'e':
		      System.out.println("value matches e ,is a vowel");
              return true;
		case 'i':
		      System.out.println("value matches i ,is a vowel");
              return true;
		case 'o':
		      System.out.println("value matches o ,is a vowel");
              return true;
		case 'u':
	      System.out.println("value matches u ,is a vowel");
          return true;
          
        default:
		      System.out.println("value is not  a vowel");
              return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

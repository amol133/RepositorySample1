package day14_2_scanner_String_class;

public class String6 {

	public static void main(String[] args) {

		String s="CoreJavaBasic";
		// or
	//	String st=new String("Core Java Basic");
		
// Returns the number of character in String or count of character in string
		System.out.println("count of character="+s.length());

// returns the character at ith index
		System.out.println("character at 3rd position="+s.charAt(3));
		
// return the substring from the ith index character		
		System.out.println("substring from index 3="+s.substring(3));
		
// return the from the i to j-1 index
		System.out.println("Substring from 2 to 5="+s.substring(2,5));
		System.out.println("substring from 4 to 8="+s.substring(4,8));

// concatenates string2 to the end of string1		
		String s1="Core";
		String s2="JavaBasics";
		System.out.println("first value of s1="+s1);// Core
		System.out.println("first value of the s3="+s2);//JavaBasics
		System.out.println("concate of s1 and s2="+s1.concat(s2));
		System.out.println("after concate s1 value="+s1);
		System.out.println("after concate s2 value="+s2);
		
		String s3="Pune";
		String s4="Mumbai";
		
		String X1=s1.concat(s2);// CoreJavaBasics
		String x2=s3.concat(s4);//PuneMumbai
		String x3=s3+s4;//PuneMumbai
		String x4=X1.concat(x2);// CoreJavaBasicsPuneMumbai
		
     //	String d1=s3.concat(24);// error
	 //   String d2=s1+24;	
		
		//Return the index within the String 
	// of the first occurrence of the specified string	
		String s5="Learn Share Learn Share";
		System.out.println("s5 size="+s5.length());
		System.out.println("index of 'share' starts from ="+s5.indexOf("Share"));
		
		// Return the index within the string of the
		//starting at the specified index
		System.out.println("Index of a'learn'="+s5.indexOf('a',3));// Next occurrence (index) of 'a' after index 3
		System.out.println("last index of e="+s5.indexOf('e',11));// next occurrence (index) of 'e' after index 11

		System.out.println("last index of 'learn' ="+s5.lastIndexOf("Learn",18));// occurrance of learn before index 18
		System.out.println("last index of e="+s5.lastIndexOf('e',18));// occurrance of 'e'before index 11
		
		// checking equality of String
		String s6="Selenium";
		String s7="Selenium";
		String s8="Selenium";
		System.out.println("checking equality of s6 and s7= "+s6.equals(s7));
		System.out.println("checking equality of s6 and s8="+s6.equals(s7));
		System.out.println("checking the equality of s6 and s7 with ignore case="+s6.equalsIgnoreCase(s7));

		// converting cases
		String word1="CoreJava";
		System.out.println("changing to lower case="+word1.toLowerCase());//corejava
		
		// converting cases
		String word2="CoreJava";
		System.out.println("changing to upper case="+word2.toUpperCase());
		
	// trimming the word
		String word3="   Learn share learn   ";
		System.out.println("trimming of word3="+word3);
		System.out.println("lenght of word3="+word3.length());
		System.out.println("after trim string="+word3.trim());
		System.out.println("after trim length="+word3.trim().length());
		
	// Replacing characters	
		String st1="CoreJavaBasic";
		System.out.println("original string="+st1);
        String st2=st1.replace('a', 'x');
		System.out.println("after replacing  a with x="+st2);//corejxvxBxsic
		
		String st3=st1.replace('a', 'w');
		System.out.println("Replacing a with w="+st3);//CoreJwvwBwsic
		
		String st5=" ";// space given true
		System.out.println("st5 empty or not ="+st5.isEmpty());//true
		
		String st6=new String();
		System.out.println("st6 is empty or not ="+st6.isEmpty());
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

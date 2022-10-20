package day7.Operatorprogram;

public class Unaryoperation2 {

	public static void main(String[] args) {
		int a=-95,b;
		b=a++;// a=-1+(-95)=-94;b=-95;
		int x=a ,y;// x=a=-94;
		System.out.println(x);
    y=++x;// 1+(-94)=-93;
    System.out.println("a="+a);
    System.out.println("b="+b);
    System.out.println("x = "+x);
    System.out.println("y="+y);
    
    int p =15 ,q=30, res;
		res=p++ + --q;// p+1=15=+,1-30=29
	    System.out.println("res="+res);// 15+29=44
	    System.out.println("p = "+p);// 15+1=16
	    System.out.println("q="+q);//30-1=29
System.out.println("*************************************");
		int res1=++p + ++q;// p=1+16=17  + q= 1+29=30
       System.out.println("res="+res);//17+30=47
       System.out.println("p="+p);// 16+1=17
       System.out.println("q="+q);//	1+29=30	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

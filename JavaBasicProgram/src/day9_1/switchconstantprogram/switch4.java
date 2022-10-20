package day9_1.switchconstantprogram;

public class switch4 {

	public static void main(String[] args) {
		int num=40;
		int num2=13,res;
		char op='%';
		
        switch(op) {
        case '-':
        	res=num-num2;
		      System.out.println("num-num2="+res);
             break;
        case '+':
        	res=num+num2;
		      System.out.println("num+num2="+res);
              break;
        case '/':
        	res=num/num2;
		      System.out.println("num/num2="+res);
             break;
        default:
		      System.out.println("unknown operation");
             break;
        }

	}

}

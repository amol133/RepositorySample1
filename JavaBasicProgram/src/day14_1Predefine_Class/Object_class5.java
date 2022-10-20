package day14_1Predefine_Class;
class Print{
	int a=10;
	@Override
	public int hashCode() {
		return 100;
	}
	@Override
	public String toString() {
		return "i am print class toString";
	}
}

public class Object_class5 {
	static int last_roll=133;
	int roll_no;
	Object_class5(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
     Object_class5 d1=new Object_class5();
     System.out.println("toString of objectclass5="+d1.toString());
     System.out.println("hashCode of objectclass5="+d1.hashCode());
     System.out.println("***********************************************");	
	 Object_class5 d2=new Object_class5();
     System.out.println("'s1' toString of ObjectClass5="+d2.toString());
     System.out.println("'s2'hashCode of ObjectClass5="+d2.hashCode());
     System.out.println("comparing of s1 & s2 ="+d1.equals(d2));
     System.out.println("****************************************************************");
     Print d3=new Print();
     System.out.println(d3.toString());
     System.out.println(d3.hashCode());
     Print d4=new Print();
     System.out.println(d4.toString());
     System.out.println(d4.hashCode());
     System.out.println("comparing print class object d3 and d4 with overriden equals()="+d3.equals(d4));

		
		
		
		
		
		
	}

}

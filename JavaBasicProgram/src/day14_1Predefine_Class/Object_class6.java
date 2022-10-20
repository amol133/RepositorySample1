package day14_1Predefine_Class;
class Print1 extends Object{
	int a=10;
	@Override
	public int hashCode() {
	     return 13;
	}
	@Override
	public String toString() {
		return"i am toString of Print1 class";
	}
	@Override
	public boolean equals(Object obj) {// Object obj=d1=new Print();--->Object obj=new Print() // Auto up casting
		Print1 d =(Print1)obj;//down casting
		return (this.a==d.a);
	}
}

public class Object_class6 {
	static int last_roll=344;
	int roll_no;
	Object_class6(){
		roll_no=last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		Object_class6 d1=new Object_class6();
	     System.out.println(d1.toString());
	     System.out.println(d1.hashCode());
       Object_class6 d2=new Object_class6();
         System.out.println(d2.toString());
         System.out.println(d2.hashCode());
         System.out.println("comapring both object of class object="+d1.equals(d2));

       Object_class6 d3=d2;
       System.out.println("comparing the object="+d2.equals(d3));
       
       Print1 d4=new Print1();
       System.out.println(d4.toString());
       System.out.println(d4.hashCode());
       
       Print1 d5=new Print1();
       System.out.println(d5.toString());
       System.out.println(d5.hashCode());
       System.out.println("comparing both object d4 and d5 with override equals()= "+d4.equals(d5));

       
       
       
       
       
       
       
       
       
       
	}

}

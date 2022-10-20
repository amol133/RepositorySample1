package day14_4Wrapping_class;

public class Boxing_wrapper1 {

	public static void main(String[] args) {

		int age=20;
		System.out.println("age="+age);
		
		Integer obj=45;// implicit /auto boxing java compiler convert it into Integer obj=new Integer(45)
		System.out.println("obj="+obj);//45
		
		Integer I=new Integer(age);// explicit boxing operation
		System.out.println("age="+age);
		
		System.out.println(age==I);
        Integer obj2=new Integer(50);// explicit boxing operation     
		System.out.println("obj2="+obj2);
		
		Integer obj3=30;//implici boxing operation auto boxing
		System.out.println("obj3="+obj3);
		
		char c='Z';
		Character xyz=c ;// implicit
		Character c1=new Character (c);// explicit
		System.out.println(c1);
		System.out.println(xyz);
		System.out.println(c1);
		
		
		
		
	}

}

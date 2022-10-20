package day14_4Wrapping_class;

public class Boxing_wrapping2 {

	public static void main(String[] args) {

		char c='A';
		
		Character obj=new Character(c);//explicit boxing operation
		Character x=c;//implite
		System.out.println(c==obj);
		Character obj1=new Character('Z');
		
		Character obj2='H';
		
		System.out.println("c="+c);
		System.out.println("obj="+obj);
		System.out.println("obj1="+obj1);
		System.out.println("obj2="+obj2);
		
		boolean b=true;
		Boolean obj3=new Boolean(b);//explicit boxing operation
		System.out.println("obj3="+obj3);
		
		
		
		
		
		
	}

}

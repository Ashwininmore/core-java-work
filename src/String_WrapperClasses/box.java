package String_WrapperClasses;

public class box {

	public static void main(String[] args) {
		int a=10;
//	boxing using constructor
//	@SuppressWarnings("removal")
	Integer ob1=new Integer(a);
	System.out.println(ob1);
//	
	//boxing using method
	Integer ob2=Integer.valueOf(a);
	System.out.println(ob2);
	
	//auto boxing
	Integer ob3=a;
	System.out.println(ob3);
		
	}

}
//primitive type to string
//		int i=10;
//		String s=Integer.toString(i);
//		System.out.println("s="+s);

//unboxing
//		Integer ob=10;
//		int x=ob.intValue();
//		System.out.println("After unboxing="+x);
//		
//		//autounboxing
//		int y=ob;
//		System.out.println("After autounboxing="+y);



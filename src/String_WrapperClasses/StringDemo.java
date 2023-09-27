package String_WrapperClasses;

public class StringDemo {

	public static void main(String[] args) {
		String s="Hello"; //by literal, obj creation
		System.out.println(s.concat(", Ashu"));//Hello, Ashu
		System.out.println(s);//Hello, string is immutable
//		String s=new String("Ashu");
		s=s.concat(", Swami");
		System.out.println(s);//Hello, Swami
//		String s2=new String();//calls default constructor
//		System.out.println(s2);//empty
		String s2=new String("Profound");//call copy constructor
		System.out.println(s2);//profound
		char c[]= {'r','a','j'};
		System.out.println(c[1]);//a
		String s3=new String(c);//passing char array to string constructor
		System.out.println(s3);//raj
		String s4="good morning";
		System.out.println("length="+s4.length());	//12
		System.out.println(s4.charAt(3));//d
		System.out.println(s4.equals("Good Morning"));//false
		System.out.println(s4.equalsIgnoreCase("Good Morning"));//true
		System.out.println(s4.substring(5));//morning
	}

}

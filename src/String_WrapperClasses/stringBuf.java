package String_WrapperClasses;

public class stringBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ob=new StringBuffer("Ashwini");
//		StringBuilder ob=new StringBuilder("Ashwini");
		System.out.println("Length="+ob.length());
		System.out.println(ob.capacity());
		
		System.out.println("After append text="+ob.append(" More"));
		System.out.println(ob);
		System.out.println("After insertion="+ob.insert(0, "Hello,"));
		System.out.println("After delete="+ob.delete(0, 7));
		System.out.println("After replace="+ob.replace(6, 8, "@"));
	}

}

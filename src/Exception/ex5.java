package Exception;

//NullPointerException

public class ex5 {

	public static void main(String[] args) {
		String s=null;
//		String s="Ashu";
		try {
			System.out.println("Length="+s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}

}

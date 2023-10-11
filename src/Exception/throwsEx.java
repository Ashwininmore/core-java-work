package Exception;

//throws Keyword

public class throwsEx {

	public static void main(String[] args) throws Exception {
		int age=0;
		age=Integer.parseInt(args[0]);

		if(age<0) {
			throw new Exception("Age can't be negative!!");
		}
		else {
			System.out.println("Your Age="+age);
		}
	}
}

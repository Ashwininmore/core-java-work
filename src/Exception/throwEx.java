package Exception;

import java.io.IOException;

//custom exception using "throw"

public class throwEx {

	public static void main(String[] args) {
		int age=0;
		age=Integer.parseInt(args[0]);
		try {
			if(age<0) {
				throw new IOException("Age can't be negative!!");
			}
			else {
				System.out.println("Your Age="+age);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

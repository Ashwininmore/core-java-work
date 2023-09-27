package String_WrapperClasses;
import java.util.*;
// To separate words and count no. of words using strintoknizer
public class StringTokenizer1 {

	public static void main(String[] args) {
		StringTokenizer s =new StringTokenizer("Welcome to java");
		int c=0;
		while(s.hasMoreTokens()){ //returns boolean
			System.out.println(s.nextToken()); //it print curr token and cursor move to next token
			c++;
		}
		System.out.println("Total tokens:"+c);
		
	}

}

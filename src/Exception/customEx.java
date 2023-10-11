package Exception;
import java.util.*;
class LowBalanceException extends Exception //custom exception
{
	LowBalanceException(String s){
		super(s); //it pass msg to super class constructor(Exception)
	}
}
public class customEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int wamt, bal=10000;
		System.out.println("Enter withdrawl amt:");
		wamt=sc.nextInt();
		try {
			if(wamt>bal) {
//				LowBalanceException ob=new LowBalanceException("Plz enter amt less than 10000");
//				throw ob;
				//this is anonymous object creation
				throw new LowBalanceException("Plz enter amt less than 10000");
			}
			else {
				bal=bal-wamt;
				System.out.println("After withdrawl available bal:"+bal);
			}
		}
		catch(LowBalanceException e) {
			System.out.println(e);
		}
		
		
	}

}

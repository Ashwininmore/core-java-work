package Exception;

//Arithmetic Exception

public class ex2 {

	public static void main(String[] args) {
		int a=10,b,c=0;
		b=Integer.parseInt(args[0]);
		try {
			c=a/b;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("c="+c);
		}
		System.out.println("Hello");

	}

}

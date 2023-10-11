package Exception;

//nested try and multiple catch

public class ex6 {

	public static void main(String[] args) {
		try {
			int b=Integer.parseInt(args[0]);
			try {
				int a=10/b;
				System.out.println("Division="+a);
			}
			catch(ArithmeticException e) {
				System.out.println("Inner catch,"+e);
			}
		}
		catch(Exception e) {
			System.out.println("Outer catch,"+e);
		}
	}

}

package Exception;

//NumberFormatException: when alphabet form of string going to convert in numeric format then it will occur

public class ex3 {

	public static void main(String[] args) {
		int a=0;
		try {
			a=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e){
			System.out.println(e);
//			e.printStackTrace();  //for more detail
		}
		
		System.out.println("Square="+(a*a));
	}

}

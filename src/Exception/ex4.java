package Exception;
//ArrayIndexOutOfBoundsException
public class ex4 {

	public static void main(String[] args) {
		int a[]=new int[4];
		try {
			for(int i=0;i<a.length;i++) {
				a[i]=Integer.parseInt(args[i]);
			}
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Elements are:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

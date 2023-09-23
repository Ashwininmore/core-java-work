package basicCoreJava;
final class AA1{
	final void print() {
		System.out.println("from super class");
	}
}
/*class BB1 extends AA1{ 
	error, can't inherit final class
}*/
public class finaluse3 {
	public static void main(String[] args) {
		AA ob=new AA();
		ob.print();
	}
}

package basicCoreJava;
class AA{
	final void print() {
		System.out.println("from super class");
	}
}
class BB extends AA{
	/*void print() //error, can't override final method
	{
		System.out.println("from sub class");
	}*/
}
public class finaluse2 {

	public static void main(String[] args) {
		BB ob=new BB();
		ob.print();
	}

}

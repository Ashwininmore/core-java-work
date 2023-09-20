package basicCoreJava;
class outer{
	static int a=10;
	static class inner{
		void show() {
			System.out.println("a="+a);
		}
	}
}
public class staticClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer.inner ob =new outer.inner();
		ob.show();
	}

}

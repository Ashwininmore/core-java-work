package basicCoreJava;
//static block access static data
//static block execute before main()
public class StaticBlock {
static int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("from main");
	}
	static {
		System.out.println("from static block a="+a);
	}
}

package basicCoreJava;
//wap to find factorial using abstract class

abstract class  factorial{
	int n;
	void set(int n) {
		this.n=n;
	}
	abstract void find();
}
public class Abstract_class extends factorial{
	
	@Override
	void find() {
		int f=1;
		for(int i=n;i>=1;i--) {
			f=f*i;
		}
		System.out.println("Factorial="+f);
	}

	public static void main(String[] args) {
		factorial ob = new Abstract_class();
		ob.set(3);
		ob.find();

	}

}

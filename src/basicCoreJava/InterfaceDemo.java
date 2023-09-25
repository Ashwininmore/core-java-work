package basicCoreJava;
//find area of circle using interface

interface circle{
	double pi=3.14;
	void set(double r);
	void find();
	//java8 feature added
	default void print1() {
		System.out.println("Default method");
	}
	static void print2() {
		System.out.println("Static method");
	}
}
public class InterfaceDemo implements circle{
	double r;
	@Override
	public void set(double r) {
		this.r=r;
	}

	@Override
	public void find() {
		double a=pi*r*r;
		System.out.println("Area of Circlr="+a);
	}
	public static void main(String[] args) {
		circle ob=new InterfaceDemo();
		ob.set(10.0);
		ob.find();
		ob.print1();
		circle.print2();

	}

	

}

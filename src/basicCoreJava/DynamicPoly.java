package basicCoreJava;
class demo1{
	void print(int a) {
		System.out.println("Sqaure:"+a);
	}
}
class demo2 extends demo1{
	void print(int a) {  //method override
		super.print(a); //used to call super class method
		System.out.println("Cube:"+(a*a*a));
	}
}
public class DynamicPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 ob =new demo2();
		ob.print(3);
		
		demo1 x=new demo2(); //achieve run-time polymorphism or dynamic dispatch
		x.print(5);
		
	}

}

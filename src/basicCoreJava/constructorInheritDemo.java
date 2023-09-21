package basicCoreJava;
class first{
	first(){
		System.out.println("from first");
	}
}
class second extends first{
	second(){
		super();//it call super class constructor
		System.out.println("from second");
//		super(); error
	}
}
public class constructorInheritDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		second ob=new second();
	}

}

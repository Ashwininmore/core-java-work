package basicCoreJava;

interface A{
	void set1();
}
interface B{
	void set2();
}
public class MultipleInheritance implements A,B{ //this structure calls mutiple inheritance

	@Override
	public void set2() {
		System.out.println("B interface");
		
	}

	@Override
	public void set1() {
		System.out.println("A interface");
		
	}
	public static void main(String[] args) {
		MultipleInheritance m1=new MultipleInheritance();
		m1.set1();
		m1.set2();
		//or we can create ob of interface also 
		//but having multiple interface it is better to create ob of subclass

	}

	

}

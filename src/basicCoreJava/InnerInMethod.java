package basicCoreJava;
class outer1 {
	void show() {
		class inner1{
			void display() {
				System.out.println("Inner class inside method:");
			}
		}
		inner1 x=new inner1();
		x.display();
	}
}
public class InnerInMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer1 ob=new outer1();
		ob.show();
	}

}

package basicCoreJava;
//normal inner class
class outerclass
{
	int a=10;
	class inner{
		void show() {
			System.out.println("a="+a);
		}
	}
}
public class innerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass obj=new outerclass();
		outerclass.inner ob=obj.new inner();
		ob.show();
	}

}

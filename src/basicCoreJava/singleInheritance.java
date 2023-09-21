package basicCoreJava;
//wAP to create
class student1{  //super class
	int roll;
	String name;
	protected void set(int roll, String name) {
		this.roll=roll;
		this.name=name;
	}
}
class test extends student1{ //sub class
	int m1,m2;
	void find() {
		System.out.println("Roll no:"+roll+"\nName:"+name+"\nTotal marks:"+(m1+m2));
	}
	void set2(int m1, int m2) {
		this.m1=m1;
		this.m2=m2;
	}
}
public class singleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();
		t.set(101, "Ashu");
		t.set2(40,60);
		t.find();
	}

}

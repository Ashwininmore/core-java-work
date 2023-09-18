package basicCoreJava;

public class CopyConstructor {
	int a, b;
	CopyConstructor(int a, int b){ //parameterized constructor
		this.a=a;
		this.b=b;
	}
	CopyConstructor(CopyConstructor ob){ //copy constructor
		this.a=ob.a;
		b=ob.b;  //here this keyword is optional
	}
	void show() {
		System.out.println("a="+a+"\nb="+b);
	}
	public static void main(String[] args) {
		CopyConstructor ob1=new CopyConstructor(10,20);
		CopyConstructor ob2=new CopyConstructor(ob1);
		ob1.show();
		ob2.show();
		
	}

}

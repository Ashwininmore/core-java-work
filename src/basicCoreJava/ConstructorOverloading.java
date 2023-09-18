package basicCoreJava;

import java.util.Scanner;

public class ConstructorOverloading {
	int a,b;
	ConstructorOverloading(){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two values:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Multiplication:"+(a*b));
	}
	ConstructorOverloading(int a, int b){
		this.a=a;
		this.b=b;
	}
	void div() {
		System.out.println("Division="+(a/b));	
	}

	public static void main(String[] args) {
		ConstructorOverloading ob=new ConstructorOverloading(10,5); //calls parameterized 
		ob.div();
		ConstructorOverloading ob1=new ConstructorOverloading(); //calls default 

	}

}

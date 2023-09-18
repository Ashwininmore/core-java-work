package basicCoreJava;

import java.util.Scanner;

public class DefaultConstructor {
	double length, breadth;
	
	DefaultConstructor(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length & Breadth:");
		length=sc.nextDouble();
		breadth=sc.nextDouble();
	}
	
	void findArea() {
		System.out.println("Area of Rectangle:"+(length*breadth));//o/p:1211.1100000000001
		//we can use printf in java
		System.out.printf("Area of Rectangle:%.2f",(length*breadth));//o/p:1211.11
	}
	
	public static void main(String[] args) {
		DefaultConstructor ob = new DefaultConstructor();
		ob.findArea();

	}

}

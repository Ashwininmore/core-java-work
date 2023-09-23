package basicCoreJava;
//static/compile time polymorphism using method overloading3
import java.util.*;
public class staticPoly {
	double a,r;
	void area() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius:");
		r=sc.nextDouble();
		a=3.14*r*r;
		System.out.println("Area of Circle:"+a);
	}
	void area(double s) {
		a=s*s;
		System.out.printf("Area of Square:%.2f"+a);
	}
	void area(double l,double b) {
		a=l*b;
		System.out.println("Area of Rectangle:"+a);
	}
	void area(float b,float h) {
		a=0.5*b*h;
		System.out.println("Area of Triangle:"+a);
	}
	public static void main(String[] args) {
		staticPoly ob =new staticPoly();
		ob.area();
		ob.area(5.6);
		ob.area(3.4, 2.1);
		ob.area(2.1f, 4.4f);

	}

}

package basicCoreJava;
import java.util.*;

public class ParameterizedStruct {
	double amt,n,r;
	ParameterizedStruct(){
		amt=n=r=0;
//		amt=null; giving error double!=null
	}
	
	ParameterizedStruct(double amt, double n, double r){
		this.amt=amt;
		this.n=n;
		this.r=r;
	}
	void calculate() {
		System.out.println("Simple Intereset is:"+(amt*n*r)/100);
	}
	public static void main(String[] args) {
		ParameterizedStruct ob1=new ParameterizedStruct(10000,3,12);
		//also gives error when we create obj, where we have parameterized 
		//constructor but not a default, in that case we have define it.
		ParameterizedStruct ob=new ParameterizedStruct();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount, No. of years, and rate:");
		ob.amt=sc.nextDouble();
		ob.n=sc.nextDouble();
		ob.r=sc.nextDouble();
		ob1.calculate();
		ob.calculate();
	}

}

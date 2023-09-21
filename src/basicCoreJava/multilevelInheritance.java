package basicCoreJava;
import java.util.*;
//WAP for multilevel
//student----test----score
class student2{
	int roll;
	String name;
	Scanner sc=new Scanner(System.in);
	void set1() {
		System.out.println("Enter rollno and name:");
		roll=sc.nextInt();
		name=sc.next();
	}
}
class test1 extends student2{
	int m1,m2;
	void set2() {
		System.out.println("enter marks in 2 subjects:");
		m1=sc.nextInt();
		m2=sc.nextInt();
	}
}
class score extends test1{
	int s;
	void set3() {
		System.out.println("Enter score:");
		s=sc.nextInt();
	}
	void show() {
		System.out.println("Roll="+roll+"\nName="+name+"\nTotal marks="+(m1+m2+s));
	}
}
public class multilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		score ob=new score();
		ob.set1();
		ob.set2();
		ob.set3();
		ob.show();
	}

}

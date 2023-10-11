package p5;
import java.util.Scanner;

//import p3.p4.*;
import p3.p4.book;
import p3.p4.product;
public class testmain implements book{
	
	String bname;
	int bprice;

	public static void main(String[] args) {
		product p=new product();
		p.set(1001, "mobile", 11000, 2);
		p.calc();
		System.out.println(p.toString());
		testmain ob=new testmain();
		ob.set();
		ob.show();
		
	}
	@Override
	public void set() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name and price:");
		bname=sc.next();
		bprice=sc.nextInt();	
	}
	@Override
	public void show() {
		System.out.println("Book name="+bname+"\n Price="+bprice);
		
	}
	
	

}

package basicCoreJava;
import java.util.*;
//Account(ano, aname)
//saving(interest) Current(no interest)

class Account{
	int ano;
	String aname;
	void set(int ano,String aname) {
		this.ano=ano;
		this.aname=aname;
	}
	@Override
	public String toString() {
		return "Account [ano=" + ano + ", aname=" + aname + "]";
	}
	
}
class Saving extends Account{
	double p,n,r;
	void set2(double p,double n,double r) {
		this.p=p;
		this.n=n;
		this.r=r;
	}
	void find() {
		double si=(p*n*r)/100;
		System.out.println("Simple Interest:"+si);
	}
}
class Current extends Account{
	void show() {
		System.out.println("no interest calculated..");
	}
}
public class hirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Saving\n2:Current\nEnter choice:");
		int ch =sc.nextInt();
		switch(ch)
		{
		case 1: Saving ob1=new Saving();
				ob1.set(1001, "Ram");
				ob1.set2(20000.0,10.5,10.2);
				System.out.println(ob1);
				ob1.find();
				break;
		case 2: Current ob2=new Current();
				ob2.set(102, "Ashu");
				System.out.println(ob2);
				ob2.show();
				break;
		default:System.out.println("Invalid Input");
		}
	}

}

package basicCoreJava;
class emp{
	static String cname="Infosys";
	int id;
	static int c;
	void set(int id) {
	this.id=id;
	c++;
	}
	void show() {
		System.out.println("Comapany name="+cname+"\n ID:"+id+"\n Total emp="+c);
	}
}

public class StaticDataMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp e1=new emp();
		emp e2=new emp();
		emp e3=new emp();
		e1.set(101);
		e2.set(102);
		e3.set(103);
		e1.show();
		e2.show();
		e3.show();
		
	}

}

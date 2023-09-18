package basicCoreJava;

class product{
	private String pname;
	private double prate;
	
	void set(String pname, double prate) {
		this.pname = pname;
		this.prate=prate;
	}

	@Override
	public String toString() {
		return "product [pname=" + pname + ", prate=" + prate + "]";
	}
}

public class DataEncapsulation {

	public static void main(String[] args) {
		product ob=new product();
		ob.set("Pen", 10);
//		System.out.println(ob.pname);
		System.out.println(ob);//calls toString()

	}

}

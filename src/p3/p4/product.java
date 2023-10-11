package p3.p4;

public class product {
	int pcode;
	String pname;
	int rate,qty,amt;
	
	public void set(int pcode, String pname,int rate,int qty) {
		this.pcode=pcode;
		this.pname=pname;
		this.rate=rate;
		this.qty=qty;
	}
	public void calc() {
		amt=qty*rate;
	}
	@Override
	public String toString() {
		return "product [pcode=" + pcode + ", pname=" + pname + ", rate=" + rate + ", qty=" + qty + ", amt=" + amt
				+ "]";
	}
}

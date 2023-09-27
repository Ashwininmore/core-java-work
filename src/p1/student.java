package p1;

public class student {
	int rno;
	String name;
	double marks;
	
	public student(int rno, String name, double marks){
		this.rno=rno;
		this.marks=marks;
		this.name=name;
	}

	@Override
	public String toString() {
		return "student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}
	
}

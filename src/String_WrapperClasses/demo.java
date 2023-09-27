package String_WrapperClasses;

public class demo {
	int x,y;
	
	void set(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString() {
		return "demo [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {
		demo ob=new demo();
		ob.set(4, 5);
		System.out.println(ob.toString());

	}

}

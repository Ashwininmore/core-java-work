package basicCoreJava;

public class GarbageCollector {
	public void finalize() {
		System.out.println("Oject Destroyed..");
	}

	public static void main(String[] args) {
		GarbageCollector d1 = new GarbageCollector();
		GarbageCollector d2 = new GarbageCollector();
		d1=null;
		d2=null;
		System.gc();
	}

}

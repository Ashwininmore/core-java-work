package coreJavaAssign;
class IllegalArumentException extends Exception //custom exception
{
	IllegalArumentException(String s){
		super(s); //it pass msg to super class constructor(Exception)
	}
}
class CalcAverage{
	public double avgFristN(int N) {
		double avg=0;
		try {
			
			if(N<=0) {
				throw new IllegalArumentException("Please provide integer natural number");
			}
			else {
				int sum=0;
				for (int i=1;i<=N;i++) {
					sum=sum+i;
				}
				avg=sum/N;
			}
		}
		catch(IllegalArumentException e) {
			System.out.println(e);
		}
		return avg;
		
	}
}

public class throwdemo2 {

	public static void main(String[] args) {
		CalcAverage ob=new CalcAverage();
		System.out.println("Average:"+ob.avgFristN(-4));
	}

}

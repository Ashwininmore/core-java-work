package coreJavaAssign;

import java.util.Scanner;

public class Number {
	int firstNumber, secondNumber;
	double result;
	
	Number(int x,int y){
		this.firstNumber=x;
		this.secondNumber=y;
	}
	
	int add() {
		return firstNumber+secondNumber;
	}
	int sub() {
		return firstNumber-secondNumber;
	}
	int mul() {
		return firstNumber*secondNumber;
	}
	void div() {
		try {
			if(secondNumber==0) {
				throw new ArithmeticException("Can't be divided by zero");
			}
			else {
				System.out.println(firstNumber/secondNumber);
			}
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		int ch;
		boolean n=true;
		Number ob = new Number(10, 5);
		Scanner sc=new Scanner(System.in);
		System.out.println("***Enter the choice of opeartion***");
		System.out.println("\n 1.Add 2.Sub 3.Mul 4.Div");
		while(n) {
			System.out.println("Choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("\n Addition is:"+ob.add());break;
			case 2:System.out.println("\nSubstraction is:"+ob.sub());break;
			case 3:System.out.println("\nMultiplication is:"+ob.mul());break;
			case 4:System.out.println("\nDivision is:");ob.div();break;
			default:System.out.println("\nEnter valid choice!!!");
			}
			System.out.println("Do u wanna to continue?true/false:");
			n=sc.nextBoolean();
		}

	}

}

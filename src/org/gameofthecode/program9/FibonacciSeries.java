package org.gameofthecode.program9;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNumber=0;
		int secondNumber=1;
		int input=10;
		System.out.println("Input-->"+input);
		System.out.print("Fibonacci series-");
		for(int i=0;i<input;i++) {
			
			System.out.print(firstNumber+" ");
			int thirdNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
		}

	}

}

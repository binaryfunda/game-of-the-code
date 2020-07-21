package org.gameofthecode.program5;

public class NumberPattern1 {

	public static void main(String args[]) {

		int input = 6;
		int print = 1;
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(print++ + " ");

			}
			System.out.println();
		}
	}
}

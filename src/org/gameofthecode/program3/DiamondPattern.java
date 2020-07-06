package org.gameofthecode.program3;

public class DiamondPattern {

	public static void main(String args[]) {
		int n = 10;// number of row required
		diamondPattern(n);
	}

	public static void diamondPattern(int n) {
		int i = 1;
		int j = 1;
		/*
		 * I have used two variable lowerSpace and upperSpace to make the program easy
		 * to understand
		 */
		int upperspace = n - 1;
		// Upper side of Diamond
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= upperspace; i++) {
				System.out.print(" ");
			}
			upperspace--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int lowerSpace = 1;
		// Lower side of Diamond.
		for (j = 1; j <= n - 1; j++) {
			for (i = 1; i <= lowerSpace; i++) {
				System.out.print(" ");
			}
			lowerSpace++;
			for (i = 1; i <= 2 * (n - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}

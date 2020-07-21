package org.gameofthecode.program8;

public class PascalTriangle {
	public static void main(String args[]) {
		int n = 10;
		for (int i = 0; i < n; i++) {
			int output = 1;
			//formatting the String for space
			System.out.printf("%" + (n - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				/*
				 * The %4d is a format string. The d, for decimal (as opposed to a (f)loating
				 * point) number or various other formats. The 4 indicates that the number
				 * should occupy 4 characters of width
				 */
				System.out.printf("%4d", output);
				
				output = output * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}

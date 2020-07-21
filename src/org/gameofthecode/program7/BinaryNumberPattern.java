package org.gameofthecode.program7;

public class BinaryNumberPattern {

	public static void main(String args[]) {	
		int input = 10;
		int output = 0;
		for (int i = 1; i <= input; i++) {
			output = i % 2 == 1 ? 0 : 1;

			for (int j = 1; j <= input; j++) {
				output = output == 1 ? 0 : 1;
				System.out.print(output);
			}
			System.out.println();
		}
	}

}

/*
 * 10101 01010 10101 01010 10101
 */
/*
 * 1010101010 0101010101 1010101010 0101010101 1010101010 0101010101 1010101010
 * 0101010101 1010101010 0101010101
 */

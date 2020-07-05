package org.gameofthecode.program2;

public class RightAngleTrianglePattern {

	public static void main(String args[]) {
		int n = 10;// number of row required
		rightAngleTriangle(n);
	}

	public static void rightAngleTriangle(int n) {
		// Outer loop will handle the number of row.
		for (int i = 0; i < n; i++) {

			// Inner loop will handle the asterisk
			// the value of k is increase by 1
			for (int k = 0; k <= i; k++) {
				System.out.print("* "); // print space

			}
			// This is to take cursor to next line
			System.out.println("");
		}

	}

}

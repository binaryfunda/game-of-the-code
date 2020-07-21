package org.gameofthecode.program11;

public class DescendingOrderNumbertriangle {

	public static void main(String[] args) {

		int rows = 5;
		System.out.println("Number value is : " + rows);

		for (int i = rows; i >= 1; i--) {
			for (int j = rows; j >= i; j--) {
				System.out.print(j + " ");
			}

			System.out.println();
		}
	}

}

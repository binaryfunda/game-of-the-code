package org.gameofthecode.program4;

public class ReverseTheString {

	public static void main(String args[]) {

		String input = "This is the sentence we want to reverse";
		System.out.println("input >" + input);
		StringBuilder sb = new StringBuilder(input);
		System.out.println("output >" + sb.reverse());
	}
}

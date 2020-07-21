package org.gameofthecode.program6;

public class NumberToBinary {
	public static void main(String a[]) {
		System.out.println("Output binary Number is > "+getBinaryNumber(190000000));
	}
	
	public static String getBinaryNumber(long input) {
		System.out.println("Input number is > "+input);
		long reminder;
		String output="";
		while(input > 0)
        {
			reminder = input % 2;
			output = reminder + output;
            input = input / 2;
        }
		return output;
	}
}

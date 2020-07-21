package org.gameofthecode.program4;

public class ReverseUsingChar {
	public static void main(String[] args) {

        String input = "Hello from Binary World";
        System.out.println("input >"+input);
        System.out.println("output >"+reverseString(input));   

    }
	public static String reverseString(String input) {
		
		//Check if the input is not Empty or null;
		//It is a good practice to use null check 
        if (input == null || input.length() < 0) {
            System.out.println("Input cannot be null or empty");
        }
        char[] output = input.toCharArray();
        int startIndex = 0;
        int endIndex = output.length - 1;
        char temp;
         
        for (; endIndex > startIndex; startIndex++, endIndex--) {
            temp = output[startIndex];
            output[startIndex] = output[endIndex];
            output[endIndex] = temp;
        }
        return new String(output);
    }
}

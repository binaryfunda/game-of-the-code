package org.gameofthecode.program10;
public class CountVowels {

	public static void main(String arg[]) {

		String input = "My Website binaryfunda.com";
		System.out.println("Input String is ->'" + input + "'");
		System.out.println("-----------------------------------------------");
		System.out.println("Total Count of vowels ->" + getVowelsCount(input));
	}

	// We will count the number of vowel
	// We will also add the function to get the position of character in String.
	static int getVowelsCount(String input) {
		char[] byteArray = input.toCharArray();
		int count = 0;
		for (int i = 0; i < byteArray.length; i++) {
			char ch = byteArray[i];
			int postion = 0;
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				count++;
				postion = i + 1;
				System.out.println("Character is '" + ch + "' and character postion in String " + postion);
				System.out.println();
			}
		}

		return count;
	}
}

class Draw {
	private Shape shape;
	Draw(Shape shape){
		this.setShape(shape);
	}
	
	public void create() {
	shape.draw();
	}
	public Shape getShape() {
		return shape;
	}
	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
}


interface Shape {

	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {

		System.out.println("You have drawn circle");
	}
}

package org.gameofthecode.program9;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.setAge(23);
		System.out.println("age is "+obj.getAge());	
		obj.setAge(-23);
		System.out.println("age is "+obj.getAge());
	}
}

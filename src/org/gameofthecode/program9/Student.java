package org.gameofthecode.program9;

public class Student {
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
			this.age = age;	
		}else {
			System.out.println("Age Value cannot be Negative");
		}
		
	}

}

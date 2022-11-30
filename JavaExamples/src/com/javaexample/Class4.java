package com.javaexample;

class Class1 {
	
	public static Class2 class2 =new Class2();

}

class Class2 {
	 
	Class3 class3 =new Class3();

}

class Class3 {

	
	Class4 class4 =new Class4();

}

public class Class4 {

	public void show() {

		System.out.println("Welcome to Java FSE training");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1.class2.class3.class4.show();
	}

}

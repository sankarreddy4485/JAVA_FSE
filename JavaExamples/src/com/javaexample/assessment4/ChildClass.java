package com.javaexample.assessment4;

public class ChildClass extends ParentClass {

	public ChildClass() {
		super("message");
		
		System.out.println("Child class of Dafault constructor");
	}

	public ChildClass(String msg) {
		this();
		System.out.println("Child class of Parameterized constructor");

	}
	
	

}

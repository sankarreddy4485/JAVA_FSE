package com.javaexample.assessment4;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
	//QuadraticEquation (b2 -4*a*c)
	Scanner input = new Scanner(System.in);
	System.out.println("Enter value of a :");
	double a = input.nextDouble();
	
	System.out.println("Enter value of b :");
	double b = input.nextDouble();
	
	System.out.println("Enter value of c :");
	double c = input.nextDouble();
	
	double d = b*b -4*a*c;
	
	if(d==0) {
		double result1 = -b /(2.0*a);
		System.out.println("The root is : " + result1);
	}else if(d>0) {
		double result1 = (-b - Math.pow(d, 0.5)) /(2.0*a);
		double result2 = (-b + Math.pow(d, 0.5)) /(2.0*a);
		System.out.println("The roots are : " + result1+"and" +result2);

	}else {
		System.out.println("The equations does not have real roots.");
	}

	}
}

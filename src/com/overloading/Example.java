package com.overloading;

public class Example {
	void getAdd(int a, int b) {
		System.out.println(a+b);
	}
	
	void getAdd(double a, double b) {
		System.out.println(a+b);
	}
	
	void getAdd(double a) {
		System.out.println(a);
	}
	
	void getAdd(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	


}

package com.overloading;

//Program for method overloading
public class DemoTest {
	void getData(String str) {
		System.out.println("String:: getData() method");
	}

	void getData(Object obj) {
		System.out.println("Object:: getData() method");
	}

	public static void main(String[] args) {

		DemoTest demoTest = new DemoTest();
		//demoTest.getData(new Object()); // Object:: getData() method
		demoTest.getData("ajay");// String:: getData() method
		//demoTest.getData(new DemoTest());// Object:: getData() method
		demoTest.getData(new String());// String:: getData() method
	}

}

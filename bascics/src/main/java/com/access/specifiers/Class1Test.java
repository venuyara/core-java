package com.access.specifiers;

public class Class1Test {

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		System.out.println(class1.i);
		class1.method1();

		// private variable - cannot access
		//System.out.println(class1.j);

		// private method - cannot access
		//class1.method2();

		System.out.println(class1.k);
		class1.method3();

		System.out.println(class1.l);
		class1.method4();
	}

}

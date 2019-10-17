package com.access.specifiers2;

import com.access.specifiers.Class1;

public class Class1Test extends Class1 {

	public static void main(String[] args) {
		Class1Test class1Test = new Class1Test();
		class1Test.method1();
	}

	public void method1() {
		Class1 class1 = new Class1();

		// protected variables cannot access outside the package on the object
		//System.out.println(class1.k);
		// class1.method3();

		// we can access protected variables/method outside the package through inheritance
		// means only in sub class we can access directly
		System.out.println(k);
		method3();

		// we cannot access outside of the package 
		//System.out.println(class1.l);
		//class1.method4();
	}
}

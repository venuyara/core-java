package com.access.specifiers;

/**
Access Specifiers:
public - accessible every where, applicable to class, variables, methods
private - accessible with in the class. applicable to inner classes, variables, methods
protected - public with in the package, private out side the package. Outside the package can access only through inheritance. applicable to inner classes, variables, methods
default - not key word. if we do not give anything then it is default. With in the same package
*/
public class Class1 {
	public int i = 10;

	public void method1() {
		System.out.println(i);
		method2();
	}

	private int j = 20;

	private void method2() {
		System.out.println(j);
		System.out.println(i);
	}

	protected int k = 30;

	protected void method3() {
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}

	int l = 40;

	void method4() {
		System.out.println(l);
	}

}
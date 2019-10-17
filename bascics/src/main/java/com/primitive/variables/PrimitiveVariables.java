package com.primitive.variables;

public class PrimitiveVariables {

	private int i = 10;
	private float j = 1.23f;
	private double k = 10.00;
	private char l = 'c';

	public static void main(String[] args) {
		PrimitiveVariables primitiveVariables = new PrimitiveVariables();
		// we cannot acces non static members from static members(variables or methods)
		/*System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);*/

		System.out.println(primitiveVariables.i);
		System.out.println(primitiveVariables.j);
		System.out.println(primitiveVariables.k);
		System.out.println(primitiveVariables.l);

	}

}

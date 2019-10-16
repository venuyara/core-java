package com.interfaces;

/**
 * What interface can contain
 * 
 * 1. one or many abstract methods
 * 2. constants
 * 3. all methods in interface are public by default
 * 
 * from java 8:
 * 4. can have static concrete methods
 * 5. can have default concrete methods
 * 6. interface with one method is called functional interface (will be used with lambda expressions)
 * 7. We have to declare interface as functional interface using @FunctionalInterface annotation
 * 
 * @author jth9rmd
 *
 */
public interface Interface1 {

	public void method1();

	public void method2();

	public static final String NAME = "jack";

	String method3();

	Long method4();

	String NAME2 = "jill"; // public static final by default

	// static method
	static String method5() {
		System.out.println("method5");
		return NAME2;
	}

	// default method
	default String method6() {
		System.out.println("method6");
		return NAME;
	}

}
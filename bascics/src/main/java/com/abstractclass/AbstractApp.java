package com.abstractclass;

/**
 * Rules of abstract class
 * 
 * 1. We cannot create an object of abstract class
 * 2. We can create an object for concrete implementation of abstract class
 * 3. methods with implementation
 * 4. methods with only definition (also called abstract methods)
 * 5. It is not mandatory to have abstract method
 * 6. But if we have abstract method in class we must declare class as abstract class
 * 
 * @author jth9rmd
 *
 */
public abstract class AbstractApp {

	// concrete method
	public void method1() {
		System.out.println("method1");
	}

	// abstract method
	public abstract void method2();
}
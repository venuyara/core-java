package com.abstractclass;

/**
 * 1. Class that extends abstract class must implement abstract methods
 * 2. If any one of the abstract method is not implemented then class must be declared abstract
 * 
 * @author jth9rmd
 *
 */
public class AbstractAppImpl extends AbstractApp {

	@Override
	public void method2() {
		System.out.println("method2");
	}

	public static void main(String[] args) {
		// cannot create object for abstract class
		//AbstractApp abstractApp = new AbstractApp();

		AbstractAppImpl abstractAppImpl = new AbstractAppImpl();
		abstractAppImpl.method1();
		abstractAppImpl.method2();
	}

}

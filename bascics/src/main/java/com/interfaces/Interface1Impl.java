package com.interfaces;

public class Interface1Impl implements Interface1 {

	public static void main(String[] args) {
		Interface1Impl imInterface1Impl = new Interface1Impl();
		imInterface1Impl.method1();
		imInterface1Impl.method2();

		String method3Result = imInterface1Impl.method3();
		System.out.println(method3Result);

		Long method4Result = imInterface1Impl.method4();
		System.out.println(method4Result);

		String method5Result = Interface1.method5();
		System.out.println(method5Result);

		String method6Result = imInterface1Impl.method6();
		System.out.println(method6Result);
	}

	@Override
	public void method1() {
		System.out.println("method1");
	}

	@Override
	public void method2() {
		System.out.println("method2");
	}

	@Override
	public String method3() {
		System.out.println("method3");
		return Interface1.NAME;
	}

	@Override
	public Long method4() {
		System.out.println("method4");
		return 100L;
	}

}

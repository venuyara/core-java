package com.arrays;

import org.junit.Test;

import com.arrays.model.Student;

public class ArraysPractice {

	@Test
	public void declareIntArray() {
		int[] array1 = new int[3];
		System.out.println(array1);

		// add elements
		array1[0] = 1;
		array1[1] = 2;
		array1[2] = 3;

		int[] array2 = new int[] { 1, 2, 3 };
	}

	@Test
	public void declareFloatArray() {
		float[] float1 = new float[3];
		System.out.println(float1);

		float1[0] = 1;
		float1[1] = 2;
		float1[2] = 3;

		float[] float2 = new float[] { 1, 2, 3 };

	}

	@Test
	public void declareDoubleArray() {
		double[] double1 = new double[3];
		System.out.println(double1);

		double1[0] = 10.00;
		double1[1] = 22.00;
		double1[2] = 33.00;

		double[] double2 = new double[] { 10.00, 22.00, 33.00 };

	}

	@Test
	public void declareCharacterArray() {
		char[] char1 = new char[3];
		System.out.println(char1);

		char1[0] = 'a';
		char1[1] = 'b';
		char1[2] = 'c';

		char[] char2 = new char[] { 'a', 'b', 'c' };

	}

	@Test
	public void declareStringArray() {
		String[] strArray1 = new String[3];
		System.out.println(strArray1);

		strArray1[0] = "Venu";
		strArray1[1] = "Avinash";
		strArray1[2] = "Yara";

		String[] strArray2 = new String[] { "Venu", "Avinash", "Yara" };
	}

	@Test
	public void arrayLength() {
		int[] intArray = new int[3];
		System.out.println(intArray);

		int length = intArray.length;
		System.out.println(length);
	}

	@Test
	public void studentArray() {
		Student[] studentArray = new Student[3];
		System.out.println(studentArray);

		Student student = new Student();
		studentArray[0] = new Student();
		studentArray[1] = new Student();
		studentArray[3] = new Student();

		Student[] studentArray2 = new Student[] { student, student, student };

	}

	@Test
	public void iterateArrayUsingForLoop() {
		String[] strArray = new String[2];
		System.out.println(strArray);

		strArray[0] = "Yara";
		strArray[1] = "Pushpa";

		for (int i = 0; i < strArray.length; i++) {
			String value = strArray[i];
			System.out.println(value);
		}

	}

}

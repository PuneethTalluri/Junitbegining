package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void testArraysSort() {
		int[] numbers={14,5,7,2};
		int[] expected={2,5,7,14};
		Arrays.sort(numbers);
		assertEquals(expected,numbers);// this will fail the test
		assertArrayEquals(expected, numbers);// this is to compare the actual value inside the arrays
	}

}

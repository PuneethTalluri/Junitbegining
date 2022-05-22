package com.in28minutes.junit.helper;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	@Before
	public void Setup()
	{
		System.out.println("Before Test");
	}
	
	
	@Test
	public void test1() {
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2 Executed");
	}
	/*
	@After
	public void Teardown()
	{
		System.out.println("After Test");
	}
	*/
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("After Class");
	}

}

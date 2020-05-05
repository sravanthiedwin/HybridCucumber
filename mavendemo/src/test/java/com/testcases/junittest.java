package com.testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junittest {
	@BeforeClass
	public static void setup() {
		System.out.println("Beforeclass");
		
	}
	@AfterClass
	public static void taerdown() {
		System.out.println("afterclass");
		
	}
	@Test
	public void test1() {
		System.out.println("test1");
		
	}
	@Test
	public void test2() {
		System.out.println("test2");
		
	}
	@After
	public void after() {
		System.out.println("after");
		
	}
	@Before
	
	public void before() {
		System.out.println("before");
		
	}


}

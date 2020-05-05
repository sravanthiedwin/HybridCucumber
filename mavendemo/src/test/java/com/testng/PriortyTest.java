package com.testng;

import org.testng.annotations.Test;

public class PriortyTest {
	@Test(priority=2)
	public void testcase1() {
		System.out.println("testcase");
	}
	@Test(priority=3,invocationCount=3,invocationTimeOut=5)
	public void testcase2() {
		System.out.println("testcase2");
	}
@Test(priority=1)
public void testcase3() {
	System.out.println("test case3");
}
}

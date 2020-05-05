package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsonmethodTest {
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods= {"login"})
	public void search()
	
	{
		Assert.assertEquals("abc", "xyz");
		System.out.println("search");
	}
   @Test(dependsOnMethods= {"search"},alwaysRun=false)
   public void logout() {
	   
	System.out.println("logout");
}

}

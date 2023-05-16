package test01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	
	@Test
	public void testCase2() {
		
		int a = 10;
		int b = 20;
		
		String actualMessage = "Gooogle";
		String expectedMessage = "Google";
		
		Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected are not matched.");
		System.out.println("Equal Assertion Pass");
		
		Assert.assertFalse(a > b, "False Assertion Failed");
		System.out.println("False Assertion Pass");
		
		Assert.assertTrue(a > b, "True Assertion Failed");
//		Assertion Failed, Execution will stop here
//		Further line of code will not execute
		System.out.println("True Assertion Pass");
		
	}
	
	@Test
	public void testCase3() {
		
//		Assertion are written in tastCase2() method
//		Here the Scope of assertion will be limited to testCase2() method only
		System.out.println("Hello Assertion");
		
	}

}

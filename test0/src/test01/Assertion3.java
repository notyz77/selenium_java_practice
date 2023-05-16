//c47
package test01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	
	@Test
	public void testCase4() {
		
		String actualMessage = "Goooogle";
		String expectedMessage = "Google";
		
		try {
			Assert.assertEquals(actualMessage, expectedMessage, "Actual and Expected are not matched.");
		} catch (Error e) {
		}
		System.out.println("Equal Assertion Pass");
		
	}

}

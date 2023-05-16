package test01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion4 {

	@Test
	public void testCase5() {

		int i = 30;
		int j = 30;

		try {
			Assert.assertTrue(i > j);
		} catch (Error e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Assertion check");

	}

}

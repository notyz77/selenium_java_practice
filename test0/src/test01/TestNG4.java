//c45
//Skip a test case
//1) @Test(enabled = false)
//2) throw new SkipExceptiom("any message")
package test01;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {

	// @Test
	public void a() {
		System.out.println("a test method");
	}

//	Industry mostly use - recommended
	@Test(enabled = false)
	public void b() {
		System.out.println("b test method");
	}

//	Test case execution - 2 times
	@Test(invocationCount = 2)
	public void c() {
		System.out.println("c test method");
	}

//	 Currect way but not recommended
	@Test
	public void e() {
		System.out.println("e test method");
		throw new SkipException("Skiping e test method");
//			System.out.println("Unreachable code");
	}

}

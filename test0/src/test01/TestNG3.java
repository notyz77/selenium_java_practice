//c45
//Sequencing & Prioritizing:
//@Test(priority = -ve to +ve)
package test01;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority = -20)
	public void a() {
		System.out.println("a test method");
	}
	
	@Test(priority = 2)
	public void b() {
		System.out.println("b test method");
	}
	
	@Test(priority = 0)
	public void d() {
		System.out.println("d test method");
	}
	
	@Test
	public void c() {
		System.out.println("c test method");
	}

}

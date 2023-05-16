package test01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	
	WebDriver driver;
	
	@Test
	public void testCase1() throws Exception {
		
		String expectedMessage = "Sorry, we don't recognise this email address.";
		
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		
		Thread.sleep(3000);
		String actualMessage = driver.findElement(By.id("username-error")).getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println("Error Message Verified");
		
		Thread.sleep(3000);
		Assert.assertFalse(driver.findElement(By.id("username-error")).isSelected());
		System.out.println("False assertion verified");
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.findElement(By.id("username-error")).isDisplayed());
		System.out.println("True assertion verified");
		
	}

}

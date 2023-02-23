package test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaztxt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"a-button-text\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile number\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Mobile number\"]")).sendKeys("1234567898");
	}

}

package test01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkGET {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
		
	}

}

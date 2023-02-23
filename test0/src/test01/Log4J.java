package test01;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4J {

	public static void main(String[] args) {

		// Create Logger instance for which we want to create log file
		Logger logger = Logger.getLogger("Log4J");

		// Configure log4j properties file
		PropertyConfigurator.configure("/home/ap/eclipse-workspace/test0/log4j.properties");

		// Open Chrome Browser Instance
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/chromedriver");
		WebDriver driver = new ChromeDriver();
		logger.info("chrome browser instance opened");

		// Maximize the window
		driver.manage().window().maximize();
		logger.info("Maximized window");

		// Set Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		logger.info("Implicit wait given");

		// Open URL
		driver.get("https://www.facebook.com/");
		logger.info("Application Launched");

		// Check if the web element is displayed or not
		try {
			driver.findElement(By.id("email")).isDisplayed();
			logger.info("Web Element Displayed");
		} catch (Exception e) {
			logger.info("Failure - Web Element Not Displayed");
		}

	}

}

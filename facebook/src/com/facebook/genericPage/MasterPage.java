package com.facebook.genericPage;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MasterPage {

	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public Properties td;

	// Constructor
	public MasterPage() throws Exception {

		// Configuration Properties File
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "/src/com/facebook/repository/configuration.properties");
		prop = new Properties();
		prop.load(ip);

		// Locators Properties File
		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "/src/com/facebook/repository/locators.properties");
		or = new Properties();
		or.load(fs);

		// test data Properties File
		FileInputStream ts = new FileInputStream(
				System.getProperty("user.dir") + "/src/com/facebook/repository/testdata.properties");
		td = new Properties();
		td.load(ts);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/com.facebook.drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/src/com.facebook.drivers/geckodriver");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Open IE browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}

	// Click Method
	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	// Enter Data
	public void enterData(String xpathkey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(td.getProperty(testData));
	}

	// Clear Data
	public void clearData(String xpathkey, String testData) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).clear();
	}
	
	// Mouse Hover
	public void moveToElement(String xpathkey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(or.getProperty(xpathkey)))).build().perform();
	}
	
	// Click List of web element
	public void clickListElement(String xpathkey, String testData) {
		List<WebElement> radios = driver.findElements(By.xpath(or.getProperty(xpathkey)));
		for (int i = 0; i < radios.size(); i++) {
			if (radios.get(i).getText().equalsIgnoreCase(td.getProperty(testData))) {
				radios.get(i).click();
			}
		}
	}
	
	// Select Dropdown values
	public void selectDropdownValue(String xpathkey, String testData1, String testData2) {
		WebElement ele = driver.findElement(By.xpath(or.getProperty(xpathkey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(td.getProperty(testData1));
		webElem.selectByValue(td.getProperty(testData2));
	}
	
}

//c46
package test01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG7 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	
	@DataProvider
	public Object[][] dataSet() throws Exception {
		
//		specify the property file location
		File src = new File(
				"/home/ap/repo/selenium_java_practice/facebook/src/com/facebook/repository/testdata.properties");
		
//		Create FileInputStream class object to read the file
		FileInputStream fis = new FileInputStream(src);
		
//		Create Property class object to read the file
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][] = new Object[3][2];
		
		arr[0][0] = pro.getProperty("testData1");
		arr[0][1] = pro.getProperty("testData2");
		
		arr[1][0] = "Email_2";
		arr[1][1] = "Password_2";
		
		arr[2][0] = "Email_3";
		arr[2][1] = "Password_3";
		
		return arr;
		
	}
	
	@Test(dataProvider = "dataSet")
	public void enterData(String userName, String password) throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys(userName);
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.navigate().back();
	}

}

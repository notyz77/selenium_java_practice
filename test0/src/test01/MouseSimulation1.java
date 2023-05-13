//c36
package test01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {
	
	public static void main(String[] args) throws Exception {
		
//		Setting the property of chrome browser and passing chromeDriver path
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Thread.sleep(3000);
		
//		Create Web Element Reference
		WebElement Electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
		
//		Mouse Simulation using Action class
		Actions act = new Actions(driver);
		
//		Mouse Hover to Electronics Web Element
		Thread.sleep(3000);
		act.moveToElement(Electro).build().perform();
		
//		Right click on Web Element
		Thread.sleep(3000);
		act.contextClick().build().perform();
		
//		Perform Key Events
		Thread.sleep(3000);
		act.sendKeys(Keys.ENTER).build().perform();
		System.out.println("Enter Pressed");
		
//		Press Enter key to Home Web Element
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		Thread.sleep(3000);
		act.sendKeys(Home, Keys.ENTER).build().perform();
		System.out.println("Home Option Clicked");
		
	}
	
}

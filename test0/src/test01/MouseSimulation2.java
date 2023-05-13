//c36
package test01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {
	
	public static void main(String[] args) throws Exception {
		
//		Setting the property of chrome browser and passing chromeDriver path
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
//		Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames :- " + allFrames.size());
		driver.switchTo().frame(0);
		
//		draggable Web Element
		WebElement draggable = driver.findElement(By.id("draggable"));
		
//		droppable Web element
		WebElement droppable = driver.findElement(By.id("droppable"));
		
//		Drag and Drop using Action class
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		System.out.println("drag is completed");
		
	}
	
}

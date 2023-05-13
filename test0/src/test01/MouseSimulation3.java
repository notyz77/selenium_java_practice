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

public class MouseSimulation3 {
	
	public static void main(String[] args) throws Exception {
		
//		Setting the property of chrome browser and passing chromeDriver path
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
//		Switching Frame
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		System.out.println("Total Frames :- " + allFrames.size());
		driver.switchTo().frame(0);
		
//		draggable Web Element
		WebElement draggable = driver.findElement(By.id("draggable"));
		
//		Drag and Drop using Action class
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(draggable, 100, 40).build().perform();
		
//		Drag the Web Element and click and hold using coordinates
		Thread.sleep(3000);
		act.clickAndHold(draggable).dragAndDropBy(draggable, 100, 40).build().perform();
		
	}
	
}

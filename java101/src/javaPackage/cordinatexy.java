package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class cordinatexy {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver", "/home/ap/Downloads/selenium_files/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com");
		
		Actions act = new Actions(driver);
		
//		search a movies name and click enter key
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys("2007 movies");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		
		WebElement ele= driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div/div/div/div/div/div/div/div[2]/div/ol/li[1]/div/a/div[1]/div/img"));
		Point point = ele.getLocation();
		int xcord = point.getX();
		int ycord = point.getY();
		System.out.println(xcord + " " + ycord);

	}

}

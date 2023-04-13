package javaPackage;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.Random;

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

public class edge {

	public static void main(String[] args) throws Exception{
		final String[] proper_noun = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		System.out.println(proper_noun[index] + " movies");
		
		System.setProperty("webdriver.edge.driver", "/home/ap/Downloads/selenium_files/msedgedriver");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bing.com");
		
		Actions act = new Actions(driver);
		
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[@class=\"sw_spd id_avatar\"]")).click();
//		Thread.sleep(2000);
//		driver.
		
//		search a movies name and click enter key
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(proper_noun[index] + " movies");
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).build().perform();
		
//		ramdam select any movies
		List<WebElement> allmov = driver.findElements(By.xpath("//li[@data-priority=\"2\"]"));
		Thread.sleep(2000);
		System.out.println("Total movies =" + allmov.size());
		
//		random number win and press the arrow according to random number.
		int[] wn = {1, 2, 3, 5};
		int index1 = random.nextInt(wn.length);
		int index2 = random.nextInt(wn.length);
		System.out.println(wn[index1]);
		System.out.println(wn[index2]);
//		System.out.println(random.nextInt(wn.length));
//		int vx = wn[index1];
		
//		edge eg = new edge();
//		eg.wn1();
		
		Thread.sleep(2000);
//		driver.findElement(By.className("carouselChevron carouselChevRightSvg")).click();
//		driver.findElement(By.xpath("//span[@class=\"carouselChevron carouselChevRightSvg \"]")).click();
		int i=0;
		do {
			driver.findElement(By.xpath("//span[@class=\"carouselChevron carouselChevRightSvg \"]")).click();
			Thread.sleep(1000);
			i++;
		}
		while (i <= wn[index1]);
		
		Thread.sleep(1000);
		
		do {
			driver.findElement(By.xpath("//span[@class=\"carouselChevron carouselChevLeftSvg \"]")).click();
			Thread.sleep(1000);
			i++;
		}
		while (i <= 2);
		
		act.moveByOffset(180, 232).click().build().perform();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"b_pole\"]/div/div[1]/div/div/div/div/a[2]"));
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).click();
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		String copyAll = Keys.chord(Keys.CONTROL, "c");
		String pastAll = Keys.chord(Keys.CONTROL, "v");
		String enter1 = Keys.chord(Keys.ENTER);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + copyAll);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " cast" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " watch" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " trailers and clips" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " plot" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " reviews" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " awards" + enter1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " characters" + enter1);
		
	}

}

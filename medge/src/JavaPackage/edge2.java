package JavaPackage;

import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.exec.OS;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;


public class edge2 {
	
	public static WebDriver driver;
//	public Properties prop;
//	public Properties td;
	
	private void showon() throws Exception {
		final String[] proper_noun = {"1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022"};
		Random random = new Random();
		int index = random.nextInt(proper_noun.length);
		System.out.println(proper_noun[index] + " movies");
		
		String osname = System.getProperty("os.name");
		
		System.out.println(osname);
		
		if (osname.matches("Linux")) {
			System.out.println("linux in");
			System.setProperty("webdriver.edge.driver", "/home/ap/Downloads/selenium_files/msedgedriver");
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("user-data-dir=/home/ap/.config/microsoft-edge");
			eo.addArguments("--profile-directory=Default");
			driver = new EdgeDriver(eo);
		} else if (osname.matches(null)) {
			
		}
		
//		System.setProperty("webdriver.edge.driver", "/home/ap/Downloads/selenium_files/msedgedriver");
//		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("user-data-dir=/home/ap/.config/microsoft-edge");
//		eo.addArguments("--profile-directory=Default");
//		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://www.bing.com");
		
//		define hotkeys and driver keys
		Actions act = new Actions(driver);
		
		String selectAll = Keys.chord(Keys.CONTROL, "a");
		String copyAll = Keys.chord(Keys.CONTROL, "c");
		String pastAll = Keys.chord(Keys.CONTROL, "v");
		String enter1 = Keys.chord(Keys.ENTER);
		
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
		
		Thread.sleep(2000);
		
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

		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).click();
		
		driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + copyAll);
		
		
		for (char c = 'A'; c <= 'Z'; c++) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//textarea[@id=\"sb_form_q\"]")).sendKeys(selectAll + pastAll + " " + c + enter1);
		}

	}
	
	public static void main(String[] args) throws Exception {
		
		edge2 ed2 = new edge2();
		ed2.showon();
		Thread.sleep(2000);
//		ed2.showon();
		
	}
}

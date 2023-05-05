//c35
package test01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
//		Create list - allCompanies
		List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("Total Companies = " + allCompanies.size());
		
//		Create List - currentPrice
		List<WebElement> curPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current Price = " + curPrice.size());
		
		String expCompanieName = "IZMO";
		
		for (int i = 0; i < allCompanies.size(); i++) {
			
			if (allCompanies.get(i).getText().equalsIgnoreCase(expCompanieName)) {
				
				System.out.println(allCompanies.get(i).getText() + " = " + curPrice.get(i).getText());
				allCompanies.get(i).click();
				break;
				
			}
			
		}
	}

}

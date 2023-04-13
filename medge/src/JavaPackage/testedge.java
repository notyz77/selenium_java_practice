package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class testedge {
	public static void main(String[] args) { 
        System.setProperty("webdriver.edge.driver", "/home/ap/Downloads/selenium_files/msedgedriver"); 
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("user-data-dir=/home/ap/.config/microsoft-edge");
        edgeOptions.addArguments("--profile-directory=Default");
//        edgeOptions.addArguments("--start-maximized --flag-switches-begin --flag-switches-end");
        edgeOptions.addArguments("--start-maximized");
        WebDriver driver = new EdgeDriver(edgeOptions); 
        driver.get("https://www.bing.com");
    }

}

package JavaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/ap/Downloads/selenium_files/ChromeDriver/chromedriver");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--user-data-dir=/home/ap/.config/google-chrome");
    //load default profile
    options.addArguments("--profile-directory=Default");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.google.com");
}
}

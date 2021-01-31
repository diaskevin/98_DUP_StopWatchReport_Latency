package b_FirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\Kevin.dias\\Equinox\\SELENIUM\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}

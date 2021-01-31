package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a2_WebDriver_FirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kevin.dias\\Learn-Cloud\\GoogleMyDrive\\Referenced Libraries\\Selenium\\SeleniumDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		driver.quit();
	}

}

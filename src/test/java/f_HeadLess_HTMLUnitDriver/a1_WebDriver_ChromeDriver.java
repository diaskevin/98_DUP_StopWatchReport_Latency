package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1_WebDriver_ChromeDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kevin.dias\\Learn-Cloud\\GoogleMyDrive\\Referenced Libraries\\Selenium\\SeleniumDrivers\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.quit();
	}

}
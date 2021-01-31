package f_HeadLess_HTMLUnitDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class a3_WebDriver_HtmlUnitDriver {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kevin.dias\\Learn-Cloud\\GoogleMyDrive\\Referenced Libraries\\Selenium\\SeleniumDrivers\\chromedriver.exe"); 
		//WebDriver driver = new ();
		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com");
		String browserTitle = driver.getTitle();
		System.out.println("Browser Title: " + browserTitle);
		driver.quit();
	}

}
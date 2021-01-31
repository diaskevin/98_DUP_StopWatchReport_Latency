package c_InternetExplorerEBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",  "C:\\Users\\Kevin.dias\\Equinox\\SELENIUM\\SeleniumDrivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}

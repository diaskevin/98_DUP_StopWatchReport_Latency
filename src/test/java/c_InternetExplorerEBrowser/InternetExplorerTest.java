package c_InternetExplorerEBrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerTest {

	@Test
	public void internetexplorer_test() {
		System.setProperty("webdriver.ie.driver",  "D:\\02_Kevin\\qa\\Selenium\\IEdriver\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}

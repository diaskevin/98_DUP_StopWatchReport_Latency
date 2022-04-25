package e_OperaBrowser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class OperaTest {

	@Test
	public void opera_test() {
		System.setProperty("webdriver.opera.driver",  "D:\\02_Kevin\\qa\\Selenium\\operadriver\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("http://google.com");
		
		String title = driver.getTitle();
		System.out.println("Browser title: " +title);
		
		driver.quit();
	}	
}
